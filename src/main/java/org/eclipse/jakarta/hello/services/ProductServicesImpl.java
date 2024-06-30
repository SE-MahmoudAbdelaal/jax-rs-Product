package org.eclipse.jakarta.hello.services;

import jakarta.ejb.Singleton;
import jakarta.inject.Inject;
import org.eclipse.jakarta.hello.model.Product;
import org.eclipse.jakarta.hello.repo.ProductRepo;

import java.util.List;
@Singleton
public class ProductServicesImpl implements ProductService {
    @Inject
    ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return  productRepo.findAll();
    }

    @Override
    public void add(Product product) {
        productRepo.add(product);

    }

    @Override
    public Product find() {
        return null;
    }

    @Override
    public void delete() {

    }
}
