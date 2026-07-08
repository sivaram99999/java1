package datavariables;

public class typesofmethodes {  
	
	public static void add2(int a, int b) {
		//a=10;
		//b=30;
	    System.out.println(a+b);
	    
	    }
	
	
	
	// Methods with No Parameters and No Return Value
	void hello() {
		System.out.println("hello");
	}
	
	void add() {  // instance method with  no arguments or parameters 
		int a = 10;
		int b = 20;
		hello();
		//add();
		
		System.out.println("addition of a, b :" + (a+b));	
		}
	
	 static void multiplication() { // static method  with no arguments or parameters 
		float a = 12.21F;
		float b = 1255.22F;
		
		System.out.println("multiplication of a,b :" + a*b);
	}

	public static void main(String[] args) {
		typesofmethodes t1 = new typesofmethodes();
		System.out.println("main method started");
		t1.add();
		t1.add2(1,2);
		multiplication();
		

	}

}
