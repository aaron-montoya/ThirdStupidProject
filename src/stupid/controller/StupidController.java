package stupid.controller;

import java.util.Scanner;


public class StupidController
{
	public void start()
	{
		System.out.println("I am Aaron Montoya");
		
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite TV show?");
		String answer = firstScanner.nextLine();
		System.out.println("Oh cool, you like " + answer);
	}
}
