/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter09_nio2.listing_9_9;

import java.io.IOException;
import java.nio.file.*;

public class FileCopy {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("usage: FileCopy <source-path> <destination-path>");
			System.exit(1);
		}
		Path pathSource = Paths.get(args[0]);
		Path pathDestination = Paths.get(args[1]);
		try {
			Files.copy(pathSource, pathDestination);
			System.out.println("Source file copied successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}