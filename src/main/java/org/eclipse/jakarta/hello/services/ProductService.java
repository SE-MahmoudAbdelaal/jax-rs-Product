package org.eclipse.jakarta.hello.services;

import org.eclipse.jakarta.hello.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void add(Product product);
    Product find();
    void delete();
}
