package com.marolix.restaurant;

import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class OnlineReservationSystemApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext con = SpringApplication.run(OnlineReservationSystemApplication.class, args);
     	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		RestaurantEntity re = new RestaurantEntity("Devayani","63004311056",104,"Nice","reserved");
		Restaurantservice rest = con.getBean(Restaurantservice.class);
		//System.out.println(rest.insertEntity(re));
		//System.out.println(rest.readEntity(re));
		System.out.println(rest.updateEntity("Dev", "6302789034", 103, "Nice", "reseved"));
		//rest.deleteEntity(101);
		//System.out.println(rest.readAllEntities());
				TreeSet<Integer> ts = new TreeSet<Integer>();
				ts.add(1);
				ts.add(2);
				ts.add(3);
				ts.add(4);
			//System.out.println(rest.readAll(ts));
		//demo.deleteAll();
	}

}
