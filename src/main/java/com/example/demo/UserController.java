package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public String getUserWithPages(@RequestParam(required = false,defaultValue = "2") String page,
                                   @RequestParam(name = "item_per_page",required = false,defaultValue = "15") String itemPerPage){
        return "page=" + page + "item_per_page=" + itemPerPage;
    }

    @GetMapping("/users/{id}")
    public UserResponse getUserByID(@PathVariable int id){
        return new UserResponse(id,"User " + id);
    }

}
