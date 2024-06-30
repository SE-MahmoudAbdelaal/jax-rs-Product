package org.eclipse.jakarta.hello.rest;

import jakarta.ejb.Singleton;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.jakarta.hello.model.Product;
import org.eclipse.jakarta.hello.services.ProductService;

import java.util.List;

@Path("Product")
@Singleton
public class ProductResource {
    @Inject
    ProductService productService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> findAll(){
        return productService.findAll();
    }

    @POST
    public void add( @Valid Product product){
        productService.add(product);

    }

}
