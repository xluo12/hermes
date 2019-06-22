package com.mengxuegu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot12MailApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    public void testSimpleMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("Testing email");
        message.setText("This is the email body");
        message.setFrom("chrisluo1987@gmail.com");
        message.setTo("xluo69339@gmail.com");

        javaMailSender.send(message);
        System.out.println("Email sent!");
    }

    @Test
    public void testMimeMail() throws MessagingException {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);

        messageHelper.setSubject("Testing mime email");
        messageHelper.setText("<h2 style='color:red'>This is the email body</h2>", true);
        messageHelper.addAttachment("1.jpg", new File("/Users/ChrisLuo/Desktop/1.png"));
        messageHelper.addAttachment("b.jpg", new File("/Users/ChrisLuo/Desktop/2.png"));

        messageHelper.setFrom("chrisluo1987@gmail.com");
        messageHelper.setTo("xluo69339@gmail.com");

        javaMailSender.send(mimeMessage);
        System.out.println("Email sent!");
    }

}
