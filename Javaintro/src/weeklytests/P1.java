package weeklytests;

class Test1 {
	static int x = m1();
	static {
		System.out.println("static bolck 1");
		
	}
	static int m1() {
		System.out.println("static method");
		return 10;
		
		
	}
	{
		System.out.println("instance bolck 1");
	}
	Test1(){
		System.out.println("constructor");
		
	}
	{
		System.out.println("instance bolck 2");
		
	}
	static {
		System.out.println("static bolck 2");
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		System.out.println("main method");
		
	}
	

}
