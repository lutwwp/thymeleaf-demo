//package com.example.thymeleafdemo.mq;
//
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
///**
// * @ClassName MqConsumer
// * @Description: TODO
// * @Author wwp
// * @Date 2019-10-27
// * @Version V1.0
// **/
//@Component
//@RabbitListener(queues = "queue")
//public class MqConsumer {
//    @RabbitHandler
//    public void showMessage(String message){
//        System.out.println(message);
//    }
//}
