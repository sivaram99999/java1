package java1;

public class Primitivevariables {
	
	byte age;
	short year;
	int salary;
	float pi;
	double price;
	long phone_no;
	char gender;

	public static void main(String[] args) {
		Primitivevariables t1=new Primitivevariables();
		
		t1.age= 22;
		t1.year=2002;
		t1.salary=22225;
		t1.pi=3.14f;
		t1.phone_no=9676508392L;
		t1.price=22.000002554258;
		t1.gender='m';//while giving value to car we use ''  //
		
		
		
		System.out.println(t1.age);	
		System.out.println(t1.year);	
		System.out.println(t1.salary);	
		System.out.println(t1.pi);	
		System.out.println(t1.price);
		System.out.println(t1.phone_no);		
		System.out.println(t1.gender);	
		
		

	}

}
