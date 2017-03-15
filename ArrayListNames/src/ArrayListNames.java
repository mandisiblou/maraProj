
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ArrayListNames
{
    public static void main(String[]args)
    {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        int chances = 3;
        char choice = 'Y';
        ArrayList<String> carNames = new ArrayList<String>();

        carNames.add("Nissan");
        carNames.add("Ford");
        carNames.add("BMW");
        carNames.add("Ferrari");
        carNames.add("Chevrolet");
        carNames.add("Honda");
        carNames.add("Lamborgini");

        while(choice =='Y')
        {
            System.out.println("Index\tCarMake");
            for(int i = 0;i <carNames.size();i++)
            {
                System.out.printf("\n%d\t%s",i, carNames.get(i));
            }

            int randomPick = ran.nextInt(carNames.size());

            System.out.println("\n\nGuess which one of the car names in the list was picked: ");
            System.out.println(carNames.get(randomPick));
            String guess = scan.nextLine();
            while(chances > 1)
            {
                if(guess.equalsIgnoreCase(carNames.get(randomPick)))
                {
                    System.out.println("\nCONGRATULATIONS, THAT'S CORRECT!!!");
                    carNames.remove(randomPick);
                    break;
                }
                else
                {
                    System.out.println("\nSORRY, THAT'S WRONG!!!");
                    carNames.add(guess);
                    chances--;
                    System.out.printf("\nYou have %d chances remaining", chances);
                }
                System.out.println("\n\nGuess which one of the car names in the list was picked: ");
                guess = scan.nextLine();
            }
            System.out.println("\nDo you want to play again? Y/N: ");
            choice = scan.nextLine().toUpperCase().charAt(0);
        }
        System.out.println("\nThank you for playing, have a nice day!");
    }
}

