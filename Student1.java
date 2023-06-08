class Student1{
int rollno;
String name;
static String college="ITS";
static void change(){
college="A.M.REDDY";
}
Student1(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+""+name+""+college);}
}
 class TestStaticMethod{
public static void maain(String args[]){
Student1.change();
Student1 s1=new Student1(111,"THARUN");
Student1 s2=new Student1(222,"RAMU");
Student1 s3=new Student1(333,"MOHAN");
s1.display();
s2.display();
s3.display();
}
}



