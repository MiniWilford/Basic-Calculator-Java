import java.util.Scanner; // Java Libraray allowing input
        /*
         * 
         * Devs: MiniWilford / Soupcan
         * 
         */

public class Calculator {
    //Simple program reiterating basics of Java syntax
    public static void main(String[] args) {
         // user input object
        Scanner input = new Scanner(System.in);


        System.out.println("Hello and welcome to the Java Calculator program." + "\n");

        // Logic to continue / end program
        boolean running = true; 
        do {
            //Start of Main logic of program
            System.out.print("Would you like to calculate something? [Y]es / [N]o: ");
            
            //Get User Input
            String answer = input.nextLine();
            // input.close(); //Neccessary to prevent resource leak (causes errors)


            //Logic to determine to start program or exit
            if(answer.toLowerCase() == "y" || answer.toLowerCase() == "yes") {
                // User answers 'yes'
                System.out.println("\n" + "You typed yes");
            }
            else if(answer.toLowerCase() == "n" || answer.toLowerCase() == "no") {
                // User answers 'no'
                running = false;
                System.out.println("\n" + "You typed no");
            }
            else {
                // If input doesn't match desired 
                System.out.println("\n" + "Sorry, I don't understand, please try again");
            }
        } while(running);
    } // End of Main class
}
