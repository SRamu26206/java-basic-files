interface Bank{ 
 
void draw();  
}  
class Rectangle1 implements Drawable{  
public void draw(){System.out.println("drawing rectangle1");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
class TestInterface1{  
public static void main(String args[]){  
Drawable d=new Rectangle1();  
d.draw();  
}}  