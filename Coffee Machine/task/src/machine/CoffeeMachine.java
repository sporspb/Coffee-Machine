package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int waterRemain = 400;
    static int milkRemain = 540;
    static int coffeeRemain = 120;
    static int cupCount = 9;
    static int moneyRemain = 550;
    static boolean exit = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Drink espresso = new Drink(250, 0, 16, 4);
        Drink latte = new Drink(350, 75, 20, 7);
        Drink cappuccino = new Drink(200, 100, 12, 6);

        while (!exit) {
            welcomeMessage();
            String command = scanner.nextLine();

            switch (command) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    System.out.print("> ");
                    String drinkNumber = scanner.nextLine();
                    switch (drinkNumber) {
                        case "1":
                            buyDrink(espresso);
                            break;
                        case "2":
                            buyDrink(latte);
                            break;
                        case "3":
                            buyDrink(cappuccino);
                            break;
                        case "back":
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
                    break;
                case "take":
                    System.out.println("I gave you $" + moneyRemain);
                    System.out.println();
                    moneyRemain = 0;
                    break;
                case "remaining":
                    stateOutput();
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("wrong command");
            }
        }
    }

    private static void welcomeMessage() {
        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        System.out.print("> ");
    }

    private static void stateOutput() {
        System.out.println("The coffee machine has:");
        System.out.println(waterRemain + " of water");
        System.out.println(milkRemain + " of milk");
        System.out.println(coffeeRemain + " of coffee beans:");
        System.out.println(cupCount + " of disposable cups");
        System.out.println("$" + moneyRemain + " of money");
    }

    private static void buyDrink(Drink drink) {
        if (checkRes(drink)) {
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            waterRemain -= drink.waterPerCup;
            milkRemain -= drink.milkPerCup;
            coffeeRemain -= drink.coffeePerCup;
            cupCount--;
            moneyRemain += drink.costPerCup;
        }
    }

    private static boolean checkRes(Drink drink) {
        return (waterRemain < drink.waterPerCup) || (milkRemain < drink.milkPerCup) || (coffeeRemain < drink.coffeePerCup) || (cupCount <= 0);
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