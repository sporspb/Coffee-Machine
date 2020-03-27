package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int waterPerCup = 200;
        int milkPerCup = 50;
        int coffeePerCup = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterRemain = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkRemain = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeRemain = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupCount = scanner.nextInt();

        int cupAvailable = Math.min(Math.min(waterRemain / waterPerCup, milkRemain / milkPerCup), coffeeRemain / coffeePerCup);
        int cupRemain = cupAvailable - cupCount;
        if (cupAvailable < cupCount) {
            System.out.println("No, I can make only " + cupAvailable + " cup(s) of coffee\n");
        } else if (cupAvailable == cupCount) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + cupRemain + " more than that)");
        }
    }
}
