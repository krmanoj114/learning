package com.manoj.kafkaproducerdemo.service;

import com.manoj.kafkaproducerdemo.dto.UserDTO;
import com.manoj.kafkaproducerdemo.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Value("${topic.name.producer}")
    private String topic;


    public void sendMessage(UserDTO user){
        System.out.println("Before calling :"+user.toString());
        String message = JsonUtil.convertObjToJsonStr(user);
        ListenableFuture<SendResult<String, String>> send = kafkaTemplate.send(topic, message);
        send.completable().whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + user +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" +
                        user + "] due to : " + ex.getMessage());
            }
        });

        System.out.println("After calling :"+user.toString());
    }

    /*private String convertObjectToJson(UserDTO user) {
        String message = "";
        if(user != null){
            ObjectMapper mapper = new ObjectMapper();
            try {
                message = mapper.writeValueAsString(user);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        return message;
    }*/


}
