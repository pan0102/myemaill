package com.offcn;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class maill {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("classpath:spring/spring-maill.xml");
        JavaMailSenderImpl mailsend=(JavaMailSenderImpl) context.getBean("mailSender");
        //创建简单的邮件
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom("p2399185201@163.com");
        msg.setTo("p2399185201@163.com");
        msg.setSubject("测试邮件");//主题
        msg.setText("好好学习,天天向上!");//内容

        //发送邮件

        mailsend.send(msg);
        System.out.println("send ok");
    }
}
