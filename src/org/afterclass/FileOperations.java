package org.afterclass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	
	public static void main(String[] jai) throws IOException {
		
		String location = "E:\\java.txt";
		String content = "This is Java";
		
		FileWriter fw=new FileWriter(location);
		fw.write(content);
		fw.close();
		
	}

}
