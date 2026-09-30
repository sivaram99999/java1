package abc;

public class leetcode3550 {

    public static void main(String[] args) {

        int[] arr = {123, 45, 678};

        int smallestSum = Integer.MAX_VALUE;
        int smallestIndex = -1;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            if (sum < smallestSum) {
                smallestSum = sum;
                smallestIndex = i;
            }
        }

      
        System.out.println("Smallest sum index = " + smallestIndex);
       
    }
}