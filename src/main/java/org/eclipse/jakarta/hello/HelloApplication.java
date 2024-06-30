package org.eclipse.jakarta.hello;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.MediaType;

@ApplicationPath("api/v1")
public class HelloApplication extends Application {
}
