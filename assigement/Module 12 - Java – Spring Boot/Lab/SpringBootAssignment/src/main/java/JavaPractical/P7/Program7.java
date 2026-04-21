package JavaPractical.P7;

import java.util.Scanner;

class Model {
    public String checkRole(String username) {
        if (username.equalsIgnoreCase("admin")) return "ADMIN";
        if (username.equalsIgnoreCase("user")) return "USER";
        return "GUEST";
    }
}

class View {
    public void showAccess(String role) {
        if (role.equals("ADMIN")) {
            System.out.println("Welcome Admin! Accessing Dashboard...");
        } else if (role.equals("USER")) {
            System.out.println("Welcome User! Accessing Profile...");
        } else {
            System.out.println("Access Denied!");
        }
    }
}

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Model model = new Model();
        View view = new View();

        System.out.print("Enter Username: ");
        String name = sc.next();
        
        String role = model.checkRole(name);
        view.showAccess(role);
    }
}
