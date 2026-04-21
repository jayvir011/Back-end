package JavaPractical.P1;

class Model {
    public String getMessage() {
        return "Hello, Spring!";
    }
}

class View {
    public void displayMessage(String message) {
        System.out.println(message);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        
        String data = model.getMessage();
        view.displayMessage(data);
    }
}
