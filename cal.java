class cal extends Thread{
public static void main(String args[]){
cal obj=new cal();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("This code is outside of the thrad");
}
public void run(){
System.out.println("This code is running in a thread");
}
}