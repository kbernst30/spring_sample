package com.sitescout.dsp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationsResource {

    @MessageMapping("/hello")
    @SendTo("/notifications")
    public String sendNotification(String message) {
        return "Received Message: " + message;
    }
}
