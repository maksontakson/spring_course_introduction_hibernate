package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {

    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person bean is created(private)");
    }
//    @Autowired
//
//    public Person(@Qualifier("catBean")Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
        System.out.println(pet);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {

        System.out.println("Class person: set ");
        this.pet = pet;
    }

    public void callYourPet() {
        Cat cat = (Cat) pet;
        System.out.println("Hello, my lovely " + Cat.class.getSimpleName() + " " + cat.getName());
        pet.say();
    }
}
