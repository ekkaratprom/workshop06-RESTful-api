package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<UserResponse> getAllUser(
            @RequestParam(defaultValue = "2") String page,
            @RequestParam(name = "item_per_page",defaultValue = "10") String itemPerPage){
        PagingResponse pagingResponse = new PagingResponse(page,itemPerPage);

        List<UserResponse> userResponseList = new ArrayList<>();
        userResponseList.add(new UserResponse(1, "User 1"));
        userResponseList.add(new UserResponse(2, "User 2"));
        userResponseList.add(new UserResponse(3, "User 3"));

        pagingResponse.setUsersResponse(userResponseList); //ออกแบบเพิ่มเติม
        return userResponseList;
    }

    @GetMapping("/users/{id}")
    public UserResponse getUserByID(@PathVariable int id){
        return new UserResponse(id,"User " + id);
    }
}
