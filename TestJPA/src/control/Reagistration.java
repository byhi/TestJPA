package control;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import model.KmUsers;
import model.User;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**This is my first test   http://www.informit.com/articles/article.aspx?p=1671224&seqNum=2 */

@ManagedBean(name="reg")
@RequestScoped
public class Reagistration {

	
   private static final String PERSISTENCE_UNIT_NAME = "TestJPA";
   
   @PersistenceUnit(unitName = "TestJPA")
   private static EntityManagerFactory factory;
	
	public String creat(){ 
		System.out.println("Gomb: ");
		connectionTest();
		return "reg";
	}
	
	public static void connectionTest() {
		  String url ="jdbc:mysql://localhost:3306/jsf_db";
	        String username = "root";
	        String password = "";
	        String driver = "com.mysql.jdbc.Driver";

		
	      
			try {
				  Connection conn;
			      Class.forName(driver);
				conn = DriverManager.getConnection(url, username, password);
				try {
		            Statement statement = conn.createStatement();
		            ResultSet rs = statement.executeQuery("SELECT * FROM kmusers");
		            while(rs.next()) {
		                System.out.println(rs.getObject(1));
		            }
		            System.out.println(rs.getRow());
		        } finally {
		            conn.close();
		        }
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	}
	
	public static void jpsTest() {
		
		System.out.println("Gomb2: ");
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
     Query q = em.createQuery("SELECT e FROM KmUsers e ");
        List<KmUsers> todoList = q.getResultList();
        for (KmUsers todo : todoList) {
            System.out.println(todo);
        }
        System.out.println("Size: " + todoList.size());

        // create new todo
       em.getTransaction().begin();
        KmUsers todo = new KmUsers();
        todo.setName("TestUser");
        todo.setPass("root");
        todo.setEmail("byhi@gmail.com");
        SimpleDateFormat dateformat2 = new SimpleDateFormat("dd/MM/yyyy");

        try {
			todo.setBirthday( dateformat2.parse("17/07/1989"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        em.persist(todo);
        em.getTransaction().commit();

        em.close();
    }
	
	public static void regg(String nev,String pw,String email,String date) {		
		
		System.out.println("Gomb2: ");
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
  
        // create new todo
       em.getTransaction().begin();
        KmUsers todo = new KmUsers();
        todo.setName(nev);
        todo.setPass(pw);
        todo.setEmail(email);
        SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
			todo.setBirthday( dateformat2.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        em.persist(todo);
        em.getTransaction().commit();
        em.close();
    }
	
	public String read(String nev,String pw) {		
			
			System.out.println("Gomb2: ");
	        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	        EntityManager em = factory.createEntityManager();
	        // read the existing entries and write to console
	     Query q = em.createQuery("SELECT e FROM KmUsers e WHERE e.name = :name and e.pass = :pass");
	     q.setParameter("name", nev);
	     q.setParameter("pass", pw);
	        List<KmUsers> todoList = q.getResultList();
	        for (KmUsers todo : todoList) {
	            System.out.println(todo);
	        }
	        System.out.println("Size: " + todoList.size());
	     return "/Table.xhtml"  ; 
	}
	
	public List<User> readList() {		
		 List<User> userList = new ArrayList<User>();
		System.out.println("Gomb2: ");
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
     Query q = em.createQuery("SELECT e FROM KmUsers e");

        List<KmUsers> todoList = q.getResultList();
        for (KmUsers todo : todoList) {
        	userList.add(new User(todo.getName(),todo.getEmail(),todo.getBirthday()));
        }
        System.out.println("todoList Size: " + todoList.size());
        System.out.println("userList Size: " + userList.size());
     return userList  ; 
	}
	
	public void hi() {
		System.out.println("Gomb3: ");
		//return "success";
		}
    }
