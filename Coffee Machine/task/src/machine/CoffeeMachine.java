package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println("For " + count + " cups of coffee you will need:");
        System.out.println(count*200 + " ml of water");
        System.out.println(count*50 + " ml of milk");
        System.out.println(count*15 + " g of coffee beans");
    }
}
