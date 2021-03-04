package com.example.KafkaConsumer.demo.listeners;


import com.example.KafkaConsumer.demo.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {


    @KafkaListener(topics = "Kafka_Example_User", groupId = "user_group",containerFactory = "userKafkaListenerFactory")
    public void consumerJson (User user){
        System.out.println("Consumed User:\t" + user );

    }

}
