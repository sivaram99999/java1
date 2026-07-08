package constructors;

public class Account {
	String name;
	long account_number;
	
	Account(){
		System.out.println("No-arg constructor of Account ");
	}

	Account(String name){
		
		System.out.println("1-arg constructor");
//		display();
	}
	
	 Account(String name,long account_number){
		 this.name=name;
		 this.account_number=account_number;
		 this(name);
//		 display();
		 
		 
	 }
	
	
	
	
	

	public static void main(String[] args) {
		
	//	Account a= new Account ();
	//	Account a1= new Account ("Siva");
	//	Account a2= new Account ("ram",2102010000114l);
		
		// TODO Auto-generated method stub

	}
//	void display() {
//		System.out.println("Employs name : " + name );
//		System.out.println("Employs account number : " + account_number);
		
//	}

}

class Savings_account extends  Account{
	double balance;
	
	Savings_account(){
//		System.out.println("No-arg constructor");
		
	}
	
	Savings_account(String name, long account_number,double balance){
		super(name,account_number);
		this.balance=balance;
		display();
		
		
	}
	

	public static void main(String[] args) {
		
		Savings_account s=new Savings_account();
		Savings_account s1=new Savings_account("Siva",210303105374l,22210.25);
		// TODO Auto-generated method stub

	}
	void display() {
		System.out.println("Balance of employ :" + balance);
		System.out.println("Employs name : " + name );
		System.out.println("Employs account number : " + account_number);
	}
	
}

