package com.in28minutes.learnspringframework.examples.d1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
    private ClassA classA;
    @Autowired
    public ClassB(ClassA classA) {
        this.classA = classA;
    }
}
@Configuration
public class LazyInitializationLauncher {
    public static void main(String[] args) {
        try{
            var context = new AnnotationConfigApplicationContext(LazyInitializationLauncher.class);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
