import java.*;
public class BufferedReaderExample{
public static void main(String args[]){
InputStreamReader r=new InputStreamReader(System.in);
bufferedReader br=new BufferedReader(r);
System.out.println("Enter your name");
String name=br.readLine();
System.out.println("Welcome"+name);
}
}