package com.simple;

import com.simple.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TesterSingleEntity {

    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        INSERT QUERY
//        Employee emp = new Employee();
//        emp.setFirstName("V");
//        emp.setLastName("S");
//        emp.setEmail("vs@calstatela.edu");
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(emp);
//        entityManager.getTransaction().commit();

//        FIND BY ID
//        Employee emp = entityManager.find(Employee.class,"1964214a-ffd4-472a-9bcf-75ee5271461a");
//
//        System.out.println(emp.toString());

//        UPDATE QUERY
//        Employee emp = entityManager.find(Employee.class,"1964214a-ffd4-472a-9bcf-75ee5271461a");
//        emp.setFirstName("Drangon");
//
//        entityManager.getTransaction().begin();
//        entityManager.merge(emp);
//        entityManager.getTransaction().commit();


//        DELETE QUERY
//        Employee emp = entityManager.find(Employee.class,"1964214a-ffd4-472a-9bcf-75ee5271461a");
//
//        entityManager.getTransaction().begin();
//        entityManager.remove(emp);
//        entityManager.getTransaction().commit();

        //FIND ALL
        TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp ORDER BY emp.email DESC", Employee.class);

        List<Employee> resultList = query.getResultList();

        for (Employee emp1:resultList) {

            System.out.println(emp1);

        }

        //FIND BY EMAIL
        //TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp WHERE emp.email=:paramEmail",Employee.class);
        TypedQuery<Employee> query1 = entityManager.createNamedQuery("Employee.findByEmail", Employee.class);

        query1.setParameter("paramEmail","vsarava@calstatela.edu");

        List<Employee> resultList1 = query.getResultList();

        for (Employee emp2:resultList) {

            System.out.println(emp2);

        }



        entityManager.close();

        entityManagerFactory.close();
    }
}
