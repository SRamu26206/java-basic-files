import java.util.Scanner;
class InputSwap1
{
    public static void main (String args[])
    {
     Scanner scob=new Scanner
    int num1,num2;
    num1=scob.nextInt();//5
    num2=scob.nextInt();//3
    int temp;
    temp=num1;//temp=5
    num1=num2;//num1=3
    num2=temp;//num2=5
    System.out.println(num1+ "\n" +num2 );
}//main()
