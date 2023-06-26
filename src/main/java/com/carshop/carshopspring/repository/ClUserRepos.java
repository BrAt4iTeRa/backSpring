package com.carshop.carshopspring.repository;

import com.carshop.carshopspring.entity.ClUser;
import org.springframework.data.repository.CrudRepository;

public interface ClUserRepos extends CrudRepository <ClUser, Integer> {
}
