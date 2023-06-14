import java.io.FileNotFoundException;
import java.PrintWriter;
public class TryCatchExample10{
public static vois amin(String args[]){
PrintWriter pw;
try{
pw=new PrintWriter("jtp.txt");
pw.println("saved");
}
catch(fileNotFoundException e){
System.out.println(e);
}
System.out.pritln("File saved successfuiiy");
}
}
