package Project2games;

import java.util.Random;
import java.util.Scanner;



public class TicTacToe extends Game {

  //  String[] variables = new String[9];
    
    private String g1 = " ";
    private String g2 = " ";
    private String g3 = " ";
    private String g4 = " ";
    private String g5 = " ";
    private String g6 = " ";
    private String g7 = " ";
    private String g8 = " ";
    private String g9 = " ";    
    
    @Override
    public void ExplainRules() {
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Two players take turns marking a spot on a 3x3 grid.");
        System.out.println("The first player to get 3 in a row (horizontally, vertically, or diagonally) wins.");
        System.out.println("You will play as X.");
    }

    @Override
    public void Setup(int levelCount) {
    	switch(levelCount) {
    	case 1: ticTacToeGod1(); break;
    	case 2: ticTacToeGod2(); break;
    	case 3: ticTacToeGod3(); break;
    	case 4: ticTacToeGod4(); break;
    	case 5: ticTacToeGod5(); break;
    	}
    	printBoard();
    }
    	
    @Override
    public void UsePlayerInput(int levelCount) {
        
        //printBoard();
        // Get player input
        boolean loop = true;
        while(loop) {
        	System.out.println("Enter a your desired position starting with number followed by letter: (EX: 1a, 2c, 3b)");
            Scanner myObj = new Scanner(System.in);
            String inputString = myObj.nextLine();
             //myObj.close();

	        switch (inputString) {
	        case "1a":
	        	if(isValidMove(g1)) {
	            g1 = "X";
	            loop = false;
	        	}else {
	        		System.out.println("Location already taken, please try another.");
	        	}
	            break;
	        case "1b":
	        	if(isValidMove(g4)) {
		            g4 = "X";
		            loop = false;
		        	}else {
		        		System.out.println("Location already taken, please try another.");
		        	}
	            break;
	        case "1c":
	        	if(isValidMove(g7)) {
		            g7 = "X";
		            loop = false;
		        	}else {
		        		System.out.println("Location already taken, please try another.");
		        	}
	            break;
	        case "2a":
	        	if(isValidMove(g2)) {
		            g2 = "X";
		            loop = false;
		        	}else {
		        		System.out.println("Location already taken, please try another.");
		        	}
	            break;
	        case "2b":
	        	if(isValidMove(g5)) {
		            g5 = "X";
		            loop = false;
		        	}else {
		        		System.out.println("Location already taken, please try another.");
		        	}
	            break;
	        case "2c":
	        	if(isValidMove(g8)) {
		            g8 = "X";
		            loop = false;
		        	}else {
		        		System.out.println("Location already taken, please try another.");
		        	}
	            break;
	        case "3a":
	        	if(isValidMove(g3)) {
		            g3 = "X";
		            loop = false;
		        	}else {
		        		System.out.println("Location already taken, please try another.");
		        	}
	            break;
	        case "3b":
	        	if(isValidMove(g6)) {
		            g6 = "X";
		            loop = false;
		        	}else {
		        		System.out.println("Location already taken, please try another.");
		        	}
	            break;
	        case "3c":
	        	if(isValidMove(g9)) {
		            g9 = "X";
		            loop = false;
		        	}else {
		        		System.out.println("Location already taken, please try another.");
		        	}
	            break;
	        case "exit":
	        	System.exit(0); 
	        	break;
	        default:
	            System.out.println("Invalid input.");
	            loop = true;
	            break;
	        }
	    }
        
        
        
    }

    @Override
    public String CanPlayAgain(int levelCount) {
    	String result = isWinner();
        if (isBoardFull() ) {
            System.out.println("Board is full, it's a tie!");
            System.out.println("Tied Board:");
            printBoard();
            return "end";
        } else if (!result.equals("null")) {
            if(result.equals("X")) {
            	System.out.println("You have won, good job!");
            	System.out.println("Winning Board:");
            	printBoard();
            }else {
            	System.out.println("You have lost, too bad!");
            	System.out.println("Losing Board:");
            	printBoard();
            }
            return "end";
        } else {
            return "again";
        }
    }

    private void printBoard() {
    	System.out.println("  1    2    3  ");
    	System.out.println("     |   |    ");
    	System.out.println("a  " + g1 + " | " + g2 + " | " + g3 + "  ");
    	System.out.println(" ----+---+----");
    	System.out.println("b  " + g4 + " | " + g5 + " | " + g6 + "  ");
    	System.out.println(" ----+---+----");
    	System.out.println("c  " + g7 + " | " + g8 + " | " + g9 + "  ");
    	System.out.println("     |   |    ");


    					
    }

    private boolean isValidMove(String g) {
        if(g.equals(" ")) {
        	return true;
        }else {
        	return false;
        }
    }

