import java.util.Sacnner;
class PolymorphismExample1{
void Print(){System.out.println("Welcome");}
void println(String n){System.out.println("Welcome"+n);}
}
class Teat{
public static void main(String args[]){
PolymorphismExample1 ob1=new PolymorphismExample1();
ob1.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please type your name:");
String s=sc.next();
ob1.print(s);
}
}