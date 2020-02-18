package com.ibrahni.config;

import org.glassfish.jersey.server.ResourceConfig;

public class BloggerApplication extends ResourceConfig {
    private static final String SERVICE_DEFINITION_PACKAGE = "com.ibrahni";

    public BloggerApplication() {
        packages(SERVICE_DEFINITION_PACKAGE);
    }
}
