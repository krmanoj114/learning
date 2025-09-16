package com.manoj.kafkaproducerdemo;

import org.springframework.boot	.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaproducerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaproducerdemoApplication.class, args);
	}

}
