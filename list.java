import java.util.*;

class list {
public static void main (String[] args){
Integer a[] = new Integer[] {101,102,103,104};
List<Integer> l1 = Arrays.asList(a);
l1.set(3,1044);
System.out.println(l1);

List<Integer> ll = new LinkedList<>();
ll.add(1);
ll.add(2);
ll.add(3);
ll.add(4);
System.out.println(ll);
ll.add(4,12);
Collections.addAll(ll,13,11,14,12);
//System.out.println("after Collections.addAll(ll,13,11,14,12)");
Collections.sort(ll);
System.out.println(ll.remove(2));
System.out.println(ll);
System.out.println("isEmpty() -"+ll.isEmpty());
System.out.println("size() -"+ll.size());
System.out.println("indexOf() -"+ll.indexOf(12));
System.out.println("lastIndexOf() -"+ll.lastIndexOf(12));
System.out.println("contains() -"+ll.contains(11));
System.out.println(ll.get(0));
}
}
