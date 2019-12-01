package com.jerry.springboot_mail.web;

import com.jerry.springboot_mail.pojo.Mail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;

@RestController
@RequestMapping("/api/mail")
@Slf4j
public class controller {
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private TemplateEngine templateEngine;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Mail mail)
    {
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom(mail.getSender());
        mailMessage.setTo(mail.getReceiver());
        mailMessage.setSubject(mail.getSubject());
        mailMessage.setText(mail.getText());
        mailSender.send(mailMessage);
        log.info("success");
        return "success";
    }
}
