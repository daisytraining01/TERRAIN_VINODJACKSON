package pkg;

public class Method_Overloading_sub implements Method_Overloading {


	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Addition of two numbers:" +(x+y));
	}

	@Override
	public void add(int x, int y, int z) {
		// TODO Auto-generated method stub
		
		System.out.println("Addition of three numbers:" +(x+y+z));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading_sub ob =new Method_Overloading_sub ();
		System.out.println("Method Overloaded");
		ob.add(4, 5);
		ob.add(1, 2, 3);
	}
}
