package com.istl.domainconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.istl.domainconsumer.model.Domain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import java.io.IOException;

@SpringBootApplication
public class DomainConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainConsumerApplication.class, args);
	}

	@KafkaListener(topics = "web-domains", groupId = "web-domains")
	public void listenGroupFoo(String domain) throws IOException, Exception
	{
		ObjectMapper MAPPER = new ObjectMapper();
		Domain domain1 = MAPPER.readValue(domain,Domain.class);
		System.out.println("Received Message in group web-domains: " + domain1.getDomain());
	}

}
