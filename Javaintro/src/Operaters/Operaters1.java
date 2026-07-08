package Operaters;

public class Operaters1 {

	public static void main(String[] args) {
    int a =  21;
     if 
      (a % 2 ==0){
     System.out.println(" a is even");
     
      }
     
     else {
    	 System.out.println(" a is odd");
     }
     
	}

}

class year{
	public static void main(String[] args) {
		int year = 2024;
		if ((year % 400 == 0) || (year % 4 == 0 & year %100 !=0)) {
			System.out.println(" year is leap");
			
		}
		else {
			System.out.println(" year is not leap");
		}
		
	}
	
	
}