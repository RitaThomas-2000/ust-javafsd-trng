package exceptions.ust;

import java.io.File;

public class File_List {
	public static void main(String args[]) {
		File file=new File("C:\\Users\\ustjavafsdb220\\AB.txt");
		String[] fileList=file.list();
		for(String str:fileList) {
			System.out.println(str);
		}
	}
}
