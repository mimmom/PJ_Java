package pretest;

import java.io.File;


public class CreatesFileInFolder {

	public static void main(String[] args) {
		String[] fileList = {"/file1.txt", "/subdir/file2.txt", "/file3.txt" }; 
		for (String file : fileList) {
			
			try {
				new File(file).mkdir(); 
			} catch (Exception e) {
				System.out.println("creazione del file fallita"); 
				System.exit(-1);
			}
		}
		

	}

}
