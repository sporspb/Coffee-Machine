package machine;

public class CoffeeMachine {
    static int waterRemain = 400;
    static int milkRemain = 540;
    static int coffeeRemain = 120;
    static int cupCount = 9;
    static int moneyRemain = 550;

    static Drink espresso = new Drink(250, 0, 16, 4);
    static Drink latte = new Drink(350, 75, 20, 7);
    static Drink cappuccino = new Drink(200, 100, 12, 6);


    public static void main(String[] args) {
        CommandHandler.executeCommand();
    }

    public static void welcomeMessage() {
        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        System.out.print("> ");
    }

    public static void stateOutput() {
        System.out.println("The coffee machine has:");
        System.out.println(waterRemain + " of water");
        System.out.println(milkRemain + " of milk");
        System.out.println(coffeeRemain + " of coffee beans:");
        System.out.println(cupCount + " of disposable cups");
        System.out.println("$" + moneyRemain + " of money");
    }

    public static void take() {
        System.out.println("I gave you $" + moneyRemain);
        System.out.println();
        moneyRemain = 0;
    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        System.out.print("> ");
        waterRemain += CommandHandler.getInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        System.out.print("> ");
        milkRemain += CommandHandler.getInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        System.out.print("> ");
        coffeeRemain += CommandHandler.getInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        System.out.print("> ");
        cupCount += CommandHandler.getInt();
    }

    public static void buyDrink(Drink drink) {
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

    static boolean checkRes(Drink drink) {
        return (waterRemain < drink.waterPerCup) || (milkRemain < drink.milkPerCup) || (coffeeRemain < drink.coffeePerCup) || (cupCount <= 0);
    }
}


