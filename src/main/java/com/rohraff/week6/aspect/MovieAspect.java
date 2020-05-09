package com.rohraff.week6.aspect;

import com.rohraff.week6.service.E_mailService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Aspect
@Component
public class MovieAspect {

    private E_mailService e_mailService;

    @Autowired
    public MovieAspect(E_mailService e_mailService) {
        this.e_mailService = e_mailService;
    }

    @After("@annotation(AddMovie)")
    public void sendingEmail() throws MessagingException {
        e_mailService.send("mateuszr600@gmail.com", "Obiekt dodany do listy", "ebe ebe", false);
    }
}
