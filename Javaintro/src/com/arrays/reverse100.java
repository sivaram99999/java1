package com.arrays;

public class reverse100 {

	public static void main(String[] args) {
		int a = 100;
		String  rev= "";
		String s =""+a;
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
			}
		System.out.println(rev);
	}

}
