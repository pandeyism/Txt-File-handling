package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataRead {
	
	public static void main(String[] args) throws IOException {
		
		File f =new File("../FileHandlingTxt/Test101.txt");
		FileReader fr=new FileReader(f);
		
		int a;
		while((a=fr.read())!=-1) //-1 to come out of loop 
				{                       //we need to do explicit conversion becasuse int
			// is bigger data type and char is smaller data type
			System.out.println((char)a); // reading data character by character
				}
	}

}
