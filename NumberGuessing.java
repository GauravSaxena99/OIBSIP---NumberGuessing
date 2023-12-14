import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    public static void main(String[] args) {
                // to get the random number, we will use Random class
                Scanner sc = new Scanner(System.in);
                while(true){
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // range from 1 to 100

        int trycount = 0;
        while (true) {
            // To get the different random number at every try
            // int randomNumber = rand.nextInt(100) + 1; (range from 1 to 100)
            System.out.println("Guess the number (1-100)");
            int input = sc.nextInt(); // taking input from user
            trycount++;
            if (input == randomNumber) {
                System.out.println("Correct..!!! You win Congratulations");
                System.out.println("You tried " + trycount + " times");
                break; 
            } else if (randomNumber < input) {
                System.out.println("Sorry..!!! Your number is higher\n");
            } else {
                System.out.println("Sorry..!!! Your number is lower\n");
            }
        }
        sc.nextLine();
        System.out.println("Do you want to play again ? (yes/no)");
        String userChoice = sc.nextLine().toLowerCase();
        
        if(userChoice.equals("yes"))
        {
            System.out.println("Game Restarted");
        }
        else{
            System.out.println("Well Played...!!! Thank You\n");
            break;
        }
            
        //sc.close();
         }
        }
}
