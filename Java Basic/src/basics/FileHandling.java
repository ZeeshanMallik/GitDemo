package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream file=new FileInputStream("/Users/zeeshanmalik/Documents/demoData1.xlsx");
		System.out.println(file.read());
		
	}

}
