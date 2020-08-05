package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

//    @GetMapping("/users")
//    public List<UserResponse> getAllUser(){
//        List<UserResponse> userResponseList = new ArrayList<>();
//        userResponseList.add(new UserResponse(1, "User 1"));
//        userResponseList.add(new UserResponse(2, "User 2"));
//        userResponseList.add(new UserResponse(3, "User 3"));
//        return userResponseList;
//    }


    @GetMapping("/user?")
    @ResponseBody
    public UserResponse getUserWithPages(@RequestParam(required = false,defaultValue = "2") int page,
                                         @RequestParam(name = "item_per_page",required = false,defaultValue = "15") int itemPerPage){
        return new UserResponse(page,itemPerPage);
    }

//    @GetMapping("/users/{id}")
//    public UserResponse getUserByID(@PathVariable int id){
//        return new UserResponse(id,"User " + id);
//    }

}
