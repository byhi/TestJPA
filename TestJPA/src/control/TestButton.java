package control;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="butt")
@RequestScoped
public class TestButton {
	
	public static void hi1() {
		System.out.println("Gomb3000: ");
		//return "success";
		}
}
