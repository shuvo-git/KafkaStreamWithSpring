package com.istl.domaincrawler;

import com.istl.domaincrawler.model.Domain;
import com.istl.domaincrawler.model.DomainList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class DomainCrawlerService {

    private final KafkaTemplate<String, Domain> kafkaTemplate;
    private final String KAFKA_TOPIC = "web-domains";

    @Autowired
    public DomainCrawlerService(KafkaTemplate<String, Domain> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void crawl(String name)
    {
        final String apiUrl = "https://api.domainsdb.info/v1/domains/search?domain=" + name;

        Mono<DomainList> domainListMono = WebClient.create().get()
                .uri(apiUrl)
                .accept(MediaType.TEXT_PLAIN)
                .retrieve()
                .bodyToMono(DomainList.class);

        domainListMono.subscribe(domainList -> {
            domainList.getDomains()
                .forEach(domain -> {
                    kafkaTemplate.send(KAFKA_TOPIC,domain);
                    System.out.println("[Sending message to Kafka Topic: ]"+domain.getDomain());
                });
        });

    }
}
