class Anima2{
void eat(){System.out.println("animal is created");}
}
class Dog extends Anima2{
Dog(){
super();
System.out.println("dog is created");
}
}
class TestSuper3{
public static void main(String args[]){
Dog d=new Dog();
}
}