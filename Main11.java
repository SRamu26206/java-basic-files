import java.util.Iterator;
import java.util.Vector;
class Main11{
public static void main(String args[]){
Vector<String>animals=new Vector<>();
animals.add("Dog");
animals.add("Horse");
animals.add("Cat");
System.out.println("Element at indext 2:"+element);
Iterator<String>iterate=animals.iterator();
System.out.println(" Vector:");
while(iterate.hasNext()){
System.out.println(iterate.next());  Sysytem.out.print(",");
}
}
