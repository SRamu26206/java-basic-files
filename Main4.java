import java.util.List;
import java.util.LinkedList;
class Main4{
public static void main(String args[]){
List<Integer>numbers=new LinkedList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
System.out.println("List:"+numbers);
int number=numbers.get(2);
System.out.println("Accessed Element:"+numbers);
int removedNumber=numbers.remove(1);
System.out.println("Removed Element:"+removedNumber);

}
}