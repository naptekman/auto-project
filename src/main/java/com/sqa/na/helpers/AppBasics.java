package com.sqa.na.helpers;

import java.util.*;

/**
 * File Name: AppBasics.java<br>
 * Aptekman, Nina<br>
 * Java Boot Camp Exercise<br>
 * Student : Nina Aptekman<br>
 * Created: Aug 19, 2017
 */
// Declare all static variables such as nameOfApp, userName, and scanner
// Greet the user using a system out call
// Ask the user for their name and store in a local scope String
// variable
// Ask the user for a number and store in a local scope int variable
// Ask the user for another number and store in another local scope int
// variable
// Calculate the total of both numbers when adding them together and
// store in another local scope int variable
// Display the total of adding the numbers to the user
// Farewell the user and exit
/**
 * CalculatorApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String userName) {
		System.out.println("Thank you " + userName + " for using our application.");
		System.out.println("Have a nice day!");
	}

	public static String greetUserAndGetName(String appName) {
		// Greet the user using a system out call
		System.out.println("Welcome to the " + appName + " Application.");
		// Ask the user for their name and store in a local scope String
		// variable
		System.out.print("Can I get your name? ");
		return scanner.nextLine();
	}

	public static double requestDouble(String question) {
		double num = 0.0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static int requestInt(String question) {
		int num = 0; // double num = 0.0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Integer.parseInt(input);// num = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
}