package java_programming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\demo\\hi.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello Arjun!!!\n");
		bw.write("Welcome!!!\n");
		bw.write("To learn java!!!\n");
		
		System.out.println("Finished!!!");
		
		bw.close();
		
		
	
	}

}
