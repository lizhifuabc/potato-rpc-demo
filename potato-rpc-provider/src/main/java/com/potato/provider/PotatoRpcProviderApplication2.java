package com.potato.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
@PropertySource(value = {"classpath:application2.properties"})
public class PotatoRpcProviderApplication2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("spring.config.name", "application2");
		Properties properties = new Properties();
		InputStream in = PotatoRpcProviderApplication2.class
				.getClassLoader()
				.getResourceAsStream("application2.properties");
		properties.load(in);
		SpringApplication application = new SpringApplication(PotatoRpcProviderApplication2.class);
		application.setDefaultProperties(properties);
		application.run(args);
	}

}
