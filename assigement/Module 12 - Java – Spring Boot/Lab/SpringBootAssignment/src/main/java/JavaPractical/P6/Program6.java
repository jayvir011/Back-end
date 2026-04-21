package JavaPractical.P6;

class Model {
    public void performTask() {
        System.out.println("Executing core business logic in Model...");
    }
}

class View {
    public void displayLog(String message) {
        System.out.println("[LOG]: " + message);
    }
}

public class Program6 {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        // 1. Before Advice simulation
        view.displayLog("Before: Method performTask is starting.");

        // 2. Around Advice simulation (Timer start)
        long startTime = System.currentTimeMillis();

        // Execution of core logic
        model.performTask();

        // 2. Around Advice simulation (Timer end)
        long endTime = System.currentTimeMillis();
        view.displayLog("Around: Execution time: " + (endTime - startTime) + "ms");

        // 3. After Advice simulation
        view.displayLog("After: Method performTask has completed.");
    }
}
