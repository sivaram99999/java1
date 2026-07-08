package Methodes;

public class Method5 {
	
	int id;
	String name;
	String course;
	
	Method5(){
		System.out.println("No arg constructor of method5" );
	}
	
	Method5(int id){
		this();
		System.out.println("1 arg constructor of method5" );
	}
	Method5(int id,String name){
		this(id);
		System.out.println("2 arg constructor of method5" );
	}
	
	
	Method5(int id, String name, String course){
		this.id=id;
		this.name=name;
		this.course=course;
		
		System.out.println("parame constructor of method5" );
	}
	
	
	public static void main(String[] args) {
		System.out.println(" main method called of Method5");
		 Method5 m1 = new  Method5();
		 Method5 m2 = new  Method5(1);
	//	 Method5 m3 = new  Method5(1,"ram");
		 Method5 m4 = new  Method5(1,"ram","pyton");
		 
		 m1.display();
		 m2.display();
	//	 m3.display();
		 m4.display();
		
	//	Method5 m1 = Method5();
		

	}
	void display() {
		System.out.println("Id of the Student :"+ id);
		System.out.println("Name of the Student :" + name);
		System.out.println("Course of Student: " + course);
		System.out.println("****************************************************");
	}

	
}

 class Student2 extends Method5{
	 
	 Student2(){
		 System.out.println("No arg constructor of student" );
		 
	 }
	 Student2(int id,String name, String course){
		 super(id,name,course);
		 System.out.println("parame constructor of student" );
		 
	 }
	 
	
	 
	 
	public static void main(String[] args) {
		
		
		System.out.println(" main method called of auto");
		Student2 s1 = new Student2();
		Student2 s2 = new Student2(1,"Siva","java");
		s1.display();
		s2.display();
	//	System.out.println(s1.id);
	//	System.out.println(s1.name);
	//	System.out.println(s1.course);
		
		

	}
	
	void display() {
		System.out.println("Id of the Student :"+ id);
		System.out.println("Name of the Student :" + name);
		System.out.println("Course of Student: " + course);
		System.out.println("****************************************************");
	}
	
}