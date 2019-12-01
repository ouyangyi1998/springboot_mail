package com.jerry.springboot_mail.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Mail {
    private String sender;
    private String receiver;
    private String subject;
    private String text;
}
