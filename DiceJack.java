import java.util.Scanner;

/**
 * Rules:
 * - The user need to pick three numbers (4 3 5) sum: 12
 * - The user need to roll the dice three times (3 4 4) sum: 11
 * 
 * - The user wins if:
 * - The sum of dice rolls is smaler than the sum of numbers you chose
 * - AND the difference between the two number is less the three.
 */
public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int roll1 = rollDide();
        int roll2 = rollDide();
        int roll3 = rollDide();

        System.out.println("Enter three numbers between 1 and 6.");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less then 1. Sutting game down.");
            System.exit(0);
        }

        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Numbers cannot be greater then 6. Sutting game down.");
            System.exit(0);
        }

        int sumOfNumbers = num1+num2+num3;
        int sumDiceRolls = roll1+roll2+roll3;

        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumbers);

        if(checkWin(sumDiceRolls, sumOfNumbers)){
            System.out.println("Congrats! You win. :)");
        }else{
            System.out.println("Sorry! You lose.");
        }

        scan.close();
    }

    public static int rollDide(){
        double randomNumber = Math.random() * 6 + 1;
        return (int) randomNumber;
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers){
        return (sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3)
}
