import java.util.*;
import java.io.*;

class daily_practice {

	public static void main(String[] args){
		File f = new File("s1");
		File ff = new File("s1/s2/s3");

		try {
			f.mkdir();
			ff.mkdirs();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		if(f.exists() && ff.exists()){			
			System.out.println("Both Dirs & Sub Dirs Created...");
		}
		File f1 = new File("sam");
		File f2 = new File("sam/sam");
		f.renameTo(f1);

		try{
		f2.createNewFile();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		File f3 = new File("sam/");
		File[] ar = f3.listFiles();
		
		for (File i : ar){
			System.out.println(i);
		}
		
		//Deleting Directorys
		System.out.println("Deleting Files");
		f2.delete();
		File f_del = new File("sam/s2/*");
		f_del.delete();
		
		//Writing a File
		try{
		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		String line;int c=0;
		while((line = br.readLine()) != null){
			System.out.println(line);
			String[] arr = line.split(" ");
			c += arr.length;
		}
		System.out.println("Words" + c);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}
