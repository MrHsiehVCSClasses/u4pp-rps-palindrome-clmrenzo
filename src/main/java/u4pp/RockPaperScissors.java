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
    	
    	System.out.println ("Welcome to Rock Paper Scissors");
        System.out.println ("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny:" );
        String firstChoice = sc.nextLine();
        firstChoice.toUpperCase();
        //String computerChoice = getRandomChoice();
        //if (results("R","P") == 1) {
        //	wins ++;
        
        
       // }
         //else if (results("A","P")== 1) {
        	
        	//wins++;
        	//System.out.println ("You picked Rock, and the computer picked Paper. You lose!");
        //}
      while (resume == true) {
        if ((firstChoice.equals("R")) && getRandomChoice().equals ("S")) {
        	System.out.println ("You picked Rock, and the Computer picked Scissors. You Win!");
        	wins ++;
        	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
        
        }
         else if ((firstChoice.equals("R")) && getRandomChoice().equals ("P")) {
        	System.out.println ("You picked Rock, and the Computer picked Paper. You Lose.");
        	losses++;
        	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
         }
         else if ((firstChoice.equals("R") && getRandomChoice().equals("R"))) {
        	System.out.println("You both picked Rock. It's a tie! ");
        	ties++;
        	System.out.println ("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
         }
        	
        	System.out.println("Would you like to play again?");
        	String Continue = sc.nextLine() ;
         if (Continue.equals ("N")|| Continue.equals("n")) {
        	 
        	 System.out.println ("Thank you for playing!");
        	 sc.close();
        	 resume = false;
        	
         }
         while (!(Continue.equals("N")|| Continue.equals("n"))) {
        	if (Continue.equals("Y") || Continue.equals("y")) {
        		resume = true;
        	}
        	System.out.println("Invalid Input, please try again");
        	//String tryAgain = sc.nextLine();
        	//if 
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
    
    

    
    	
		public static String getRandomChoice () {
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
			System.out.println("Would you like to play again (Y)es (N)o?");
	        return null;
		}
}

    
    