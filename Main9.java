import java.util.ArrayList;
class Main9{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("Cow");
animals.add("Cat");
animals.add("Dog");
System.out.println("ArrayList:"+animals);
System.out.println("Accessing individual element:");
for(String temp:animals){
System.out.println(temp);   
}
}
}