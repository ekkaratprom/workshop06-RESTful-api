package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public UserResponse createNewUser(@RequestBody NewUserRequest request){
        // Validate input
        // Create new user in Database ==> ไม่ใช่หน้าที่ของ controller ==> สร้าง layer ใหม่ในการทำงานคือ "Repository" ทำหน้าที่บันทึกข้อมูลลง database
        User user = new User();
        user.setName(request.getName());
        user.setAge(request.getAge());
        user = userRepository.save(user);
        return new UserResponse(user.getId(),user.getName() + user.getAge());

    }

    @GetMapping("/users")
    public PagingResponse getAllUser(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(name = "item_per_page",defaultValue = "10") int itemPerPage){

        PagingResponse pagingResponse = new PagingResponse(page, itemPerPage);

        List<UserResponse> userResponseList = new ArrayList<>();

        List<User> users = (List<User>) userRepository.findAll();
        for (User user: users) {
            userResponseList.add(new UserResponse(user.getId(),user.getName()));
        }

        pagingResponse.setUserResponse(userResponseList); //ออกแบบเพิ่มเติม
        return pagingResponse;
    }

    @GetMapping("/users/{id}")
    public UserResponse getUserByID(@PathVariable int id){
        return new UserResponse(id,"User " + id);
    }



    @PostMapping("/user1")
    public String createNewUserWithFormatData(NewUserRequest request){
        return request.getName() + request.getAge();
    }

}
