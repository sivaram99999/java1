package Garbagecollection;
// nullifying object

public class Garbagecollection {
	int x;
	protected void finalize() {
		System.out.println("test class object destroyed");
	}

	public static void main(String[] args) {
		Garbagecollection t = new Garbagecollection();
		
		t = null;
		

	}

}
