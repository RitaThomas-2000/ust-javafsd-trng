package exceptions.ust;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class File_Buffered6 {
	public static void main(String args[]) {
		String data="This is a line of text inside the file";
		try {
			FileOutputStream file=new FileOutputStream("output.txt");
			BufferedOutputStream output=new BufferedOutputStream(file);
			byte[] array=data.getBytes();
			output.write(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			output.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
