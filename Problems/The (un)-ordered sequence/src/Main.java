import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean asc = true;
        boolean desc = true;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                numbers.add(num);
            }
        }
        int min = numbers.get(0);
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(i - 1))) {
                max = numbers.get(i);
                continue;
            }
            if (numbers.get(i) > numbers.get(i - 1) && numbers.get(i) > max) {
                asc = true;
                max = numbers.get(i);
            } else {
                asc = false;
            }
        }
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(i - 1))) {
                min = numbers.get(i);
                continue;
            }
            if (numbers.get(i) < numbers.get(i - 1) && numbers.get(i) < min) {
                desc = true;
                min = numbers.get(i);
            } else {
                desc = false;
            }
        }
        System.out.println(asc || desc);
    }
}

