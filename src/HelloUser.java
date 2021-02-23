import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dear User, type your name under this line, please:");
        String userName = input.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
