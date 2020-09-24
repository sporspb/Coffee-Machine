package machine;

import java.util.Scanner;

class CommandHandler {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean exit = false;

    public static void executeCommand() {
        while (!exit) {
            CoffeeMachine.welcomeMessage();
            String command = getCommand();
            switch (command) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    System.out.print("> ");
                    String drinkNumber = getCommand();
                    switch (drinkNumber) {
                        case "1":
                            CoffeeMachine.buyDrink(CoffeeMachine.espresso);
                            break;
                        case "2":
                            CoffeeMachine.buyDrink(CoffeeMachine.latte);
                            break;
                        case "3":
                            CoffeeMachine.buyDrink(CoffeeMachine.cappuccino);
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("wrong command");
                    }
                    break;
                case "fill":
                    CoffeeMachine.fill();

                    break;
                case "take":
                    CoffeeMachine.take();
                    break;
                case "remaining":
                    CoffeeMachine.stateOutput();
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("wrong command");
            }
        }
    }

    public static String getCommand() {
        return scanner.nextLine();
    }

    public static int getInt() {
        return scanner.nextInt();
    }
}
