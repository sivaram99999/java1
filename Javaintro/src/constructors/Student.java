package constructors;

public class Student {
	int id;
	String name;
	String course;

	Student() {
		// System.out.println("Id of student :"+ id);
		// System.out.println("Name of student :"+ name);
		// System.out.println("Course of student :"+ course);
		display();
		id = 1;
		name = "siva";
		course = "java";
		display();
		
		id = 2;
		name = "ram";
		course = "pyton";
		display();

	}

	void display() {
		System.out.println("Student id :" + id);
		System.out.println("Student Name :" + name);
		System.out.println("Student Course :" + course);

	}

	public static void main(String[] args) {
		Student st = new Student();
		st.display();
	}

}
