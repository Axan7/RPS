import java.util.Random;
import java.util.Scanner;

class RPS{

    int compch, decide;
    char userch;
    String user, comp;
    Scanner sc = new Scanner(System.in);

    RPS() {
        compch = -1;
        decide = -1;
        userch = '\u0000';
        user = "";
        comp = "";
    }

    void choice(){

        Random r = new Random();
        compch = r.nextInt(3);

        System.out.println("\nWelcome to the Rock, Paper Scissors game Java Terminal version !!!\n");
        System.out.print("Choose (r) for Rock, (p) for Paper or (s) for Scissors and press Enter/Return key: ");
        userch = Character.toLowerCase(sc.next().charAt(0));

    }

    void compare(){

        switch (userch) {
            case 'r':
                user = "Rock";
                switch(compch){
                    case 0:
                        decide = 10;
                        comp = "Rock";
                        break;
                    case 1:
                        decide = 0;
                        comp = "Paper";
                        break;
                    case 2:
                        decide = 1;
                        comp = "Scissors";
                        break;
                }
                break;
            
            case 'p':
                user = "Paper";
                switch(compch){
                    case 0:
                        decide = 1;
                        comp = "Rock";
                        break;
                    case 1:
                        decide = 10;
                        comp = "Paper";
                        break;
                    case 2:
                        decide = 0;
                        comp = "Scissors";
                        break;

                }
                break;
            
            case 's':
                user = "Scissors";
                switch(compch){
                    case 0:
                        decide = 0;
                        comp = "Rock";
                        break;
                    case 1:
                        decide = 1;
                        comp = "Paper";
                        break;
                    case 2:
                        decide = 10;
                        comp = "Scissors";
                        break;
                }
                break;
        
            default:
                decide = -1;
        }
    }

    void showResult(){

        if (decide != -1 ){

            if (decide == 0)
                System.out.println("Sorry! You lose");
            
            else if (decide == 1)
                System.out.println("Congratulations! You Won");
            else if (decide == 10)
                System.out.println("Its a Tie!");
            System.out.println("Computer choosed " + comp + " and you choosed " + user);
        }

        else{
            System.out.println("Invalid Input");
            System.out.println("Type (h) and press Enter/Return key for help");
            userch = sc.next().charAt(0);
            sc.close();

            if (userch == 'h'){
                System.out.println("\nRPS(Rock, Paper, Scissors) Java Terminal Version is a virtual version of the Rock, Paper Scissors game in which you choose of one of the");
                System.out.println("three things i.e., Rock, Paper or Scissors then the computer also chooses any of these three things randomly which is then compared");
                System.out.println("with your choice and then it is decided whether you win or lose the game or the game was a tie.\n");

                System.out.println("Input Rules\n");
                System.out.println("1. Press (r) if you want to choose Rock");
                System.out.println("2. Press (p) if you want to choose Paper");
                System.out.println("3. Press (s) if you want to choose Scissors\n");

                System.out.println("Game Rules\n");

                System.out.println("Rock-Paper Paper wins");
                System.out.println("Rock-Scissors Rock wins");
                System.out.println("Paper-Scissors Scissors wins\n");

                System.out.println("Game is a tie when the player and the computer both choosed the same of the three options i.e., ");
                System.out.println("Rock-Rock is a tie");
                System.out.println("Paper-Paper is a tie");
                System.out.println("Scissors-Scissors is a tie");
            }
        }
    }

    public static void main(String[] args) {

        RPS rps = new RPS();
        rps.choice();
        rps.compare();
        rps.showResult();
    }
}