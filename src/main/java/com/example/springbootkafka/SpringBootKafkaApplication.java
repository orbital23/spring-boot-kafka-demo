package com.example.springbootkafka;

import com.example.springbootkafka.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class SpringBootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaApplication.class, args);
	}

	@KafkaListener(topics = "demo-topic1", groupId = "demo-group1")
	public void listen(User user) {

		System.out.println("Received User information : " + user);
	}

}
