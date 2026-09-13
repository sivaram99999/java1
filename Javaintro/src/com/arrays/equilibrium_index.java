package com.arrays;

public class equilibrium_index {

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3 };

		int i;

		for (i = 0; i < arr.length; i++) {
			// System.out.println("index " +i);
			int rsum = 0;
			int lsum = 0;
			for (int j = i + 1; j < arr.length; j++) {
				rsum = rsum + arr[j];
			}
			for (int k = i - 1; k >= 0; k--) {
				lsum = lsum + arr[k];
			}

			if (rsum == lsum) {
				System.out.println(i);
			}
		}
	}

}
