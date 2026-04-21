package JavaPractical.P8;

class Model {
    public String getGoogleProfile() {
        return "Name: Jayvir, Email: jayvir@google.com";
    }
}

class View {
    public void displayProfile(String info) {
        System.out.println("Redirecting to Google Account...");
        System.out.println("Login Successful!");
        System.out.println("User Profile: " + info);
    }
}

public class Program8 {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        String profile = model.getGoogleProfile();
        view.displayProfile(profile);
    }
}
