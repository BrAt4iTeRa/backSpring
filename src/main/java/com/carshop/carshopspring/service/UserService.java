package com.carshop.carshopspring.service;

import com.carshop.carshopspring.dto.UserDto;
import com.carshop.carshopspring.entity.User;
import com.carshop.carshopspring.repository.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepos userRepos;

    public Set<UserDto> getAllUserInf(){

        Set<UserDto> usersDto = convertToUserDto(userRepos.findAll());
        return usersDto;
    }

    public UserDto convertToUserDto (User user){
        UserDto userDto = new UserDto(user.getUserId(), user.getUserEmail(), user.getUserPhone(),
                user.getUserName(),user.getOrders());
        return userDto;
    }
    public Set<UserDto> convertToUserDto (Iterable<User> users){
        Set<UserDto> usersDto = new HashSet<>();
        for (User user: users) {
            usersDto.add(new UserDto(user.getUserId(), user.getUserEmail(),
                    user.getUserPhone(), user.getUserName(), user.getOrders()));
        }
        return usersDto;
    }

}
