package com.carshop.carshopspring.repository;

import com.carshop.carshopspring.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepos extends CrudRepository <User, Integer> {
}
