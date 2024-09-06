package com.tharindu.Ecom_Project.service;

import com.tharindu.Ecom_Project.model.Product;
import com.tharindu.Ecom_Project.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

}
