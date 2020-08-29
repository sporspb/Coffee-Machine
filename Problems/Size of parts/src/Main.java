import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int largerCount = 0;
        int smallerCount = 0;
        int perfectCount = 0;
        for (int i = 0; i < n; i++) {
            int partSize = scanner.nextInt();
            switch (partSize) {
                case 1: {
                    largerCount++;
                    break;
                }
                case -1: {
                    smallerCount++;
                    break;
                }
                case 0: {
                    perfectCount++;
                    break;
                }
                default:
                    System.out.println("wrong input");
            }
        }
        System.out.println(perfectCount + " " + largerCount + " " + smallerCount);
    }
}