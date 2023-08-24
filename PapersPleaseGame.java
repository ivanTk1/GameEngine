package Project2games;

import java.util.Scanner;

public class PapersPleaseGame extends Game {
	
	Scanner myObj = new Scanner(System.in);   
	ArtForPapersPlease art = new ArtForPapersPlease();
	boolean WinOrLose = true;
	
	@Override
	public void ExplainRules() {
		boolean yes = false;
		System.out.println( "Hello Comrade," );
		System.out.println( "Welcome to your first day as a ");
		System.out.println( "border crossing guard in our glorious country");
		System.out.println( "of Vostokia. This job is very simple, check");
	    System.out.println( "the citizen's passport, make sure they have ID photo,");
	    System.out.println( "make sure they are Vostokian. Some spies will try to ");
	    System.out.println( "trick you with fake passports. If you aren't sure you");
	    System.out.println( "can question the citizens. Remember these answers:");
	    System.out.println( "Leader: Supreme Commander Maximilian Bartholomew Ignatius Fitzroy III Lord of the Glorious and Prosperous Republic of Vostokia");
	    System.out.println( "Capital: Vodkagrad");
	    System.out.println( "Favorite Dish: Borsch");
	    System.out.println( "Mess up and it's off to the gulags! Understand? yes or no? ");
	    //Hello  
	    while(!yes) {
	    	String input = myObj.nextLine().trim().toLowerCase(); 
	    	if(input.equals("yes")) {
	    		yes = true;
	    	}else if(input.equals("quit")){
	    		System.exit(0);
	    	}else{
	    		System.out.println("Please eneter yes if you have read the instructions!");
	    	}	
		}  
	     
	}
	
	@Override
	public void Setup(int levelCount) {
		switch(levelCount) {
		case 1: art.Passport1(); break;
		case 2: art.Passport2(); break;
		case 3: art.Passport3(); break;
		case 4: art.Passport4(); break;
		case 5: art.Passport5(); break;
		case 6: art.Passport6(); break;
		case 7: art.Passport7(); break;
		case 8: art.Passport8(); break;
		case 9: art.Passport9(); break;
		case 10: art.Passport10(); break;			
		}
	}
	
	
	
	
	@Override
	public void UsePlayerInput(int levelCount) { 
		boolean loop = true;
		while(loop) {
			System.out.println("Would You Like to question (q), approve (a), or deny (d)?");
			loop = false;
			//Hello  
			String choice = myObj.nextLine().trim().toLowerCase(); 
			switch (choice) {
	        case ("q") :
				Questions(levelCount);
	        	loop = true;
	            break;
	        case "a":
	        	switch(levelCount) {
	    		case 1: System.out.println("Good job soldier!"); break;
	    		case 2: System.out.println("You are going to gulag, never to be seen again.");WinOrLose = false; break;
	    		case 3: System.out.println("You are going to gulag, never to be seen again.");WinOrLose = false; break;
	    		case 4: System.out.println("Good job soldier!");break;
	    		case 5: System.out.println("You are going to gulag, never to be seen again.");WinOrLose = false; break;
	    		case 6: System.out.println("Good job soldier!");break;
	    		case 7: System.out.println("You are going to gulag, never to be seen again.");WinOrLose = false; break;
	    		case 8: System.out.println("Good job soldier!");break;
	    		case 9: System.out.println("You are going to gulag, never to be seen again.");WinOrLose = false; break;
	    		case 10: System.out.println("Good job soldier!"); break;	
	    		}break;	
	        	
	        case "d":
	        	switch(levelCount) {
	    		case 1: System.out.println("You are going to gulag, never to be seen again. ");WinOrLose = false; break;
	    		case 2: System.out.println("Good catch soldier!"); break;
	    		case 3: System.out.println("Good catch soldier! hehehehe, get it? hehehehe");break;
	    		case 4: System.out.println("You are going to gulag, never to be seen again.");WinOrLose = false; break;
	    		case 5: System.out.println("Good catch soldier!"); break;
	    		case 6: System.out.println("You are going to gulag, never to be seen again.");WinOrLose = false; break;
	    		case 7: System.out.println("Good catch soldier!");break;
	    		case 8: System.out.println("You are going to gulag, never to be seen again.");WinOrLose = false; break;
	    		case 9: System.out.println("Good catch soldier!"); break;
	    		case 10: System.out.println("You are going to gulag, never to be seen again.");WinOrLose = false; break;		
	        	}break;
	    		
	        case "quit":
	        	System.exit(0);
	            break;
	        default:
	            System.out.println("Invalid input!");
	            loop = true;
	            
			}
			 
		}
	}

