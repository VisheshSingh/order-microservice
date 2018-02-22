package com.vishesh.mcs.orderms;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OrderApplicationConfig {
	@Named
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig() {
			this.packages("com.vishesh.mcs.orderms.rest");
		}
	}

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate rt = new RestTemplate();
		return rt;
	}
}
