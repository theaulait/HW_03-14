package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/7/15.
 */

import java.util.Scanner;

public class Jungle {

    public static void Fox() {
        Scanner input = new Scanner(System.in);
        String answer, answer2;
        System.out.println("You are now in the jungle of Fox and need to answer two questions to past through safely.");
        System.out.println("Question #1. Are foxes part of the dog or cat species?");
        answer = input.nextLine();
        if (answer.equalsIgnoreCase("cat"))
        {
            System.err.println("I'm sorry you have answered incorrectly. Now a pack of wild dogs will have you for dinner!(You have died :(  )");
        }
        else if (answer.equalsIgnoreCase("dog"))
        {
            System.out.println("You have chosen wisely and will pass onto the next question. Please press enter.");
        }
        System.out.println("Question #2. Do I have a cousin named \"Crab-eating\" or \"Fish-eating\"?");
        answer2 = input.nextLine();
        if (answer2.equalsIgnoreCase("Fish-eating")) {
            System.err.println("You did well so far, but not well enough. Now a pack of wild dogs will have you for dinner!(You have died :(  )");
        }
        else if (answer.equalsIgnoreCase("Crab-eating")) {
            System.out.println("Well done! You will now enter the next part of the jungle. May the odds be with you!");
        }
        Fox2();
    }


    public static void Fox2() {
        Scanner input = new Scanner(System.in);
        String answer, answer2;
        System.out.println("You have enter the last part of the jungle of Fox. You must answer all the questions correctly in order to escape the area. Please press enter.");
        System.out.println("Question #1. Am I a/n carnivore, herbivore, and omnivore animals?");
        answer = input.nextLine();
        if (! answer.equalsIgnoreCase("Carnivore") && (! answer.equalsIgnoreCase("Herbivore")) && (! answer.equalsIgnoreCase("Omnivore")))
        {
            System.err.println("I don't understand you! Try again!");
        }
        else if (answer.equalsIgnoreCase("Carnivore") || answer.equalsIgnoreCase("Herbivore")) {
            System.err.println("At last you have failed and failure comes at a great cost. Fox attack!!! (You have died :(  )");
        }
        else if (answer.equalsIgnoreCase("Omnivore")) {
        System.out.println("Your will to stay alive is strong and it has helped you so far. Now you will proceed to the last question. Press enter.");
        }
        System.out.println("Question #2. Will you find me in the North or South pole?");
        answer2 = input.nextLine();
        if (answer2.equalsIgnoreCase("North"))
        {
            System.err.println("You were so close yet so far. Come my foxy children we can finally dined! (You have died :(  )");
        }
        else if (answer2.equalsIgnoreCase(("South")))
        {
            System.out.println("You have lost us our meal!!!! Get out of my place now!!!!!");
        }
    }

    public static void Cat(){
        Scanner input = new Scanner(System.in);
        String answer, answer2;
        System.out.println("You are now in the jungle of Cats and need to answer two questions to past through safely!.");
        System.out.println("Question #1. The domestic cat you know today came from the African Wildcat or the European Wildcat?");
            answer = input.nextLine();

            if (! answer.equalsIgnoreCase("African Wildcat") && (! answer.equalsIgnoreCase("European Wildcat")))
            {
            System.err.println("I don't understand you! Try again!");
            }

            else if (answer.equalsIgnoreCase("European Wildcat"))
            {
            System.out.println("You know so little about cat. Looks like you will be our cat nip for today! (You have died :(  )");
            }

            else if(answer.equalsIgnoreCase("African Wildcat")){
                System.out.println("Puuurfect! I guess you have some smarts! Press enter for the next question.");
            }
            System.out.println("Question #2. Are my whiskers for sensory yes or no? ");
            answer2 = input.nextLine();

            if (answer2.equalsIgnoreCase("No") || (answer2.equalsIgnoreCase("n"))) {
            System.err.println("No??? You have insulted us and is now catnip!!! (You have died :(   )");
            }
            else if (answer2.equalsIgnoreCase("Yes") || (answer2.equalsIgnoreCase("y"))) {
            System.out.println("Felines are very smart creatures and you have proven your worth. Go onto the last part of jungle of Cats.");
            }

            Cat2();
        }


    public static void Cat2() {
        Scanner input = new Scanner(System.in);
        String answer, answer2;
        System.out.println("Welcome to the last part of the jungle of Cats. You have two more questions to keep yourself alive. Please press enter.");
        System.out.println("Question #1. Do we have a higher hearing ability than a dog. Yes or No?");
        answer = input.nextLine();
        if (answer.equalsIgnoreCase("No") || (answer.equalsIgnoreCase("n"))) {
            System.err.println("At last! you have failed. Time for our catnip (You have died :(  )");
        } else if (answer.equalsIgnoreCase("Yes") || (answer.equalsIgnoreCase("y"))) {
            System.out.println("Human, you are too smart. I'm not sure if I like you. Press enter for the final question.");
        }
        System.out.println("Question #2. What is the name of the oldest recorded cat?");
        answer2 = input.nextLine();
        if (answer2.equalsIgnoreCase("Cream Puff")) {
            System.out.println("Meoooooowww!!!!!! You win human! Now leave this place this now!");
        } else {
            System.err.println("Meow human!!! You lose, dinner time my children!!! (You have died :(  )");
        }
    }



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String area;
    System.out.println("Welcome to the Jungle of Danger! You may choose from two jungle (The jungle of Fox or Cats to enter. You will only have ONE chance to survive. So pick wisely");
    System.out.println("If you wish to enter the jungle of Cats please type Cats. If you wish to enter the jungle of Fox, please type fox.");
        area = input.next();
        if (area.equalsIgnoreCase(("Cats"))) {
            Jungle.Cat();
        }
        else if (area.equalsIgnoreCase("Fox")){
            Jungle.Fox();
        }
    }
}
