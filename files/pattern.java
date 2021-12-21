import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.io.*;

class pattern {

	public static void main (String[] args){
	if(Pattern.matches("[123]{3}Customer[0-9]+","333Customer99")){
		System.out.println("Yes----");
	}
	else {
		System.out.println("No----");
	}
	Pattern p = Pattern.compile("[12]{2}");
	Matcher m = p.matcher("12");

	if (m.find()) {
		System.out.println("Yes-----!");
	}

	}
}
