package com.istl.domainconsumer;

import com.istl.domainconsumer.model.Domain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class DomainConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainConsumerApplication.class, args);
	}

	@KafkaListener(id = "MyId", topics = "web-domains", groupId = "web-domains")
	public void listenGroupFoo(Domain domain) {

		System.out.println("Received Message in group foo: " + domain);
	}

}
