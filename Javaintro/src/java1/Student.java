package java1;

public class Student {
	
	int age;
	String name;
	int persentage;
	char grade;
	// Student t= new Student(); 
	
	
	static {
		System.out.println("hello");
	}
	{
		System.out.println("hii");
	}
	
	 static void age() {
		System.out.println("age of student");
		name();
	}
	 static void name() {
		System.out.println("name of student");
		Student t= new Student(); 
		t.persentage();
		
		
	}
	 
	  void persentage(){
		  System.out.println("persentage of student");
		  grade();
		  
		 
	 }
	  void grade(){
		  System.out.println("grade of student");
		 // age();
		  
		  
		 
	 }
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println("hello2");
		//Student t= new Student(); 
		age();
		
		

	}

}
