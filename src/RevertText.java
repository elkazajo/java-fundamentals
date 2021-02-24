import java.util.Scanner;

public class RevertText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your name under this line, please:");
        String userName = input.nextLine();
        String text = "Hello, " + userName + "!";

        StringBuffer reverseText = new StringBuffer(text);
        System.out.println(reverseText.reverse());
    }
}
