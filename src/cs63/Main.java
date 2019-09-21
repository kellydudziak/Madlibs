package cs63;
import java.util.Scanner;

public class Main {
	
	private static String personsName;
	private static String adj1;
	private static int num1;
	private static int num2;
	private static String place;
	private static String adj2;
	private static String noun;
	private static String food;
	private static String songTitle;
	private static String verb;
	private static String adj3;
	
	public static void main(String[] args) {
		getInput();
		printStory();
	}
	
	private static void getInput() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a person's name: ");
		personsName = keyboard.nextLine();
    		System.out.print("Enter an adjective: ");
		adj2 = keyboard.nextLine();
		System.out.print("Enter a number: ");
		num1 = Integer.parseInt(keyboard.nextLine());
		System.out.print("Enter a number: ");
		num2 = Integer.parseInt(keyboard.nextLine());
		System.out.print("Enter a place: ");
		place =keyboard.nextLine();
		System.out.print("Enter an adjective: ");
		adj2 = keyboard.nextLine();
    		System.out.print("Enter a noun: ");
    		noun = keyboard.nextLine();
		System.out.print("Enter a food: ");
		food = keyboard.nextLine();
		System.out.print("Enter the title of a song: ");
		songTitle = keyboard.nextLine();
		System.out.print("Enter a verb: ");
		verb = keyboard.nextLine();
		System.out.print("Enter an adjective: ");
		adj3 = keyboard.nextLine();
		
		keyboard.close();
	}
	
	private static void printStory() {
		System.out.println(personsName + " was feeling very " +
			adj1 + " today, because today they turned " +
			num1 + " years old! In just a few minutes, " +
			num2 + " of their friends would be coming to their " +
			place + " for their birthday party. The " +
			place + " was covered in " +
			adj2 + " " + noun + " decorations and their birthday " +
			food + " was waiting on the table. As soon as their friends came, they would sing '" +
			songTitle + "' to them and everyone would " +
			verb + " the " + food + "! It was going to be a " +
			adj3 + " day.");
			
	}
}


