import java.util.*;

class google_qstn {

public static int c(List<String> l){
	Collections.sort(l);
	Map<String,Integer> mm = new LinkedHashMap<>();
	for (String i : l){
		int in=1;
		if(mm.containsKey(i)){
			mm.put(i,mm.get(i)+1);
		}
		else{
			mm.put(i,in);
		}
	}
	System.out.println(mm);
	LinkedList<Map.Entry<String,Integer>> lc = new LinkedList<>(mm.entrySet());
	System.out.println(lc);
	Collections.sort(lc,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
	System.out.println(lc);
	Collections.reverse(lc);
	System.out.println(lc);
	return 13;
}
public static void main(String[] args){
List<String> ll = new LinkedList<>();
ll.add("Aaaa");
ll.add("Baaa");
ll.add("Baaa");
ll.add("Baaa");
ll.add("Baaa");
ll.add("Baaa");
ll.add("Daaa");
ll.add("Daaa");
ll.add("Daaa");
ll.add("Eeee");
ll.add("Eeee");
ll.add("Eeee");
ll.add("Eeee");
ll.add("Eeee");
ll.add("Eeee");
System.out.println(c(ll));
}
}
