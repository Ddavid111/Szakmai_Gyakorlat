package com.example.proba.service;


import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.core.io.FileSystemResource;

import java.io.File;


@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String toEmail, String subject, String body,String pathToAttachment) throws MessagingException {
        //SimpleMailMessage message = new SimpleMailMessage();
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom("mintakalman1@gmail.com");
        helper.setTo(toEmail);
        helper.setText(body);
        helper.setSubject(subject);

        FileSystemResource file = new FileSystemResource(new File(pathToAttachment));

        helper.addAttachment(file.getFilename(),file);

        mailSender.send(message);

        System.out.println("Mail sent succesfully...");

    }


}



