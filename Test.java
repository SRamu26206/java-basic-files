import java.util.StringTokenizer;
public class Test{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("my name is ABD"," ");

System.out.println("Next token is:"+st.nextToken(" ,"));
System.out.println("Next token is:"+st.nextToken(" ,"));
System.out.println("Next token is:"+st.nextToken(" ,"));
System.out.println("Next token is:"+st.nextToken(" ,"));
}
}
