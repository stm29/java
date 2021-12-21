import java.util.*;
import java.io.*;

class write_file {

	public static void main (String[] args){
	try {
	BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"));
	bw.write("HElloooo , I am in");

	String[] arr = {"First1","Second2","Third3","Fourth4"};
	for (String i : arr) {
	bw.write("\n"+i);
	}
	bw.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}
	}
}
