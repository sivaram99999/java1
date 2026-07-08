package java1;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Biginteger2 {
	
	//BigInteger bi1 = new BigInteger("123548964335843");
	//BigInteger bi2 = new BigInteger("123548964335843");
	
	//BigDecimal bd1 = new BigDecimal ("12312313232323.12525532");
	//BigDecimal bd2 = new BigDecimal ("12312313232323.12525532");

	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("123548964335843");
		BigInteger bi2 = new BigInteger("123548964335843");
		
		BigDecimal bd1 = new BigDecimal ("12312313232323.12525532");
	   BigDecimal bd2 = new BigDecimal ("12312313232323.12525532");
		
		//Biginteger2 t1 = new Biginteger2 ();
		
		System.out.println(bi1.add (bi2));
		System.out.println(bi1.multiply (bi2));
		System.out.println(bd1.add (bd2));
		System.out.println(bd1.multiply (bd2));
	}

}
