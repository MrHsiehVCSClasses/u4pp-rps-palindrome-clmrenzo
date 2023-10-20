package u4pp;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to u4pp! Use this space to test your code as you go.\nGood luck! :)\n");
    
        Scanner myScanner = new Scanner(System.in);
        RockPaperScissors.play(myScanner);
        myScanner.close();
        
    }
}
