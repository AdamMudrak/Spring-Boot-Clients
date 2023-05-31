package com.example.app.SpringBootClients;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootClientsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootClientsApplication.class, args);
		new SpringApplicationBuilder(SpringBootClientsApplication.class)
				.bannerMode(Banner.Mode.OFF)
						.run(args);
		System.out.println("Running...");
	}

}
