import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long resultOfProd = 1;

        for (int i = a; i < b; i++) {
            resultOfProd *= i;
        }

        System.out.println(resultOfProd);
    }
}