package edu.mills.CS63;

import java.util.Scanner;

public class Madlibs {
	
	private String personsName;
	private String adj1;
	private int num1;
	private int num2;
	private String place;
	private String adj2;
	private String noun;
	private String food;
	private String songTitle;
	private String verb;
	private String adj3;
	
	public void main(String[] args) {
		getInput();
		printStory();
	}
	
	private void getInput() {
		Scanner keyboard = new Scanner(System.in);
		
		// can you rearrange so it's all prompts and then all parsing?
		System.out.print("Enter a person's name: ");
		personsName = keyboard.nextLine();
		System.out.print("Enter a number: ");
		num1 = Integer.parseInt(keyboard.nextLine());
		System.out.print("Enter a number: ");
		num2 = Integer.parseInt(keyboard.nextLine());
		System.out.print("Enter a place: ");
		place =keyboard.nextLine();
		System.out.print("Enter an adjective: ");
		adj2 =keyboard.nextLine();
		System.out.print("Enter a food: ");
		food =keyboard.nextLine();
		System.out.print("Enter the title of a song: ");
		songTitle =keyboard.nextLine();
		System.out.print("Enter a verb: ");
		verb =keyboard.nextLine();
		System.out.print("Enter an adjective: ");
		adj3 =keyboard.nextLine();
		
		keyboard.close();
	}
	
	private void printStory() {
		System.out.println(personsName + "was feeling very " +
				adj1 + " today, because today they turned " +
				num1 + " years old! In just a few minutes, " +
				num2 + " of their friends would be coming to their " +
				place + " for their birthday party. The " +
				place + " was covered in " +
				adj2 + " " + noun + " decorations and their birthday " +
				food + " was waiting on the talbe. As soon as their friends came, they would sing '" +
				songTitle + "' to them and everyone would " +
				verb + " the " + food + "! it was going to be a " +
				adj3 + " day.");
			
	}
}
