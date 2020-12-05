package pl.akademiakodu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by michalos on 28.03.2017.
 */
//@Component
public class MessagePrinter {

//    @Autowired
    private MessageProducer producer;

    MessagePrinter() {}

    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }
    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        System.out.println(producer.getMessage());
    }

    public String getName(){
        return "My name is message producer";
    }
}