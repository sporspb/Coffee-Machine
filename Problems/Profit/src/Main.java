import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        int k = scanner.nextInt();
        int i = 0;

        while (k > m) {
            m = m * (1 + (p / 100));
            i++;
        }
        System.out.println(i);
    }
}