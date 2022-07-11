package com.project.trabjava.serasinha.application;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api")
public class RestAPI extends ResourceConfig {

	public RestAPI() {

//		register(TransactionService.class);
		packages("com.project.trabjava.serasinha.service");
	}

}