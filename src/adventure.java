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

        System.out.println(" Tp roll the dice, pick a number 1 through 6. If you Roll the dice and if you roll a 6 you pass the grumpy neighbor!");
        short n = Short.parseShort(input.nextLine());
        int range = n - 1 + 1;
        System.out.println("roll dice = " + ((int)(Math.random() * range) + 1) );

//        if ( )

//        System.out.println("Do you wish to continue? y/n");
//        if(input.nextLine().toLowerCase().equals("n")){
//            break;
//        }
    }


}
}
