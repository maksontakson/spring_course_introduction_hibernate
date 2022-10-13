package hinbernate_many_to_many;

import hinbernate_many_to_many.entity.Child;
import hinbernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = sessionFactory.getCurrentSession();
//            Section section = new Section("Football");
//            Child child = new Child("Maks", 5);
//            Child child1 = new Child("Vasya", 10);
//            Child child2 = new Child("Masha", 7);
//            section.addChildToSection(child);
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//
//            session.beginTransaction();
//
//            session.save(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            //************************************************
//            session = sessionFactory.getCurrentSession();
//            Section section = new Section("Volley");
//            Section section1 = new Section("Chess");
//            Section section2 = new Section("Boxing");
//            Child child = new Child("Igor", 8);
//
//            child.addSectionToChild(section);
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//
//
//            session.beginTransaction();
//
//            session.save(child);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            //************************************************
            session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            Section section = session.get(Section.class, 1);
            System.out.println(section);
            System.out.println(section.getChildren());

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
