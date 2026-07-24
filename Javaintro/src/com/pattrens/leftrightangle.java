package com.pattrens;

public class leftrightangle {

	public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {

            // Print spaces
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
		}

	}