    private String isWinner() {
        // Check all rows
        if (g1.equals("X") && g2.equals("X") && g3.equals("X")) {
            return "X";
        }
         if (g1.equals("O") && g2.equals("O") && g3.equals("O")) {
                return "O";
        }
         if (g4.equals("X") && g5.equals("X") && g6.equals("X")) {
             return "X";
         }
          if (g4.equals("O") && g5.equals("O") && g6.equals("O")) {
                 return "O";
         }
          if (g7.equals("X") && g8.equals("X") && g9.equals("X")) {
              return "X";
          }
           if (g7.equals("O") && g8.equals("O") && g9.equals("O")) {
                  return "O";
          }
        
        // Check all columns
           if (g1.equals("X") && g4.equals("X") && g7.equals("X")) {
               return "X";
           }
            if (g1.equals("O") && g4.equals("O") && g7.equals("O")) {
                   return "O";
           }
            if (g2.equals("X") && g5.equals("X") && g8.equals("X")) {
                return "X";
            }
             if (g2.equals("O") && g5.equals("O") && g8.equals("O")) {
                    return "O";
            }
             if (g3.equals("X") && g6.equals("X") && g9.equals("X")) {
                 return "X";
             }
              if (g3.equals("O") && g6.equals("O") && g9.equals("O")) {
                     return "O";
              }
        
        // Check diagonals
              if (g1.equals("X") && g5.equals("X") && g9.equals("X")) {
                  return "X";
              }
               if (g1.equals("O") && g5.equals("O") && g9.equals("O")) {
                      return "O";
              }
               if (g3.equals("X") && g5.equals("X") && g7.equals("X")) {
                   return "X";
               }
                if (g3.equals("O") && g5.equals("O") && g7.equals("O")) {
                       return "O";
               }
        
        // No winner yet
        return "null";
    }

    private boolean isBoardFull() {
        if(g1.equals(" ")|| g2.equals(" ")|| g3.equals(" ")|| g4.equals(" ")|| g5.equals(" ")|| g6.equals(" ")|| g7.equals(" ")|| g8.equals(" ")|| g9.equals(" ")) {
        	return false;
        }else {
        	return true;
        }
            
    }
    
    private void ticTacToeGod1(){
        g7 = "O";
    }
    
    private void ticTacToeGod2(){
        if(g1.equals("X") || g2.equals("X") || g4.equals("X")) {
        	g9 = "O";
        }else if(g6.equals("X") || g8.equals("X") || g9.equals("X")) {
        	g1 = "O";
        }else if(g3.equals("X")){
        	g2 = "O";
        }else if(g5.equals("X")) {
        	g3 = "O";
        }
    }
    
    private void ticTacToeGod3(){
    	boolean c = closeGap();
    	if(!c) {
    		boolean b = blockOpp();
    		if(!b) {
    			if(g9.equals("O") || g1.equals("O") ) {
    				g3 = "O";
    			}else if(g2.equals("O")) {
    				if(isValidMove(g5)) {
    				g5 = "O";
    				}else {
    					randomMove();
    				}
    			}else if(g5.equals("X")) {
        				if(isValidMove(g6)) {
            				g6 = "O";
            				}else {
            					randomMove();
            				}
    			}else if(g3.equals("O")) {
    				randomMove();
    			}

    		}
    	}
    	
    }
    private void ticTacToeGod4(){
    	boolean c = closeGap();
    	if(!c){
    		boolean b = blockOpp();
    		if(!b) {
    			randomMove();
    			

    		
    	}
    	
    }}
    private void ticTacToeGod5(){
    	boolean c = closeGap();
    	if(!c) {
    		boolean b = blockOpp();
    		if(!b) {
    				randomMove();
    		}
    	}
    }

    
    private boolean closeGap() {
    	if(g1.equals("O") && g2.equals("O")) {
    		if(isValidMove(g3)){
    			g3 = "O";
    			return true;
    		}
    	}else if(g2.equals("O") && g3.equals("O")) {
    		if(isValidMove(g1)){
    			g1 = "O";
    			return true;
    		}
    	}else if(g4.equals("O") && g5.equals("O")) {
    		if(isValidMove(g6)){
    			g6 = "O";
    			return true;
    		}
    	}else if(g5.equals("O") && g6.equals("O")) {
    		if(isValidMove(g4)){
    			g4 = "O";
    			return true;
    		}
    	}else if(g1.equals("O") && g3.equals("O")) {
    		if(isValidMove(g2)){
    			g2 = "O";
    		}
    	}else if(g4.equals("O") && g6.equals("O")) {
    		if(isValidMove(g5)){
    			g5 = "O";
    			return true;
    		}
    	}else if(g2.equals("O") && g5.equals("O")) {
    		if(isValidMove(g8)){
    			g8 = "O";
    			return true;
    		}
    	}else if(g3.equals("O") && g6.equals("O")) {
    		if(isValidMove(g9)){
    			g9 = "O";
    			return true;
    		}
    	}else if(g2.equals("O") && g8.equals("O")) {
    		if(isValidMove(g5)){
    			g5 = "O";
    			return true;
    		}
    	}else if(g6.equals("O") && g9.equals("O")) {
    		if(isValidMove(g3)){
    			g3 = "O";
    			return true;
    		}
    	}else if(g5.equals("O") && g9.equals("O")) {
    		if(isValidMove(g1)){
    			g1 = "O";
    			return true;
    		}
    	}else if(g1.equals("O") && g5.equals("O")) {
    		if(isValidMove(g9)){
    			g9 = "O";
    			return true;
    		}
    	}else if(g1.equals("O") && g9.equals("O")) {
    		if(isValidMove(g5)){
    			g5 = "O";
    			return true;
    		}
    	}else if(g3.equals("O") && g9.equals("O")) {
    		if(isValidMove(g1)){
    			g6 = "O";
    			return true;
    		}
    	}else if(g5.equals("O") && g8.equals("O")) {
    		if(isValidMove(g2)){
    			g2 = "O";
    			return true;
    		}
    	}
    	return false;
    		
    }
    
