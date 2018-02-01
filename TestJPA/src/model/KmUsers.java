package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

//http://www.vogella.com/tutorials/JavaPersistenceAPI/article.html
//http://www.javatips.net/blog/java-persistence-jpa-2-0-tutorial-with-eclipselink

@Entity
@Table(name="kmusers")
public class KmUsers implements java.io.Serializable{
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 8133245497082621435L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	@Column(name = "USERID")
	    private Long userid;
	 	
	    @Column(name = "NAME")
	    private String name;
	 	  
	 	@Column(name = "PASS")
	 	private String pass;
	 	  
	 	@Column(name = "EMAIL")
	    private String email;
	 	  
	 	@Temporal(TemporalType.DATE)
	    @Column(name = "BIRTHDAY")
	    private Date birthday;
		
	    
	    
		public Long getUserid() {
			return userid;
		}
		public void setUserid(Long userid) {
			this.userid = userid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		@Override
		public String toString() {
			return "UserData [id=" + userid + ", summary=" + name + ", description=" + pass + ", email=" + email
					+ ", birthday=" + birthday + "]";
		}
	    
	    
}
