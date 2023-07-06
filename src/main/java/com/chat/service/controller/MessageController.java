package com.chat.service.controller;

import com.chat.service.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message")         // all msg will be sent on this url
    @SendTo("/topic/return-to")         //all those who have subscribed this url, will get the msg
    public Message getContent(@RequestBody Message message){
        return message;
    }
}
