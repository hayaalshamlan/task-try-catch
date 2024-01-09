import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String validUsername = "Coded";
        System.out.println("Enter your name");
        String nameInput = scanner.nextLine();

        String validPassword = "Coded123";
        System.out.println("Enter your password");
        String passwordInput = scanner.nextLine();

        setUp(nameInput, passwordInput);
        scanner.close();
    }

    public static void setUp(String nameInput, String passwordInput) {
        try {
            String validUsername = "Coded";
            String vaildPassword = "Coded123";
            if (nameInput.equals(validUsername) && passwordInput.equals(vaildPassword)) {
                System.out.println("Welcome");
            } else {
                throw new Exception("invailed set up");
            }
            System.out.println(validUsername);

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }

}
