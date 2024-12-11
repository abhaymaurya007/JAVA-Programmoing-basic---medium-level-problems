package has8;

public class HospitalManagementSystem {
	public static void main(String[] args) {
		
	
       Doctor d1=new Doctor("dr. abhi",30,"doctor","dental");
       d1.work();
       Nurse n1=new Nurse("priya", 20,"helper", 4);
       n1.work();
	}
}
