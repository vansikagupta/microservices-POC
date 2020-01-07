package com.learning.microservice.cartdataservice;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.learning.microservice.cartdataservice.model.CartProduct;
import com.learning.microservice.cartdataservice.model.UserCart;
import com.learning.microservice.cartdataservice.repository.UserCartRepo;

@SpringBootApplication
@EnableEurekaClient
public class CartDataServiceApplication {
	
	//@Autowired
	//UserCartRepo userCartRepo;

	public static void main(String[] args) {
		SpringApplication.run(CartDataServiceApplication.class, args);
	}
	/*
	 * Only for the first run so that DB gets populated
	@PostConstruct
    public void init(){
        List<CartProduct> cart_list1 = Arrays.asList(new CartProduct("prod1.1",2),
        											new CartProduct("prod4.4",1),
        											new CartProduct("prod3.3",3));
        
        List<CartProduct> cart_list2 = Arrays.asList(new CartProduct("prod1.1",3));
        
        List<CartProduct> cart_list3 = Arrays.asList(new CartProduct("prod2.2",2),
													new CartProduct("prod3.3",1),
													new CartProduct("prod5.5",3));
        
        List<CartProduct> cart_list4 = Arrays.asList(new CartProduct("prod1.1",2),
													new CartProduct("prod4.4",1),
													new CartProduct("prod2.2",2),
													new CartProduct("prod5.5",1));
        
        UserCart userCart1 = new UserCart("user1.1",cart_list1);
        UserCart userCart2 = new UserCart("user2.2",cart_list2);
        UserCart userCart3 = new UserCart("user3.3",cart_list3);
        UserCart userCart4 = new UserCart("user4.4",cart_list4);
        
        List<UserCart> userCartList = Arrays.asList(userCart1,userCart2,userCart3,userCart4);
        
        userCartRepo.saveAll(userCartList);
    }
    */
}
