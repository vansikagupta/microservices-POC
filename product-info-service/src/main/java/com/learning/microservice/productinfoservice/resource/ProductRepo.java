package com.learning.microservice.productinfoservice.resource;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.microservice.productinfoservice.model.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, String>{

	Optional<Product> findByProductId(String productId);

}
