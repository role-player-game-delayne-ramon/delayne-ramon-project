import java.util.Scanner;

public class adventure {
    public static void main(String[] args) {
        System.out.println("Adventure Sk8er Game is ready!");
        Scanner input = new Scanner(System.in);
        rollDice(input);

    }

    public static void rollDice(Scanner input) {

        System.out.println("\n\nWUZZZUUUUUUUP sk8ers!!! Today you are going to the sk8 park!\nGrumpy Mr.Neebercracker is hating as usual and throwing newspapers\nat you to try and stop you!" +
                " So you have to do your best to avoid him.\nAt the beginning, you are given 3 lives. Each time Neeebercracker hits\nyou with a newspaper, you lose a life. If you roll a 6 you will bypass\nhim all together! If not, hold on to your hats!\n\nAre you ready to ROCK N ROLL?  [y/n]");
        String userResponse = input.nextLine();

        if (userResponse.equalsIgnoreCase("y")) {
            System.out.println("Let's ROCK then!");

        } else {
            System.out.println("Peace out DUDE!");
            return;
        }

        System.out.println("What do they call you DUDE?");
        String userName = input.nextLine();
        int heroHealth = 3;

        while (true) {

            System.out.println(" Hey " + userName + ", to roll the dice, pick a number 1 through 6.");
            short n = Short.parseShort(input.nextLine());
            int range = n - 1 + 1;
            System.out.println("roll dice = " + ((int) (Math.random() * range) + 1));


            String again = "y";

            while (again.equalsIgnoreCase("y")) {
                System.out.println("Rolling the dice...");
                int die1 = (int) (Math.random() * 6) + 1;

                System.out.println("Your computed roll is " + die1);

                if (die1 == 6) {
                    System.out.println("FAR OUT " + userName + "! Hang on to this car bumper for a FREE PASS!");
//                    break;

                } else if (die1 % 2 == 0) {

                    System.out.println("GNARLY " + userName + " ! He missed!");

                } else if (die1 % 2 != 0) {
                    heroHealth--;
                    System.out.println("AAAWWWW sorry " + userName + "! Lose 1 life!");
                    if (heroHealth == 0) {
                        System.out.println("GAME OVER! ");
                        break;
                    }
                }
                System.out.print("Roll again? [y/n] ");
                again = input.nextLine();
            }
        }

    }

}




