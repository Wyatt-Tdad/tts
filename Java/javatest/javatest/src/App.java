import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s!\n", firstName);
        System.out.printf("Goodbye %s!\n", firstName);
    }
}

