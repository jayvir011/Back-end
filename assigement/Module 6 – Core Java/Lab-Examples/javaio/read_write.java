package javaio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class read_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String sourceFile = "source.txt";
        String destinationFile = "copy.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\jayvi\\\\eclipse-workspace\\\\Assignment\\\\src\\\\javaio\\\\source.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\\\Users\\\\jayvi\\\\eclipse-workspace\\\\Assignment\\\\src\\\\javaio\\\\cop.txt"))
        ) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // preserve line breaks
            }

            System.out.println("File copied successfully using Buffered streams");

        } catch (IOException e) {
            System.out.println(e);
        }

	}

}
