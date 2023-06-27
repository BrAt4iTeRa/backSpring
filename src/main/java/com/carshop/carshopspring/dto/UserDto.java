package com.carshop.carshopspring.dto;

import com.carshop.carshopspring.entity.Order;
import com.carshop.carshopspring.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class UserDto {
    private int userId;
    private String userEmail;
    private String userPhone;
    private String userName;
    private Set<Order> orders;


    public UserDto (int userId, String userEmail, String userPhone, String userName, Set<Order> orders){
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userId = userId;
        this.orders = orders;
    }

}
