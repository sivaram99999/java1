package Methodes;

public class Labtask {
	int id;
	String name;
	int age;
	long phone_number;
	
	
	Labtask(){
		//System.out.println("no-arg constractor");
	this(1);
		//System.out.println("no-arg constractor");
		
	}
	Labtask(int id){
		//System.out.println("1-arg constractor");
	    this(2,"rama", 44);
		//System.out.println("1-arg constractor");
	}
	Labtask(int id , String name ,int age){
		this.id= id;
		this.age= age;
		this.name=name;
	//	display();
		
		
		
	//	System.out.println("no-arg constractor");
		
	}
	
	public static void main(String[] args) {
		Labtask lt = new Labtask();
		lt.display();
		Labtask lt1= new Labtask(10);
		lt1.display();
		Labtask lt2= new Labtask(11,"siva",10);
		lt2.display();
		
		

	}
	void display() {
		System.out.println("ID of person : " + id  );
		System.out.println("Name of person : " +  name );
		System.out.println("age of preson : " + age);
	}

}
