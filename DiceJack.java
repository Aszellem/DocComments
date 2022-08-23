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
        int roll1 = rollDide();
        int roll2 = rollDide();
        int roll3 = rollDide();

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
    }

    public static int rollDide(){
        double randomNumber = Math.random() * 6 + 1;
        return (int) randomNumber;
    }
}
