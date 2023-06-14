
public class MultipleCatchBlock4{
public static void main(String args[]){
try{
String s=null;
System.out.println();
}
catch(Arithmetic Exception e)
{    System.out.println("Arithmetic Exception occurs");  }
catch(ArrayIndexOutOfBounds Exception e)
{ System.out.println("ArrayIndexOutOfBounds Exception occurs");  }
catch(Exception e)
{  System.out.println("Parent Exception occurs");  }
System.out.println("rest of the code");
}
}

