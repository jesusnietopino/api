package com.tfg.apirest;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class simpleConsumer {

    public String datos;
    @KafkaListener(id = "myID",topics = "demo_java")
    public void stringListener(String data){
        System.out.println(data + " desde listener");
    }

    public String getDatos(){
        return datos;
    }
}
