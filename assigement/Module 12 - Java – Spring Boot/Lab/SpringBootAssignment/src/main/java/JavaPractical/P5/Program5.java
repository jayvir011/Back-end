package JavaPractical.P5;

import java.util.Arrays;
import java.util.List;

class Model {
    List<String> data = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6");
    int pageSize = 3;

    public List<String> getPage(int pageNum) {
        int start = (pageNum - 1) * pageSize;
        int end = Math.min(start + pageSize, data.size());
        return data.subList(start, end);
    }
}

class View {
    public void displayPage(List<String> items, int pageNum) {
        System.out.println("--- Page " + pageNum + " ---");
        for (String item : items) {
            System.out.println(item);
        }
    }
}

public class Program5 {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        view.displayPage(model.getPage(1), 1);
        view.displayPage(model.getPage(2), 2);
    }
}
