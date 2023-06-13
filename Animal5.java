class Animal5{
public void move(){System.out.println("Animal can move");}
}
class Dog extends Animal5{
public void move(){System.out.println("Dog can walk and run");}
}
class TestDog{
public static void main(String args[]){
Animal5 a=new Animal5();
Animal5 b=new Dog();
a.move();
b.move();
}
}