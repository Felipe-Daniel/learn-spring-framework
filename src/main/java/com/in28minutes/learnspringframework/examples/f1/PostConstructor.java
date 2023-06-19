package com.in28minutes.learnspringframework.examples.f1;

import com.in28minutes.learnspringframework.examples.d1.LazyInitializationLauncher;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!");
    }
    @PostConstruct
    public void inicialize(){
        someDependency.getReady();
    }
}
@Component
class SomeDependency{

    public void getReady() {
    }
}
public class PostConstructor {

    public static void main(String[] args) {
        try(
            var context = new AnnotationConfigApplicationContext(PostConstructor.class);
        ){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
