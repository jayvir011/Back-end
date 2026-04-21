package JavaPractical.P2;

import java.util.Arrays;
import java.util.List;

class Model {
    public List<String> getUsers() {
        return Arrays.asList("Alice", "Bob", "Charlie");
    }
}

class View {
    public void displayUsers(List<String> users) {
        System.out.println("--- User List ---");
        for (String user : users) {
            System.out.println("- " + user);
        }
    }
}

public class Program2 {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        
        List<String> data = model.getUsers();
        view.displayUsers(data);
    }
}
