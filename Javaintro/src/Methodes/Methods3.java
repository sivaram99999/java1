package Methodes;

public class Methods3 {
	
	class method{
		int age;
		float height;
		double weight;
		char gender;
	}
	 void PresonalDetails() {
		 method t = new method();
		 t.age= 10;
		 t.height= 5.9f;
		 t.weight=60.00;
		 t.gender='m';
		 
		 System.out.println( "personal details of ");
		 
	 }
	
	public static void main(String[] args) {
		Methods3  t2= new Methods3 ();
		t2.PresonalDetails();
	

	}

}
