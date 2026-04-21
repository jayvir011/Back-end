package JavaPractical;

class Model1 {
    public String getMessage() {
        return "Hello, Spring!";
    }
}

class View1 {
    public void displayMessage(String message) {
        System.out.println(message);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Model1 model = new Model1();
        View1 view = new View1();
        
        String data = model.getMessage();
        view.displayMessage(data);
    }
}
