package exceptions.ust;

import java.io.File;

public class File_Example4 {
	public static void main(String args[]) {
		File file=new File("C:\\Users\\ustjavafsdb220\\file.txt");
		boolean value=file.delete();
		if(value) {
			System.out.println("The File is deleted.");
		}
		else {
			System.out.println("The File is not deleted.");
		}
	}
}
