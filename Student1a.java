class Student1a{
int rollno;
String name;
float fee;
Student1a(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+fee);}
}
class TestThis2{
public static void main(String args[]){
Student1a s1=new Student1a(111,"ankit",50000f);
Student1a s2=new Student1a(112,"suman",6000f);
s1.display();
s2.display();
}
}


