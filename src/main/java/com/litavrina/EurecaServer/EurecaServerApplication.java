package com.litavrina.EurecaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
// доступен по адресу http://localhost:8761/
@EnableEurekaServer
@SpringBootApplication
public class EurecaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurecaServerApplication.class, args);
	}

}
