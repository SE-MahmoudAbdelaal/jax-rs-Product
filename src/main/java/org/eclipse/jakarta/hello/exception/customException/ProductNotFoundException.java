package org.eclipse.jakarta.hello.exception.customException;

import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(Response.status(Response.Status.NOT_FOUND).entity(message).build().toString());
    }
}