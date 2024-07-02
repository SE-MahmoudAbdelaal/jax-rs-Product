package com.product.jax.productjax.exception;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.eclipse.jakarta.hello.exception.ProductErrorResponse;
import org.eclipse.jakarta.hello.exception.customException.ProductNotFoundException;


@Provider
public class ProductRestExceptionHandler implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable exception) {
     if (exception instanceof ProductNotFoundException) {
            ProductErrorResponse errorResponse = new ProductErrorResponse(Response.Status.NOT_FOUND.getStatusCode(), exception.getMessage());
            return Response.status(Response.Status.NOT_FOUND)
                    .entity(errorResponse)
                    .build();
        } else {
            ProductErrorResponse errorResponse = new ProductErrorResponse(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), "Internal server error: " + exception.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(errorResponse)
                    .build();
        }
    }
}
