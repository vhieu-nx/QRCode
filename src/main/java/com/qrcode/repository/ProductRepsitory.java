package com.qrcode.repository;

import com.qrcode.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepsitory extends CrudRepository<Product, String> {
}
