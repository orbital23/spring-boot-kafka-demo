package com.example.springbootkafka.controller;

import com.example.springbootkafka.model.User;
import com.example.springbootkafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo-kafka/")
public class KafkaExampleController {

    @Autowired
    KafkaProducerService kafkaProducer;

    @PostMapping("/producer")
    public String sendMessage(@RequestBody User user) {
        kafkaProducer.send(user);
        return "Message sent successfully to the Kafka topic demo-topic1";
    }
}
