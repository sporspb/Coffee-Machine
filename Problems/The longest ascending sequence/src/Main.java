import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int max = 0;

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < size; i++) {
            if (array[i] > array[i - 1]) {
                count++;
            } else if (count > max) {
                max = count;
                count = 1;
            }
        }
        if (count > max) {
            max = count;
        }
        System.out.println(max);
    }
}