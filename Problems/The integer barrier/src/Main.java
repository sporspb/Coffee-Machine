import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}