    private boolean blockOpp(){
    	if(g1.equals("X") && g2.equals("X")) {
    		if(isValidMove(g3)){
    			g3 = "O";
    			return true;
    		}
    	}else if(g1.equals("X") && g5.equals("X")) {
    		if(isValidMove(g9)){
    			g9 = "O";
    			return true;
    		}
    	}else if(g5.equals("X") && g9.equals("X")) {
    		if(isValidMove(g1)){
    			g1 = "O";
    			return true;
    		}
    	}else if(g2.equals("X") && g3.equals("X")) {
    		if(isValidMove(g1)){
    			g1 = "O";
    			return true;
    		}
    	}else if(g4.equals("X") && g5.equals("X")) {
    		if(isValidMove(g6)){
    			g6 = "O";
    			return true;
    		}
    	}else if(g5.equals("X") && g6.equals("X")) {
    		if(isValidMove(g4)){
    			g4 = "O";
    			return true;
    		}
    	}else if(g1.equals("X") && g3.equals("X")) {
    		if(isValidMove(g2)){
    			g2 = "O";
    			return true;
    		}
    	}else if(g4.equals("X") && g6.equals("X")) {
    		if(isValidMove(g5)){
    			g5 = "O";
    			return true;
    		}
    	}else if(g2.equals("X") && g5.equals("X")) {
    		if(isValidMove(g8)){
    			g8 = "O";
    			return true;
    		}
    	}else if(g3.equals("X") && g6.equals("X")) {
    		if(isValidMove(g9)){
    			g9 = "O";
    			return true;
    		}
    	}else if(g2.equals("X") && g8.equals("X")) {
    		if(isValidMove(g5)){
    			g5 = "O";
    			return true;
    		}
    	}else if(g6.equals("X") && g9.equals("X")) {
    		if(isValidMove(g3)){
    			g3 = "O";
    			return true;
    		}
    	}else if(g5.equals("X") && g9.equals("X")) {
    		if(isValidMove(g1)){
    			g1 = "O";
    			return true;
    		}
    	}else if(g1.equals("X") && g5.equals("X")) {
    		System.out.println(isValidMove(g9));
    		if(isValidMove(g9)){
    			g9 = "O";
    			return true;
    		}
    	}else if(g1.equals("X") && g9.equals("X")) {
    		if(isValidMove(g5)){
    			g5 = "O";
    			return true;
    		}
    	}else if(g3.equals("X") && g9.equals("X")) {
    		if(isValidMove(g1)){
    			g6 = "O";
    			return true;
    		}
    	}else if(g5.equals("X") && g8.equals("X")) {
    		if(isValidMove(g2)){
    			g2 = "O";
    			return true;
    		}
    	}
    	return false;	

    }
    

    
    private void randomMove() {
    	boolean loop = true;
    	while(loop) {
	    	Random random = new Random();
	        int randomNumber = random.nextInt(9) + 1;
	        switch(randomNumber) {
	        	case 1:
	        		if(isValidMove(g1)) {
	        			g1 = "O";
	        			loop = false;
	        		}else {
	        			loop = true;
	        		}
	        		break;
	        	case 2:
	        		if(isValidMove(g2)) {
	        			g2 = "O";
	        			loop = false;
	        		}else {
	        			loop = true;
	        		}
	        		break;
	        	case 3:
	        		if(isValidMove(g3)) {
	        			g3 = "O";
	        			loop = false;
	        		}else {
	        			loop = true;
	        		}
	        		break;
	        	case 4:
	        		if(isValidMove(g4)) {
	        			g4 = "O";
	        			loop = false;
	        		}else {
	        			loop = true;
	        		}
	        		break;
	        	case 5:
	        		if(isValidMove(g5)) {
	        			g5 = "O";
	        			loop = false;
	        		}else {
	        			loop = true;
	        		}
	        		break;
	        	case 6:
	        		if(isValidMove(g6)) {
	        			g6 = "O";
	        			loop = false;
	        		}else {
	        			loop = true;
	        		}
	        		break;
	        	case 7:
	        		if(isValidMove(g7)) {
	        			g7 = "O";
	        			loop = false;
	        		}else {
	        			loop = true;
	        		}
	        		break;
	        	case 8:
	        		if(isValidMove(g8)) {
	        			g8 = "O";
	        			loop = false;
	        		}else {
	        			loop = true;
	        		}
	        		break;
	        	case 9:
	        		if(isValidMove(g9)) {
	        			g9 = "O";
	        			loop = false;
	        		}else {
	        			loop = true;
	        		}
	        		break;
	        			
	      }
      
    	}
        
    }
    
    
    
}

