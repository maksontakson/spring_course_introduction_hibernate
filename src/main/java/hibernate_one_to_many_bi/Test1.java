package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Department department = new Department("Sales", 800, 1500);
//            Employee employee = new Employee("Maks", "Kotlyar", 800);
//            Employee employee1 = new Employee("Olga", "Vasina", 1200);
//            Employee employee2 = new Employee("Elena", "Smirnova", 1500);
//
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class, 4);
            System.out.println("Show department");
            System.out.println(department);


            session.getTransaction().commit();
            System.out.println("Show employees of department");
            System.out.println(department.getEmps());

            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
