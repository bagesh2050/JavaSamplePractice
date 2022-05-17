package com.self.practice.test;
import java.util.*;
import java.util.logging.*;
import javax.persistence.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.query.Query;

public class CustomerDAO {
    
    public List<Customer> findCustomersByNameAndCredit(Session session,
                                                       String partialName, 
                                                       Integer minCredit) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    @Entity(name = "Customer")
    @Table
    public static class Customer {
        @Id
        public Integer id;
        @Column
        public String name;
        @Column
        public Integer credit;
    }
    
    public static void main(String[] args) {
        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger("");
        logger.setLevel(Level.OFF);
        
        Properties prop = new Properties();
        prop.setProperty("hibernate.connection.url", "jdbc:h2:mem:db1");
        prop.setProperty("dialect", "org.hibernate.dialect.H2Dialect");
        prop.setProperty("hibernate.hbm2ddl.auto", "create");

        SessionFactory sessionFactory = new Configuration().addProperties(prop)
            .addAnnotatedClass(Customer.class).buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Customer customer = new Customer();
        customer.id = 0;
        customer.name = "John Doe";
        customer.credit = 100;
        session.save(customer);
        
        customer = new Customer();
        customer.id = 1;
        customer.name = "Jane Doe";
        customer.credit = 200;
        session.save(customer);
        session.flush();

        CustomerDAO customerDao = new CustomerDAO();
        List<Customer> customers = customerDao.findCustomersByNameAndCredit(session, "John", 20);
        for(Customer cust : customers) {
            System.out.println(cust.id);
            System.out.println(cust.name);
            System.out.println(cust.credit);
        }
    }
}