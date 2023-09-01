package com.example.proba;

import com.example.proba.service.EmailSenderService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication //( scanBasePackages = {"com.example.proba.dao", "com.example.proba.entity", "com.example.proba.service"})
public class ProbaApplication {


    @Autowired
    private EmailSenderService senderService;
    public static void main(String[] args) {
        SpringApplication.run(ProbaApplication.class, args);



    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() throws MessagingException {
        senderService.sendEmail("zalman2020201@gmail.com","Hello There","General Kenobi","D://num_feladatok.pdf");



    }


}
