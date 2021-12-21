import java.util.*;
import java.io.*;

class file_creation {

	public static void main (String[] args){
	File f= new File("sample.txt");
	File r= new File("rename.txt");
	boolean bo = f.exists();

	try {
		if(!bo){
		//File_Creation_And_SomeFunctions
		f.createNewFile();
		//Renaming_a_file
		f.renameTo(r);
		System.out.println(r.canRead());
		System.out.println(r.canWrite());
		System.out.println(r.getName());
		System.out.println(r.getAbsolutePath());
		System.out.println(r.length());
		System.out.println("FileCreated");
		}
	}
	catch(IOException e){
		e.printStackTrace();
	}
	
	System.out.println("Going to Delete the File.."+r.delete());

	}
}
