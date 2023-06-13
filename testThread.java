class testThread extends Thread{
public static void main(String args[]){
testThread tob=new testThread();
tob.start();
System.out.println("This code is outside of the thrad");
}
public void run(){
System.out.println("This code is running in a thread");
}
}