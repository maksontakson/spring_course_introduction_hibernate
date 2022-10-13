package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat cat = context.getBean("myPet", Cat.class);
        cat.setName("Belka");
        Cat cat1 = context.getBean("myPet", Cat.class);
        cat1.setName("Strelka");
        System.out.println(cat.getName());
        System.out.println(cat1.getName());
        context.close();
    }
}
