package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sourceFile = "source.txt";
	        String destinationFile = "copy.txt";

	        try (
	            FileInputStream fis = new FileInputStream("C:\\Users\\jayvi\\eclipse-workspace\\Assignment\\src\\javaio\\source.txt");
	            FileOutputStream fos = new FileOutputStream("C:\\Users\\jayvi\\eclipse-workspace\\Assignment\\src\\javaio\\copy.txt")
	        ) {

	            byte[] buffer = new byte[1024];
	            int bytesRead;

	            while ((bytesRead = fis.read(buffer)) != -1) {
	                fos.write(buffer, 0, bytesRead);
	            }

	            System.out.println("File copied successfully (buffered)");

	        } catch (IOException e) {
	            System.out.println(e);
	        }

	}

}
