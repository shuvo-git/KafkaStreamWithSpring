package com.istl.domainconsumer;

import com.istl.domainconsumer.model.Domain;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

//@Configuration
//@EnableKafka
public class KafkaConsumerConfig {


//    @Bean
//    public NewTopic topic() {
//        return TopicBuilder.name("web-domains")
//                .partitions(1)
//                .replicas(1)
//                .build();
//    }

//    @KafkaListener(id = "myId", topics = "web-domains")
//    public void listen(String in) {
//        System.out.println(in);
//    }


    /*
    @Bean

    public ConsumerFactory<String, Domain> consumerFactory()
    {
         Map<String, Object> props = new HashMap<>();
         props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
         props.put(ConsumerConfig.GROUP_ID_CONFIG, "web-domains");
         props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
         props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);

        //return new DefaultKafkaConsumerFactory<>(props);

        return new DefaultKafkaConsumerFactory<>(
                props,
                new StringDeserializer(),
                new JsonDeserializer<>(Domain.class,false)
        );
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Domain> kafkaListenerContainerFactory()
    {
        ConcurrentKafkaListenerContainerFactory<String, Domain> factory
                = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());


        return factory;
    }
    */


//    @Bean
//    public ConcurrentKafkaListenerContainerFactory kafkaListenerContainerFactory
//            (ConcurrentKafkaListenerContainerFactoryConfigurer configurer,ConsumerFactory<String, Domain> kafkaConsumerFactory)
//    {
//        ConcurrentKafkaListenerContainerFactory<String, Domain> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        configurer.configure(factory, kafkaConsumerFactory);
//        factory.setErrorHandler(new SeekToCurrentErrorHandler()); // <<<<<<
//        return factory;
//    }




}
