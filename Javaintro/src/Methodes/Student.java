package Methodes;

public class Student {
	static int count;
	
	class studentdetails{
		Integer  id;
		String name;
		Double marks;
		
	//	static int count;
		
	}
	
	void welcome() {
		System.out.println("welcome to student management system");
	}
	
	void Studentdata(Integer id,String name, Double marks ) {
		System.out.println("Student id : " + id);
		System.out.println("Student name : " + name);
		System.out.println("Student marks : " + marks);	
	}
	
	int marks() {
		int marks = 90;
		System.out.println(marks );
		return marks;
		
	}
	
	int Bonus(int bonus) {
		
		System.out.println( marks() + bonus);
		return  bonus;
		
		
	}
	
	static void colinfo() {
		System.out.println("print the collage name ");
			
	}

	public static void main(String[] args) {
		Student t = new Student ();
		
		t.welcome();
		t.Studentdata(1,"siva", 90.00);
		t.marks();
		t.Bonus(10);
		colinfo();
	    int count = 10;
	    System.out.println(count);
		

	}

}
