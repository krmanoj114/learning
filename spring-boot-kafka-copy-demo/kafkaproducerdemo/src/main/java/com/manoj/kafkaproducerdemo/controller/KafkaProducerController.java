package com.manoj.kafkaproducerdemo.controller;

import com.manoj.kafkaproducerdemo.dto.UserDTO;
import com.manoj.kafkaproducerdemo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class KafkaProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping(value = "/produceMessages")
    public void sendMessageToTopic(@RequestBody UserDTO user){
        producerService.sendMessage(user);
    }


}
