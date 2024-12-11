package has8;

public class HospitalStaff {
   private String name;
    private String role;
   public HospitalStaff(String name, int age, String role) {
	super();
	this.name = name;
	this.role = role;
}
public void work(){
	System.out.println("name of stafff--"+this.name);
	System.out.println("role of staff---"+this.role);
	}
}
