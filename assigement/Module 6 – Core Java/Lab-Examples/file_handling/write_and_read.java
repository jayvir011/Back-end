package file_handling;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class write_and_read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("C:\\Users\\jayvi\\eclipse-workspace\\Assignment\\src\\file_handling\\text.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("holaaaaaaaaaaaaaaaaaaaaaaa");
		bw.newLine();
		bw.write("manishhhhhhhhhhhhhhhhhhhhhhhhhhh");
		bw.close();
		FileReader fr=new FileReader("C:\\\\Users\\\\jayvi\\\\eclipse-workspace\\\\Assignment\\\\src\\\\file_handling\\\\text.txt"); 
		BufferedReader fb=new BufferedReader(fr);
		while(fb.ready())
		{
			System.out.println(fb.readLine());
		}

	}

}
