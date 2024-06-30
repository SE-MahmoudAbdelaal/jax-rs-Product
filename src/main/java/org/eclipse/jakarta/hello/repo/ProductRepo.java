package org.eclipse.jakarta.hello.repo;

import org.eclipse.jakarta.hello.model.Product;

import java.util.List;

public interface ProductRepo {
    List<Product> findAll();
    void add(Product product);
    Product find();
    void delete();
}
