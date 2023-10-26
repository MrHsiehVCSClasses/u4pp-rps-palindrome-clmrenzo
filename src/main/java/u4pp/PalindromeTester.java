package u4pp;
/**
* YOUR COMMENTS HERE
*/
import java.util.Scanner;

public class PalindromeTester {
    /**
     * YOUR JAVADOC HERE
     */
    public static void execute(Scanner sc) {
        System.out.println("Welcome to Palindrome Tester");
        boolean resume = true; 
        boolean loopResume = true;
        while (resume) {
        	System.out.println("Enter a Phrase:");
        	String input = sc.nextLine();
        	if (isPalindrome(input)) {
        		System.out.println(input + " is a palindrome");
        	}
        	else {
        		System.out.println(input + " is not a palindrome");
        	}
        	loopResume = true;
        	while (loopResume) {
        		System.out.println ("Keep testing? (Y)es or (N)o: ");
        		String choice = sc.nextLine().toUpperCase();
        		if (choice.equals("Y")) {
        			loopResume = false;
        			
        		}
        		else if (choice.equals("N")) {
        			resume = false;
        			loopResume= false;
        			sc.close();
        		}
        		else {
        			System.out.println ("Invalid Input, please try again");
        		}
        	}
        }
        
    }

    /**
     * YOUR JAVADOC HERE
     */
    public static boolean isPalindrome(String phrase) {
      String backwards = "";
      for (int letters = phrase.length()-1; letters >= 0; letters --) {
    	  backwards += phrase.substring(letters,letters+1);
      
      }
      if (phrase.toUpperCase().equals(backwards.toUpperCase())) {
    	  return true;
      }
      return false;
    }

    /* Any helper methods you might need */
}