package myexamples.testapp.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "C:\\Workspaces\\TestApplication1\\testFile.txt";
		FileHandler obj = new FileHandler();
		obj.readFile(fileName);
	}
	
	public void readFile(String fileName) {
		String readLine = null;
		try {
			BufferedReader rdr = new BufferedReader(new FileReader(new File(fileName)));
			while((readLine = rdr.readLine()) != null){
				System.out.println(readLine);
			}
			System.out.println("Completed file reading.........");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
