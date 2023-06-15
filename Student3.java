class Student3{
public int id;
public String name;
public void display(){
System.out.println("this.id+" "+this.name);
}
}
class Test{
public static vod main(String args[]){
Student ob=new Student3();
Sytem.out.println("ob.id+""+ob.name);
ob.display();
ob.id=25841;
ob.name="haritha";
ob.display();
}
}
