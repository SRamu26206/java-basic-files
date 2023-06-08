classStudent1{
int rollno;
String name;
static String college="ITS";
static void chnge(){
college="A.M.REDDY";
}
Student(int r.String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+""+name+""+college);}
public class TestStaticMethod{
public static void maain(String args[]){
Student.change(0;
Student s1=new Student(111,"THARUN");
