package deliv_part2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Deliv_part2 {

	public static void main(String[] args) {
		// User will be prompted to enter a date here
		System.out.println("Enter date in YYYYMMDD format: ");
		Scanner keyboard = new Scanner(System.in);
		String firstDate = keyboard.next();
		// Parse first string into Date
		LocalDate formattedFirstDate = LocalDate.parse(firstDate, DateTimeFormatter.BASIC_ISO_DATE);

		System.out.println("Enter date in YYYYMMDD format: ");
		String secondDate = keyboard.next();
		// Parse second string into Date
		LocalDate formattedSecondDate = LocalDate.parse(secondDate, DateTimeFormatter.BASIC_ISO_DATE);
		// Calculate the duration between the two dates
		Period duration = Period.between(formattedFirstDate, formattedSecondDate);
		System.out.println("The difference between the two dates is: " + duration.getYears() + " years, "
				+ duration.getMonths() + " months, and " + duration.getDays() + " day(s).");

	}

}
