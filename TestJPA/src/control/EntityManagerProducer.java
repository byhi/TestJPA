package control;

import javax.faces.bean.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
	public class EntityManagerProducer {
	 
	 /*   private EntityManagerFactory emf;
	 
	    public void init(@Observes ContainerInitialized containerInitialized) {
	        emf = Persistence.createEntityManagerFactory("default");
	    }
	 
	    @Produces
	    public EntityManager getEntityManager() {
	        return emf.createEntityManager();
	    }
	 
	    public void closeEntityManager(@Disposes EntityManager entityManager) {
	        entityManager.close();
	    }*/
	}
