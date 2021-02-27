package com.vanaru.labs.dev.indx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KafkaProducerForClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerForClusterApplication.class, args);
	}

}
