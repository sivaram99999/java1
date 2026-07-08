package datavariables;

public class Variables {
	// static variable
	
	static float  a1;
//	static float  b2 = 10;
	
	
	char g;
	// local variable 
	void add() {
		int a = 10;// 
		int b = 11;
		System.out.println("addition of a, b :"+ (a+b));	
		}

	public static void main(String[] args) {
		Variables t1 = new Variables();
		System.out.println(a1);
		System.out.println(t1.g);
		t1.add();
		
		

	}

}
