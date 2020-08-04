package org.afterclass;

import java.util.Arrays;
import java.util.Scanner;

public class PatternPrograms {
	static Scanner sc = new Scanner(System.in);

	public static void usingStar() {

		System.out.println("Enter the number of Row Stars you want: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");

			}
			System.out.println();
		}
	}

	public static void usingNumbers() {

		for (int j = 1; j <= 10; j++) {

			for (int i = 1; i <= j; i++) {

				System.out.print(j + " ");

			}

			System.out.println();
		}
	}

	public static void usingSeriesOfNumbers() {

		System.out.println("Enter the number order pattern you want:");
		int n = sc.nextInt();

		for (int g = 1; g <= n; g++) {

			for (int h = 1; h <= g; h++) {

				System.out.print(h + " ");
			}
			System.out.println();
		}

	}

	public static void creatingPraymid() {
		System.out.println("Enter the value:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = n; j > i; j--) {

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void anagram() {
		System.out.println("Enter String 1:");
		String given1 = sc.next();
		System.out.println("Enter String 2:");
		String given2 = sc.next();

		if (given1.length() == given2.length()) {

			char[] c1 = given1.toCharArray();
			char[] c2 = given2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			if (Arrays.equals(c1, c2)) {

				System.out.println("Given Strings are Anagram");

			} else {
				System.out.println("Given Strings are not Anagram");
			}

		} else {
			System.out.println("Given Strings are not equal so it is not anagram...");
		}

	}

	public static void main(String[] args) {
		// usingStar();
		// System.out.println();
		// usingNumbers();
		// System.out.println();
		// usingSeriesOfNumbers();
		// creatingPraymid();
		anagram();

	}

}
