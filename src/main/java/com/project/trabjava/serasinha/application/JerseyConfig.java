package com.project.trabjava.serasinha.application;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;



@Configuration
public class JerseyConfig extends ResourceConfig {

    JerseyConfig() {

        register(com.project.trabjava.serasinha.service.TransactionService.class);
	}
}