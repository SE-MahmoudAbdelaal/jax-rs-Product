package org.eclipse.jakarta.hello.repo;

import jakarta.ejb.Singleton;
import org.eclipse.jakarta.hello.model.Product;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class ProductMemoryRepo implements ProductRepo {
    List<Product> products =new ArrayList<>();
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void add(  Product product) {
        product.setId(products.size());
        products.add(product);

    }

    @Override
    public Product find() {
        return null;
    }

    @Override
    public void delete() {

    }
}
