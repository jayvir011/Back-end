package JavaPractical.P4;

import java.util.Scanner;

class Model {
    public boolean isValid(String name, String email) {
        return !name.isEmpty() && email.contains("@");
    }
}

class View {
    public void displayResult(boolean isValid) {
        if (isValid) {
            System.out.println("Registration Successful!");
        } else {
            System.out.println("Validation Failed: Check name and email.");
        }
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Model model = new Model();
        View view = new View();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        boolean result = model.isValid(name, email);
        view.displayResult(result);
    }
}
