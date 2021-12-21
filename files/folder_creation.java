import java.util.*;
import java.io.*;

class folder_creation {
public static void main(String[] args){

	//mkdir()
	File f = new File("sample");
	boolean bo = f.exists();
	System.out.println(bo);
	if(!bo){
		f.mkdir();
	}
	
	//mkdirs()
	File ff = new File("./sam1/sam2");
	boolean bo1 = ff.exists();
	System.out.println(bo1);
	if(!bo1){
		ff.mkdirs();
	}

}
}
