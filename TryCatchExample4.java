class TryCatchExample4 {
public static void main(String args[]){
try
{
int data=50/0;
System.out.println("rest of the code");
}
catch(Exception e)
{
System.out.println("Can't divided by zero");
}
}

