package Lab;

public class Palpha {

	public static void main(String[] args) {
		char  c = ' ';
		String v="";
		for ( c = 'a' ; c <= 'z'; c++ ) {
			System.out.print(c + " ");
			
			
			if ( c=='a'| c=='e' | c == 'i'| c=='o'  | c =='u' ) {
				//System.out.print("aeiou are vowles");
				v+=" "+c;
			}
			
		}
		System.out.println();
		System.out.println(v);
	}

}
