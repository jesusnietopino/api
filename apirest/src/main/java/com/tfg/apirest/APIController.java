package com.tfg.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class APIController {


    @GetMapping("/producir")
    public String producir(@RequestParam(value = "myName", defaultValue = "World") String name) {
        simpleProducer productor = new simpleProducer();
        productor.producerMessage("test");
        return String.format("Hello %s!", name);

    }
    @GetMapping("/login")
    public String login(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);

    }

   // @GetMapping("/consumir")
  //  public String consumir() {
       // simpleConsumer consumer = new simpleConsumer();
       // return String.format("Hello %s!", name);
       // System.out.println(consumer.getDatos());
      //  return String.format("%s", consumer.getDatos());
  //  }

}
