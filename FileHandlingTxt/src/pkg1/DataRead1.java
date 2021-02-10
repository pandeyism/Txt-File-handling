package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//Buffered reader class will read line by line
public class DataRead1 {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("../FileHandlingTxt/Test101.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr); //read data line by line
		String s;
		while((s=b.readLine())!= null) {
			
			System.out.println(s);
		}
	}

}
