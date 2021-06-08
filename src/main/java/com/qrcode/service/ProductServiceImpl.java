package com.qrcode.service;

import com.qrcode.entity.Product;
import com.qrcode.repository.ProductRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepsitory productRepsitory;

    @Override
    public Iterable<Product> findAll() {
        return productRepsitory.findAll();
    }
}
