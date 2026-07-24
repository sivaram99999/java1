package com.arrays;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {

        int arr[] = {-10,-20,50,5,4,70,54};

        int count = 0;
        int count1 = 0;

        for(int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            count++;

            for(int j = 0; j < arr.length - 1 - i; j++) {

                count1++;

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }

        System.out.println(Arrays.toString(arr));
        
        System.out.println(arr[arr.length-2]);
        

       
    }
}