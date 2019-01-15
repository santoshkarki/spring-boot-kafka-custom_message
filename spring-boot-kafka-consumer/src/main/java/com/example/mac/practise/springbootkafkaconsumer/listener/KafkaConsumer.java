package com.example.mac.practise.springbootkafkaconsumer.listener;

import com.example.mac.practise.springbootkafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    /*@KafkaListener(topics="topic1", containerFactory = "kafkaListenerContainerFactory")
    public void consumeString(String message){
        System.out.println("Consumed String message:"+ message);
    }*/

    @KafkaListener(topics="san", containerFactory = "userKafkaListenerFactory")
    public void consumeUserObject(User user){
        System.out.println("Consumed JSON message:"+ user);
    }
}
