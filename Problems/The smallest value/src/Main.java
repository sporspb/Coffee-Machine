import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long fact = 1;
        int n = 1;
        while (fact <= m) {
            fact *= n + 1;
            n++;
        }
        System.out.println(n);
    }
}