
public class MultipleCatchBlock5{
public static void main(String args[]){
try{
int a[]=new int[5];
a[5]=30/0;
}
catch(Exception e){System.out.prinln("comman task completed");
catch(ArithmeticException e){System.out.prinln("task1 is completed");
catch(ArrayIndextOutOfBoundsException e){System.out.prinln("rest of the code...");
}
}

