package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWrite {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("../FileHandlingTxt/Test101.txt");
		
		FileWriter fw= new FileWriter(f, true);// we have passed the flag here as tru
		
		//, the data will be written at the end of the file
		BufferedWriter xc=new BufferedWriter(fw);
		xc.newLine(); // move cursor to next line
		xc.write("This is first line");
		xc.newLine();
		xc.write("This is second line");
		xc.close(); //for saving and executing the file
		
		
		
	}

}
