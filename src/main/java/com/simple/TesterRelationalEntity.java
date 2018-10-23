package com.simple;

import com.simple.entity.Address;
import com.simple.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesterRelationalEntity  {

    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // INSERT
//        User user = new User();
//
//        user.setFirstName("Vicky");
//        user.setLastName("Saro");
//        user.setEmail("vs@gmail.com");
//
//        Address address = new Address();
//        address.setCity("Los Angeles");
//        address.setState("CA");
//        address.setStreet("Stone man");
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(address);
//        user.setAddress(address);
//        entityManager.persist(user);
//        entityManager.getTransaction().commit();

        //FIND
//        User user = entityManager.find(User.class,"150c14c6-a6c5-439c-923a-217e9b03f6c4");
//
//        System.out.println(user);


        entityManager.close();
        entityManagerFactory.close();
    }
}
