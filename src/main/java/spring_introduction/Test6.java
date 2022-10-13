package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        Pet cat = context.getBean("catBean", Cat.class);
        cat.say();
        person.callYourPet();
        Cat cat1 = (Cat) cat;
        System.out.println(cat1.getName());
        context.close();
    }
}
