package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("1");
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("devtp");
		System.out.println("2");
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("3");

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			
			
/*Person p = new Person();
			p.setName("martin");
			manager.persist(p);*/
	
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
//		String s = "SELECT e FROM Person as e where e.name=:name";
		
//		Query q = manager.createQuery(s,Person.class);
//		q.setParameter("name", "martin"); 
//		List<Person> res = q.getResultList();
		
//		System.err.println(res.size());
//		System.err.println(res.get(0).getName());
		
		manager.close();
		factory.close();
	}

}
