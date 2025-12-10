package day6;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// Checking if given number is Palindrome
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter numbers to revers");
		int num = scanner.nextInt();
		int userNumber = num;
		int reversednum = 0;

		while (num != 0) {
			int extractnum = num % 10; // extract the last number
			reversednum = reversednum * 10 + extractnum; // building reversed number
			num = num / 10; // remove the last digit
		}
		System.out.println("The reversed number is: " + reversednum);
		if(userNumber == reversednum)
		{
			System.out.println("The numnber is Palindrome: " + userNumber);
			
		}else 
			System.out.println("The number is not Palindrome: " + reversednum);
	

	}

}
