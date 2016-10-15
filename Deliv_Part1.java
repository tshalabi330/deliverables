package deliv_part1;

import java.util.Scanner;

public class Deliv_Part1 {

	public static void main(String[] args) {
		// This application will reverse an input number using a while loop.
		int num = 0;
		int reversed_num = 0;

		System.out.println("Input a numeric number here: ");
		Scanner keyboard = new Scanner(System.in);
		// The input will be stored in int num.
		num = keyboard.nextInt();
		// The while loop will calculate the reversed number.
		while (num != 0) {
			reversed_num = reversed_num * 10;
			reversed_num = reversed_num + num % 10;
			num = num / 10;
		}
		// The reversed number will print out in the following statement.
		System.out.println("The reverse of that number is: " + reversed_num);
	}

}
