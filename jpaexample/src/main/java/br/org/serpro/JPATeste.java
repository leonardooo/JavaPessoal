package br.org.serpro;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPATeste {
	
	public void performJPA() {
		
		// Creating objects representing some products
		Produto product1 = new Produto();
		product1.setId(1);
		product1.setName("Tennis racket");
		Produto product2 = new Produto();
		product2.setId(2);
		product2.setName("Guitar");
		Produto product3 = new Produto();
		product3.setId(3);
		product3.setName("Videogame");
		
		// Connecting to the database through EntityManagerFactory
		// connection details loaded from persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
		EntityManager em = emf.createEntityManager();
		
		// Creating a new transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// Persisting the product entity objects
		em.persist(product1);
		em.persist(product2);
		em.persist(product3);
		tx.commit();
		
		// Querying the contents of the database using JPQL query
		Query q = em.createQuery("SELECT p FROM Produto p");
		
		@SuppressWarnings("unchecked")
		List<Produto> results = q.getResultList();
		System.out.println("List of products\n----------------");
		
		for (Produto p : results) {
			System.out.println(p.getName() + " (id=" + p.getId() + ")");
		}
		
		// Closing connection
		em.close();
		emf.close();
	}
	
	//Main
	public static void main(String[] args) {
		new JPATeste().performJPA();
	}
}
