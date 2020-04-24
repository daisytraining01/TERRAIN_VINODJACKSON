package pkg;

public class Cons_encap_Inherit_Sub extends Cons_encap_Inherit {

	public Cons_encap_Inherit_Sub(int Emp_id, String Emp_name, String Desgn) {
		super(Emp_id, Emp_name, Desgn);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cons_encap_Inherit_Sub ob = new Cons_encap_Inherit_Sub(4012,"Vinod","TA");
		ob.set_salary(15000);
		System.out.println("Salary:"+ob.get_salary());

	}

}
