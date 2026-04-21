package JavaPractical.P9;

class Model {
    public String generateToken(String user) {
        return "JWT_TOKEN_" + user.toUpperCase() + "_SECURE";
    }

    public boolean validateToken(String token) {
        return token.startsWith("JWT_TOKEN");
    }
}

class View {
    public void showToken(String token) {
        System.out.println("Generated Token: " + token);
    }
    
    public void verify(boolean status) {
        System.out.println("Token Valid: " + status);
    }
}

public class Program9 {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        String token = model.generateToken("jayvir");
        view.showToken(token);
        
        boolean isValid = model.validateToken(token);
        view.verify(isValid);
    }
}
