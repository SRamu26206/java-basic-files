import java.util.Scanner;
class test3b{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int inc=sc.nextInt();
for(int i=0;i<=num;i=i+inc)
{
System.out.print(i+",");
}
}
}