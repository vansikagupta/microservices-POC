package com.learning.microservice.cartdataservice.resources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.microservice.cartdataservice.model.UserCart;

@Repository
public interface UserCartRepo extends JpaRepository<UserCart, String>{

}
