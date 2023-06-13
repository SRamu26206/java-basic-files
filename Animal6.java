class Animal6{
public void move(){System.out.println("Animal can move");}
}
class Dog extends Animal6{
public void move(){System.out.println("Dog can walk and run");}
}
class Pet extends Animal6{
public void move(){System.out.println("Call from Pet class");}
}
class TestDog{
public static void main(String args[]){
Animal6 a=new Animal6();
Animal6 w=new Dog();
Animal6 p=new Pet();
a.move();
w.move();
p.move();
}
}