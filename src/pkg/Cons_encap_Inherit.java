package pkg;

public class Cons_encap_Inherit {
	
	public int Emp_id;
	public String Emp_name;
	public String Desgn;
	private double salary;
	
	public Cons_encap_Inherit(int Emp_id,String Emp_name,String Desgn) {
		
		System.out.println("**EmployeeDetails**");
		System.out.println("Employee-Id:"+ Emp_id);
		System.out.println("Employee-Name:"+Emp_name);
		System.out.println("Designation:"+Desgn);		
		
	}

	public double  get_salary() {
		return this.salary;
		
	}
	
	public void set_salary(double sal) {
		this.salary=sal;
	}
	
	
}

