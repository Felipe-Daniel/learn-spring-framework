package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class App04GamingLauncher {

    public static void main(String[] args) {
        try{
            var context = new AnnotationConfigApplicationContext(App04GamingLauncher.class);
            System.out.println(context.getBean(PacmanGame.class));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
