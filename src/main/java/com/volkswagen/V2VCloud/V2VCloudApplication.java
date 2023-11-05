package com.volkswagen.V2VCloud;

import jakarta.annotation.sql.DataSourceDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class V2VCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(V2VCloudApplication.class, args);
	}

}
