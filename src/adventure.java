import java.util.Scanner;

public class adventure {
    public static void main (String [] args) {
        System.out.println("adventure game is ready!");
        Scanner input = new Scanner(System.in);
    rollDice(input);

    }

public static void rollDice (Scanner input) {

        System.out.println("Are you ready to ROCK N ROLL?  [y/n]");
        String userResponse = input.nextLine();

        if (userResponse.equalsIgnoreCase("y")) {
            System.out.println("Let's ROCK then!");

        } else {
            System.out.println("Peace out DUDE!");
            return;
        }

        System.out.println("What do they call you DUDE?");
        String userName = input.nextLine();

        while( true ){
    //        System.out.println("rollDice test");

            System.out.println(" T0 roll the dice, pick a number 1 through 6. If you roll a 6 you pass the grumpy neighbor! If not, hold on to your hat!");
            short n = Short.parseShort(input.nextLine());
            int range = n - 1 + 1;
            System.out.println("roll dice = " + ((int)(Math.random() * range) + 1) );


            String again = "y";

            while (again.equalsIgnoreCase("y")) {
                System.out.println("Rolling the dice...");
                int die1 = (int)(Math.random()*6) + 1;




                System.out.println("Your computed roll is " + die1);

    //            6 -car speed, 1 -newspaper
//                int heroHealth = 3;

                if(die1 == 6) {

                    System.out.println("FAR OUT MAN! Hang on to this car bumper for a FREE PASS!");
                    break;

                } else if (die1 % 2 == 0) {

                    System.out.println("GNARLY DUDE! He missed!");

                } else if(die1 % 2 != 0){

                    int i = 0;
                    while (i < 3){
                        System.out.println("AAAWWWW busted! Lose 1 life!");
                        i++;

                    }
                    System.out.println("GAME OVER! ");
                }

                System.out.print("Roll again? [y/n] ");
                again = input.nextLine();

            }
    //        return input;
        }

        }


}

