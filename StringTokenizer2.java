import java.util.StringTokenizer;
public class StringTokenizer2{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("hello everyone Im a Java developer"," ");
while(st.hasMoreTokenss())
{
System.out.println(st.nextToken());
}
}
}
