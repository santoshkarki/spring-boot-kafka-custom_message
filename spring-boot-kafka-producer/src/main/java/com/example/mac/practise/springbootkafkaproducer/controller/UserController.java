package com.example.mac.practise.springbootkafkaproducer.controller;

import com.example.mac.practise.springbootkafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class UserController {



   @Autowired
   @Qualifier("userKafkaTemplate")
   private KafkaTemplate<String, User> userKafkaTemplate;

    private static final String TOPIC = "san";


    /*Produce message of type User*/
    @PostMapping("/publish")
    public String postMessage(@RequestBody User user){
        userKafkaTemplate.send(TOPIC, user);
        return "published successfully";
    }
}
