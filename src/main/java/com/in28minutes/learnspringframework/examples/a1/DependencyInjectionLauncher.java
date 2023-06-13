package com.in28minutes.learnspringframework.examples.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBussinessClass{
    // it is not the main, so needs to autowired manually
//    @Autowired // Field injection
    Dependency1 dependency1;
//    @Autowired // Field injection
    Dependency2 dependency2;


//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Dependency Injection");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Dependency Injection");
//        this.dependency2 = dependency2;
//    }
//
    //@Autowired
//    public YourBussinessClass(Dependency1 dependency1, Dependency2 dependency2) {
//    System.out.println("Constructor Injection - YourBussinessClass");
//        this.dependency1 = dependency1;
//        this.dependency2 = dependency2;
//    }
    @Override
    public String toString() {
        return "Using" + dependency1 + " with " + dependency2;
    }
}
@Component
class Dependency1{
}
@Component
class Dependency2{
}
@Configuration
@ComponentScan
public class DependencyInjectionLauncher {
    public static void main(String[] args) {
        try{
            var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncher.class);
            System.out.println(context.getBean(YourBussinessClass.class));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
