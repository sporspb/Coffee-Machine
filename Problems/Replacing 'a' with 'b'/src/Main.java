import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //System.out.println("Enter string:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println(username.replace('a', 'b'));
    }
}