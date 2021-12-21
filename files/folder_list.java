import java.util.*;
import java.io.*;

class folder_list {

	public static void main (String[] args){
	File f = new File(".");
	String[] list = f.list();
	
	//Print_all_files_folders
	for(String i : list){
	System.out.println(i);
	}
	
	//Print_File_or_Folder
	File[] ff = f.listFiles();
	for(File i : ff){
		if(i.isFile())  //isDirectory()
		System.out.println(i);
	}

	//Print_ .java Files
	File[] f1 = f.listFiles();
	for(File i : f1){
		if(i.isFile())  //isDirectory()
		{
		String fn = i.getName();
		int index = fn.lastIndexOf(".");
		System.out.println(fn.substring(index+1));
		}
	}
	}
}
