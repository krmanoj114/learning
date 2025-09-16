package com.manoj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class KafkaMessagePublisher {
    @Autowired
    private KafkaTemplate<String, Object> template;

    public  void sendMessageToTopic(String message){
        ListenableFuture<SendResult<String, Object>> future = template.send("study-demo",  message);
        future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {

            @Override
            public void onSuccess(SendResult<String, Object> result) {
                System.out.println("Sent message = ["+message+"]with offset =[" + result.getRecordMetadata().offset()+"]");

            }

            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Unable to send message due to error" + ex.getMessage());
            }

        });

    }
}
