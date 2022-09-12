package exceptions.ust;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File_Buffered4 {
	public static void main(String args[]) {
		String data="This is the data in the output file";
		try {
			FileWriter file=new FileWriter("output.txt");
			BufferedWriter output=new BufferedWriter(file);
			output.write(data);
			System.out.println("Data in the file: ");
			System.out.println(data);
			output.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}