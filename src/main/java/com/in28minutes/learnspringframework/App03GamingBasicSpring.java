package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicSpring {
    public static void main(String[] args) {
        try{
            var context = new AnnotationConfigApplicationContext(GamingBasicConfiguration.class);
            context.getBean(PacmanGame.class);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
