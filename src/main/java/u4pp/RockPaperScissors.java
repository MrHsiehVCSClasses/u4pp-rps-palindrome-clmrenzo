package u4pp;

/**
* JAVADOC HERE
*/
import java.util.Scanner;

public class RockPaperScissors {

    
	
    /**
     * JAVADOC HERE
     */
    public static void play(Scanner sc) {
    	int ties = 0;
    	int losses = 0;
    	int wins = 0;
    	boolean resume = true;
    	boolean resumeLoop = true;
    	System.out.println ("Welcome to Rock Paper Scissors");
        
        
        
      while (resume == true) {
    	  System.out.println ("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny:" );
    	  String computerChoice = getRandomChoice();
    	  String firstChoice = sc.nextLine().toUpperCase();
    	if (firstChoice.equals("A")) {
    		 firstChoice = getRandomChoice();
    	 }
    	
    	if ((firstChoice.equals("R")) && computerChoice.equals ("S")) {
        	System.out.println ("You picked Rock, and the Computer picked Scissors. You Win!");
        	wins ++;
        	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
        	resumeLoop=true;
        }
         else if ((firstChoice.equals("R")) && computerChoice.equals ("P")) {
        	System.out.println ("You picked Rock, and the Computer picked Paper. You Lose.");
        	losses++;
        	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
        	resumeLoop=true;
         }
         else if ((firstChoice.equals("R") && computerChoice.equals("R"))) {
        	System.out.println("You both picked Rock. It's a tie! ");
        	ties++;
        	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
        	resumeLoop=true;
         }
         else if ((firstChoice.equals("P") && computerChoice.equals("R"))){
        	System.out.println("You picked Paper, and the Computer picked Rock. You Win! ");
         	wins++;
         	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
         	resumeLoop=true;
         }
         else if ((firstChoice.equals("P") && computerChoice.equals("S"))){
         	System.out.println("You picked Paper, and the Computer picked Scissors. You Win! ");
          	losses++;
          	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
          	resumeLoop=true;
         }
         else if ((firstChoice.equals(computerChoice))){
         	System.out.println("You both picked Paper. It's a tie! ");
          	ties++;
          	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
          	resumeLoop=true;
         }
         else if ((firstChoice.equals("S") && computerChoice.equals("R"))){
         	System.out.println("You picked Scissors, and the Computer picked Rock. You Lose ");
          	losses++;
          	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
          	resumeLoop=true;
         }
         else if ((firstChoice.equals("S") && computerChoice.equals("P"))){
         	System.out.println("You picked Scissors, and the Computer picked Paper. You Win! ");
          	wins++;
          	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
          	resumeLoop=true;
         }
         else if ((firstChoice.equals(computerChoice))){
         	System.out.println("You both picked Paper. You Tied! ");
          	ties++;
          	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
          	resumeLoop=true;
         }
         
         else if (!(firstChoice.equals("R")	|| firstChoice.equals("P")|| firstChoice.equals("S") || firstChoice.equals("A"))) {
        	 invalidEntry();
        	 resumeLoop = false;
        	 resume = true;
         }
         else {
        	 resume = true; 
         }
    	while (resumeLoop) {
    		System.out.println("Would you like to play again (Y)es (N)o?");
        	String Continue = sc.nextLine().toUpperCase() ;
        	
        	if (Continue.equals ("N")) {
        		System.out.println ("Thank you for playing!");
           	 	sc.close();
           	 	resume = false;
           	 	resumeLoop=false;
         }
        	else if (Continue.equals("Y")) {
        		resume = true;
        		resumeLoop= false;
        	}
        	else if (!Continue.equals("Y")) {
        		invalidEntry();
         }
        	
         
         
    	}
        	 
        	
          
      }     
         
         
     } 
   
    /**
     * JAVADOC HERE
     */
    public static int results(String playerChoice, String computerChoice) {
       
    	playerChoice.toUpperCase();
    	
    	if (playerChoice.equals("R") && computerChoice.equals("P"))
        {
        	return -1;
        }
        else if (playerChoice.equals(computerChoice)) {
        	return 0;
        }
        else if (playerChoice.equals("P")  && computerChoice.equals("R"))
        {
        	return 1;
        }
        else if ((playerChoice.equals("S") || playerChoice.equals ("s")) && (computerChoice.equals("P")|| computerChoice.equals("p")))
        {
        	return 1;
        }
        else if ((playerChoice.equals("S") || playerChoice.equals ("s")) && (computerChoice.equals("R")|| computerChoice.equals("r"))) 
        {
        	return -1;
        }
        else if ((playerChoice.equals("R") || playerChoice.equals ("r")) && (computerChoice.equals("S")|| computerChoice.equals("s"))) 
        {
        	return 1;
        }
        else if ((playerChoice.equals("P") || playerChoice.equals ("p")) && (computerChoice.equals("S")|| computerChoice.equals("s"))) 
        {
        	return -1;
        }
        else {
        	return 0;
        }
    }
    
    

    
    	
		private static String getRandomChoice () {
		int a = (int)(Math.random()*3)+1;
			if (a == 1) {
				return  "R";
			}
			else if (a == 2) {
				return "P";
			}
			else if (a == 3) {
				return "S";	
			}
			else {
				return null;
			}
		}
		public static String invalidEntry() {
			System.out.println("Invalid Input, please try again");
	        return null;
		}
}

    
    