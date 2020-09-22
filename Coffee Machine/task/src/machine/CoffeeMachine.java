package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int waterRemain = 400;
    static int milkRemain = 540;
    static int coffeeRemain = 120;
    static int cupCount = 9;
    static int moneyRemain = 550;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Drink espresso = new Drink(250, 0, 16, 4);
        Drink latte = new Drink(350, 75, 20, 7);
        Drink cappuccino = new Drink(200, 100, 12, 6);

        stateOutput();
        System.out.println();
        System.out.println("Write action (buy, fill, take): ");
        System.out.print("> ");
        String command = scanner.nextLine();

        switch (command) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                System.out.print("> ");
                int drinkNumber = scanner.nextInt();
                switch (drinkNumber) {
                    case 1:
                        drinkOutput(espresso);
                        break;
                    case 2:
                        drinkOutput(latte);
                        break;
                    case 3:
                        drinkOutput(cappuccino);
                        break;
                    default:
                        System.out.println("wrong command");
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                System.out.print("> ");
                waterRemain += scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                System.out.print("> ");
                milkRemain += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                System.out.print("> ");
                coffeeRemain += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                System.out.print("> ");
                cupCount += scanner.nextInt();
                stateOutput();
                System.out.println();
                break;
            case "take":
                System.out.println("I gave you $" + moneyRemain);
                System.out.println();
                moneyRemain = 0;
                stateOutput();
                break;
            default:
                System.out.println("wrong command");
        }
    }

    private static void stateOutput() {
        System.out.println("The coffee machine has:");
        System.out.println(waterRemain + " of water");
        System.out.println(milkRemain + " of milk");
        System.out.println(coffeeRemain + " of coffee beans:");
        System.out.println(cupCount + " of disposable cups");
        System.out.println(moneyRemain + " of money");
    }

    private static void drinkOutput(Drink drink) {
        waterRemain -= drink.waterPerCup;
        milkRemain -= drink.milkPerCup;
        coffeeRemain -= drink.coffeePerCup;
        cupCount--;
        moneyRemain += drink.costPerCup;
        stateOutput();
    }
}

class Drink {
    int waterPerCup;
    int milkPerCup;
    int coffeePerCup;
    int costPerCup;

    public Drink(int waterPerCup, int milkPerCup, int coffeePerCup, int costPerCup) {
        this.waterPerCup = waterPerCup;
        this.milkPerCup = milkPerCup;
        this.coffeePerCup = coffeePerCup;
        this.costPerCup = costPerCup;
    }
}