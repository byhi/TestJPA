package control;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.User;

@ManagedBean(name="userlist")
@SessionScoped
public class KmUserListBean implements Serializable{

	/**
	 * http://www.highfaces.org/showcase/line_map.jsf
	 */
	private static final long serialVersionUID = 8377271617077208500L;
	
	private List<User> userArrayList;

	public List<User> getOrderArrayList() {
		return userArrayList;
	}

	public void setOrderArrayList(List<User> orderArrayList) {
		this.userArrayList = orderArrayList;
	}

	





	public static class Order{
		String name;
		String mail;
		String birthday;
		
		public Order(String name, String mail, String birthday) {
			super();
			this.name = name;
			this.mail = mail;
			this.birthday = birthday;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getBirthday() {
			return birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}				
	}
}
