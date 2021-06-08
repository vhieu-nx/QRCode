package com.qrcode.service;

import com.qrcode.entity.Product;

public interface ProductService {
    public Iterable<Product> findAll();
}
