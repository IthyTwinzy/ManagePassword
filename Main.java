
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        new Main().runCode();

    }

    private void runCode() {
        PasswordStorage ps = new PasswordStorage();


        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your choice: ");
        Boolean runTrue = true;
        while (runTrue) {
            System.out.println("Password Manager");
            System.out.println("1. Retrieve Password");
            System.out.println("2. Store Password");
            System.out.println("3. Overwrite Password");
            System.out.println("4. Display Usernames");
            System.out.println("5. Exit");

            String input = userInput.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Enter the corresponding username:");
                    input = userInput.nextLine();
                    System.out.println(ps.Search(input));
                    break;
                case "2":
                    System.out.println("Enter your username:");
                    input = userInput.nextLine();
                    String tempUsername = input;

                    System.out.println("Enter your password: ");
                    input = userInput.nextLine();
                    String tempPassword = input;

                    ps.add(tempPassword, tempUsername);
                    break;

                case "3":
                    System.out.println("Enter corresponding username: ");
                    input = userInput.nextLine();
                    Node temp = ps.overwrite(input);

                    System.out.println("Enter your new password: ");
                    input = userInput.nextLine();
                    temp.setPassword(input);
                    //placeholder
                    break;
                case "4":
                    System.out.println("Displaying usernames:");
                    ps.displayUsername();
                    break;
                case "5":
                    runTrue = false;
                    break;
            }

        }
    }
}