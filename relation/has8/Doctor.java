package has8;

public class Doctor extends HospitalStaff {
	private String specialization;

	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
	}
	@Override
	public void work(){
		super.work();
		System.out.println("specilization---"+this.specialization);
		}
	

}
