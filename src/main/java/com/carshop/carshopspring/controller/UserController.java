package com.carshop.carshopspring.controller;

import com.carshop.carshopspring.dto.UserDto;
import com.carshop.carshopspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<UserDto> getUserInfo(){
        return userService.getAllUserInf();
    }
}
