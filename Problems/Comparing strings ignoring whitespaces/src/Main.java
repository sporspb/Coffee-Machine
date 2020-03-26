import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        String res1 = text1.replaceAll("\\s+", "");
        String res2 = text2.replaceAll("\\s+", "");

        System.out.println(res1.equals(res2));
    }
}