import java.util.Scanner;
class test2{
public static void printLine(char ch1,int nhash,char ch2,int nstar)
{
for(int i=0;i<nhash;i++)System.out.println(ch1);
for(int i=0;i<nstar;i++)System.out.println(ch2);
for(int i=0;i<nhash;i++)System.out.println(ch1);
}
public static void printUpperPattern(int n,char ch  ){
int i,j;
for(i=n/2,j=1;i>0&&j<n  ;i--j +=2){
printLIne('#',i,ch,j);System.out print("\n");}
}
printPattern()
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
char ch=sc.next().charAt(0);
printUpperPattren(n,ch  );
printLowerPattern(n,ch);
}
}