	public void Questions(int levelCount) {
		//Hello  
		System.out.println("What question would you like to ask?");
        System.out.println("Who is the leader of our glorious land? (Press 1)");
        System.out.println("What is the capital of our glorious land? (Press 2)");
        System.out.println("What is the favorite dish of our glorious land? (Press 3)");
        // Start questioning the citizen
        boolean validation = true;
        while(validation ) {
        	validation = false;
		    System.out.println("Please enter number 1-3.");
	        String input = myObj.nextLine().trim().toLowerCase(); 
		    switch (input) {
	        case "1":
	        	switch(levelCount) {
	    		case 1: System.out.println("It's obviously: Supreme Commander Maximilian Bartholomew Ignatius Fitzroy III Lord of the Glorious and Prosperous Republic of Vostokia"); break;
	    		case 2: System.out.println("Adenoid Hynkel"); break;
	    		case 3: System.out.println("Glub Glub Glub"); break;
	    		case 4: System.out.println("Our glorious leader is: Supreme Commander Maximilian Bartholomew Ignatius Fitzroy III Lord of the Glorious and Prosperous Republic of Vostokia"); break;
	    		case 5: System.out.println("Ugh ugh ugh, not sure!"); break;
	    		case 6: System.out.println("If I remember correctly it's: Supreme Commander Maximilian Bartholomew Ignatius Fitzroy III Lord of the Glorious and Prosperous Republic of Vostokia"); break;
	    		case 7: System.out.println("Supreme Commander Maximilian Bartholomew Ignatius Fitzroy III Lord of the Glorious and Prosperous Republic of Vostokia"); break;
	    		case 8: System.out.println("Supreme Commander Maximilian Bartholomew Ignatius Fitzroy III"); break;
	    		case 9: System.out.println("I've seem to forgotten it's been so long"); break;
	    		case 10: System.out.println("UHhHhhhhHHhhHHhHHhhhhh..... Supreme Commander Maximilian Bartholomew Ignatius Fitzroy III Lord of the Glorious and Prosperous Republic of Vostokia"); break;			
	    		}
	            break;
	        case "2":
	        	switch(levelCount) {
	    		case 1: System.out.println("Vodkagrad, Everyone knows that!"); break;
	    		case 2: System.out.println("Vodkagrad, even I know that."); break;
	    		case 3: System.out.println("Glub Glub Glub"); break;
	    		case 4: System.out.println("I am a professor, don't ask such silly questions, Vodkagrad!"); break;
	    		case 5: System.out.println("Washington D.C."); break;
	    		case 6: System.out.println("My birthplace: Vodkagrad!"); break;
	    		case 7: System.out.println("Vodkagrad"); break;
	    		case 8: System.out.println("Vodkagrad, you know if you want I can get you some of their main export...."); break;
	    		case 9: System.out.println("Winegrad!"); break;
	    		case 10: System.out.println("VoDKagRAd!"); break;			
	    		}
	            break;
	        case "3":
	        	switch(levelCount) {
	    		case 1: System.out.println("Borsch, my grandma makes the best one!"); break;	
	    		case 2: System.out.println("I think it's  Borsch, I remember reading about it?"); break;	
	    		case 3: System.out.println("Glub Glub Glub"); break;	
	    		case 4: System.out.println("My favorite food, Borsch!"); break;	
	    		case 5: System.out.println("Hamburgers and bald eagles!!!!!!"); break;	
	    		case 6: System.out.println("Borsch!"); break;	
	    		case 7: System.out.println("Borsch"); break;	
	    		case 8: System.out.println("My second favorite food, Borsch!"); break;	
	    		case 9: System.out.println("Beet Soup!"); break;	
	    		case 10: System.out.println("Borschhchhchchchchhcch!"); break;				
	    		}
	        	validation = false;
	            break;
	        case "quit":
	        	System.exit(0);
	            break;
	        default:
	        	System.out.println("Invalid input!");
	        	validation = true;
	            break;
		    }
        }
        
	}
	
	@Override
	public String CanPlayAgain(int levelCount) {
		if(!WinOrLose) {
			art.Lose(); 
			return "lost";
		}else if(levelCount == 9){
			art.End(); 
			return "end";
		}else {
			return "again";
		}
	}

	
	//	myObj.close();
	// This does not work and i'm not sure why
	
}
