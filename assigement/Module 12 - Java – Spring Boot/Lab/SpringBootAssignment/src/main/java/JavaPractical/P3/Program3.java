package JavaPractical.P3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}

class Model {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }
}

class View {
    public void showMenu() {
        System.out.println("1. Add Product\n2. View Products\n3. Exit");
    }

    public Product getProductInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        return new Product(id, name, price);
    }

    public void displayProducts(List<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }
}

public class Program3 {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Scanner sc = new Scanner(System.in);

        while (true) {
            view.showMenu();
            int choice = sc.nextInt();
            if (choice == 1) {
                model.addProduct(view.getProductInput());
            } else if (choice == 2) {
                view.displayProducts(model.getProducts());
            } else {
                break;
            }
        }
    }
}
