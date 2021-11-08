package com.example.emailclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
     
    @Autowired
    private JavaMailSender mailSender;
     
    public void sendEmail() {
        String from = "inilaydas@gmail.com";
        String to = "mailnilaydas@gmail.com";

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(to);
        message.setSubject("This is a plain text email");
        message.setText("Hello guys! This is a plain text email.");

        mailSender.send(message);
    }
}