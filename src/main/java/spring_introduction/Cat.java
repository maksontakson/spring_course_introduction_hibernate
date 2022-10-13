package spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("catBean")
public class Cat implements Pet{
    @Value("${cat.name}")
    private String name;

    public Cat() {
        System.out.println("Cat bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    @PostConstruct
//    public void init() {
//        System.out.println("Class cat: init method");
//    }
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class cat: destroy method");
//    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
