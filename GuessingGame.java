package com.guess;

import java.util.Scanner;

class Guesser {
	
	int guesserNum;
	
	public int guessingNum() {
		
		int value;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey guesser please guess the number between 1 to 10 ");
		value = scan.nextInt();
						
		if(value>=1 && value<=10) {
			guesserNum = value;
		}
		else {
			System.out.println("Oops the entered number is not valid. pls enter the valid number");
		}	
		
		return guesserNum ;
		
	} 
		
}

class Australia {
	
	int ausNum;
	
	public int ausGuessingNum() {
		
		int value;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey Australia please enter the number between 1 to 10");
		value = scan.nextInt();
		if(value>=1 && value<=10) {
			ausNum = value;
		}
		else {
			System.out.println("Please enter the correct number");
		}
		return ausNum;
	}
}

class Newzealand {
	
	int newzNum;
	
	public int newzGuessingNum() {
		
		int value;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey Newzealand please enter the number between 1 to 10");
		value = scan.nextInt();
		if(value>=1 && value<=10) {
			newzNum = value;
		}
		else {
			System.out.println("Please enter the correct number");
		}
		return newzNum;
	}
}

class England {
	
	int engNum;
	
	public int engGuessingNum() {
		
		int value;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey England please enter the number between 1 to 10");
		value = scan.nextInt();
		if(value>=1 && value<=10) {
			engNum = value;
		}
		else {
			System.out.println("Please enter the correct number");
		}
		return engNum;
	}
}

class India {
	
	int indNum;
	
	public int indGuessingNum() {
		
		int value;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey India please enter the number between 1 to 10");
		value = scan.nextInt();
		if(value>=1 && value<=10) {
			indNum = value;
		}
		else {
			System.out.println("Please enter the correct number");
		}
		return indNum;
	}
}



class Umpire {
	
	int guesserNum;
	int ausNum;
	int newzNum;
	int engNum;
	int indNum;
	
	
	public int numFromGuesser() {
		Guesser guess = new Guesser();
		guesserNum = guess.guessingNum();
		return guesserNum;
		
	}
	
	public int numFromAus() {
		Australia aus = new Australia();
		ausNum = aus.ausGuessingNum();
		return ausNum;
	}
	
	public int numFromNewzee() {
		Newzealand nz = new Newzealand();
		newzNum = nz.newzGuessingNum();
		return newzNum;
	}
	
	public int numFromEngland() {
		England eng = new England();
		engNum = eng.engGuessingNum();
		return engNum;
		
	}
	
	public int numFromInd() {
		India ind = new India();
		indNum = ind.indGuessingNum();
		return indNum;
	}
	
	
	
	public void compareNumValues() {
		if(guesserNum == ausNum) {
			if(guesserNum == newzNum && guesserNum == engNum && guesserNum == indNum) {
				
				System.out.println("All the players have guessed correctly, so the match is tied");
			}
			else if(guesserNum == newzNum && guesserNum == engNum){
				
				System.out.println("Australia, Newzealand, England,"
						+ "have guessed it correctly");				
				
			}
			else if(guesserNum == newzNum && guesserNum == indNum) {
				
				System.out.println("Australia, Newzealand, India"
						+ "have guessed correctly");
			}
			
			else if(guesserNum == newzNum) {
				
				System.out.println("Australia, Newzealand "
						+ "have guessed correctly");
			}
			
			else if(guesserNum == engNum) {
				
				System.out.println("Australia, England"
						+ "have guessed correctly");
			}
			
			else if(guesserNum == indNum) {
				
				System.out.println("Australia, India"
						+ "have guessed correctly");
			}
			
			else {
				
				System.out.println("Australia have Guessed it correctly");		
			}
	
		}
		
		else if(guesserNum == newzNum) {
			if(guesserNum == engNum && guesserNum == indNum) {
				System.out.println("NewZealand, England and india have guessed it correctly");
			}
			else if(guesserNum == engNum) {
				System.out.println("Newzealand and England have guessed it correctly");
			}
			else if(guesserNum == indNum){
				System.out.println("Newzeland and India have guessed it correctly");
			}
			else {
				System.out.println("NewZealand have guessed it correctly");
			}
		}
		
		else if(guesserNum == engNum) {
			if(guesserNum == indNum) {
				System.out.println("England and India have guessed it correctly");
			}
			else{
				System.out.println("England have guessed it correctly");
			}
		}
		
		else if(guesserNum == indNum){
			System.out.println("India have guessed it correctly");
		}
		
		else {
			System.out.println("No one have guessed the number correctly, Try again");
		}
		
	}
	
	public void welcome() throws InterruptedException {
		System.out.println("Welcome to Guessing Game championship");
		System.out.println();
		Thread.sleep(1000);
		System.out.println("The player have to guess the number between 1 to 10");
		System.out.println();
		Thread.sleep(1000);
		System.out.println("Whoever guessed the number correctly the Umpire will declare the player as Winner");
		System.out.println();
	}
	
	public void playersList() {
		System.out.println("List of players who have participated: ");
		String []std = new String[4];
		std[0] = "Australia";
		std[1] = "Newzeland";
		std[2] = "England";
		std[3] = "India";	
		
		for(int i=0; i<std.length; i++) {
			
			System.out.println(std[i]);
	
		}
		System.out.println();
				
	}
	
		
	}

	

public class GuessingGame {

	public static void main(String[] args) throws InterruptedException {
		Umpire ump = new Umpire();
		ump.welcome();
		ump.playersList();
		ump.numFromGuesser();
		ump.numFromAus();
		ump.numFromNewzee();
		ump.numFromEngland();
		ump.numFromInd();
		ump.compareNumValues();

	}

}
