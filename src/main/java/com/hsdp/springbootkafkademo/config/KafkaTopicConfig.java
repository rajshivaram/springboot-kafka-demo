package com.hsdp.springbootkafkademo.config;

import org.springframework.beans.factory.annotation.Value;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spring.kafka.topic-json.name}")
    private String topicJsonName;

    @Bean
    public NewTopic hsdpTopic(){
        return TopicBuilder.name(topicName).partitions(6).build();
    }

    @Bean
    public NewTopic hsdpJsonTopic(){
        return TopicBuilder.name(topicJsonName).partitions(6).build();
    }
}
