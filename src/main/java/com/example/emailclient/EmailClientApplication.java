package com.example.emailclient;

import com.example.emailclient.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class EmailClientApplication {
    @Autowired
private BusinessService businessService;
    public static void main(String[] args) {
        SpringApplication.run(EmailClientApplication.class, args);
    }
    @Scheduled(fixedDelay = 30000)
    public void send()
    {
        businessService.sendEmail();
    }


}
