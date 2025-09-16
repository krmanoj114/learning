package com.manoj.kafkaproducerdemo.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.consumer.bootstrap-servers}")
    private String bootstrapAddress;
    @Value("${topic.name.producer}")
    private String barcodescanner;

    @Bean
    public KafkaAdmin kafkaAdmin(){
        Map<String, Object> config = new HashMap<>();
        config.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return  new KafkaAdmin(config);
    }

    @Bean
    public NewTopic topic1(){
        return new NewTopic(barcodescanner, 1, (short) 1);
    }

}
