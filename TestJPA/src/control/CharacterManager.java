package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import model.Character;
import model.Characters;
import model.KmUsers;
import model.User;

@ManagedBean(name="character")
@RequestScoped
public class CharacterManager {
	 private static final String PERSISTENCE_UNIT_NAME = "TestJPA";
	   
	   @PersistenceUnit(unitName = "TestJPA")
	   private static EntityManagerFactory factory;


		public static void regg(String nev,String pw,String email,String date) {		
			
			System.out.println("Gomb2: ");
		    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		    EntityManager em = factory.createEntityManager();
		
		    // create new todo
		   em.getTransaction().begin();
		   	Character todo = new Character();
		   	
		  
		    todo.setLevel(0);
		    todo.setName(email);
		    todo.setRace(nev);
		    todo.setCaste(pw);
		    todo.setPersonality(email);
		    todo.setReligion(nev);
		    todo.setStrength(0);
		    todo.setDexterity(0);
		    todo.setStamina(0);
		    todo.setIntelligence(0);
		    todo.setWisdom(0);
		    todo.setCharisma(0);
		    todo.setToughness(0);
		    todo.setReflex(0);
		    todo.setWillpower(0);
		    todo.setHp(0);
		    todo.setVf(0);
		    todo.setInitiative(0);
		    todo.setMelee_attack(0);
		    todo.setMelee_attack(0);
		    todo.setStory(pw);
		     
		    em.persist(todo);
		    em.getTransaction().commit();
		    em.close();
		}
		
		public List<Characters> readList() {		
			 List<Characters> characterList = new ArrayList<Characters>();
			System.out.println("Gomb2: ");
	        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	        EntityManager em = factory.createEntityManager();
	        // read the existing entries and write to console
	        Query q = em.createQuery("SELECT e FROM KmUsers e");

	        List<Character> todoList = q.getResultList();
	        for (Character todo : todoList) {
	        	characterList.add(new Characters( todo.getLevel(),
			    todo.getName(),
			    todo.getRace(),
			    todo.getCaste(),
			    todo.getPersonality(),
			    todo.getReligion(),
			    todo.getStrength(),
			    todo.getDexterity(),
			    todo.getStamina(),
			    todo.getIntelligence(),
			    todo.getWisdom(),
			    todo.getCharisma(),
			    todo.getToughness(),
			    todo.getReflex(),
			    todo.getWillpower(),
			    todo.getHp(),
			    todo.getVf(),
			    todo.getInitiative(),
			    todo.getMelee_attack(),
			    todo.getMelee_attack(),
			    todo.getStory()
	        			
	        			));
	        }
	        System.out.println("todoList Size: " + todoList.size());
	        System.out.println("userList Size: " + characterList.size());
	     return characterList; 
		}
}
