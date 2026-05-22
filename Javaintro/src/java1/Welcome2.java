package java1;

public class Welcome2 {
	

	public static void main(String[] args) {
		System.out.println("welcome to my world");
	//	m1();
		Welcome2 t1 = new Welcome2();
		t1.m2();
		
	}
	
	static  void m1(){
		System.out.println("welcome to my world2");
		
	}
	
	void m2(){
		System.out.println("welcome to my world3");
		m3();
		m1();
	
	}
	
	void m3(){
		System.out.println("welcome to my world 4");
		
		
	}

}
