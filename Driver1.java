package Project2games;

import java.util.Scanner;

public class Driver1{
	public static void main(String[] args) {

		int level = 1;
		boolean endGame = false;
		boolean endLoop = true;
		
	    Game g = null;  
		
		Scanner myObj = new Scanner(System.in);  
		
		while(endLoop){
			System.out.println("Welcome to the Joshua gaming system!");
			System.out.println("Enter 1 to play Papers Please");
			System.out.println("Enter 2 to play Tic Tac Toe"); // ADD GAME HERE
			System.out.println("or enter QUIT at any time to end the game");
			
		    String input = myObj.nextLine().trim().toLowerCase();
		    		    		    
		    if(input.equals("1")) {
		    	g = new PapersPleaseGame();
		    	endLoop = false;
		    }else if(input.equals("2")) {
		    	g = new TicTacToe();
		    	endLoop = false;
		    }else if(input.equals("quit")) {
		    	System.exit(0); 
		    }else {
		    	System.out.println("Please Enter Valid Option (1 or 2).");
		    }
	
		}
		
		g.ExplainRules();
		 
		while(!endGame){
			
			g.Setup(level);
			
			String playAgain = g.CanPlayAgain(level);
			
			switch(playAgain){
				case ("lost"): 
					endGame = true; 
					break;
				case ("end"): 
					System.exit(0); 
					break;
				case ("again"): 
					endGame = false; 
					break;
		    }

			g.UsePlayerInput(level);
			
			String playAgain2 = g.CanPlayAgain(level);
			
			switch(playAgain2){
				case ("lost"): 
					endGame = true; 
					break;
				case ("end"): 
					System.exit(0); 
					break;
				case ("again"): 
					endGame = false; 
					break;
		    }
			
			level += 1;
			}
			
		myObj.close();
		}
	
}
	