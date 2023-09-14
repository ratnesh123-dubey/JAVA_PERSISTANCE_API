package io.ratnesh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class pokemondeskInitiatorUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ratnesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		pokemon p = entityManager.find(pokemon.class, "pikachu");
		
		
		
		if(p != null) {
			p.setPower(1000);
	
			entityTransaction.begin();
			entityManager.persist(p);
			entityTransaction.commit();
		}
		
		else
		{
			System.out.println("Data Entry is not found");
		}
		
	}

}
