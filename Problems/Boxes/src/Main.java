import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        int count1 = 0;
        int count2 = 0;
        int[] box1 = new int[size];
        int[] box2 = new int[size];
        for (int i = 0; i < size; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            box2[i] = scanner.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);
        for (int i = 0; i < size; i++) {
            if (box1[i] > box2[i]) {
                count1++;
            }
            if (box2[i] > box1[i]) {
                count2++;
            }
        }
        if (count1 == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (count2 == 3) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}