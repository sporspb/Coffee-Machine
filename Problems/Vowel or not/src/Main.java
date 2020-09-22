import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        return List.of('a', 'A', 'o', 'O', 'u', 'U', 'i', 'I', 'e', 'E').contains(ch);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}