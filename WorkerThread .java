import java.util.concurrent.ExecutionService;
import java.util.concurrent.Executor;
class WorkerThread implements Runnable{
private String massage;
public WorkerThread(String s){
this.message=s;
}
public void run(){
System.out.println(Thread.currentThread().getName()+"(Start)message="+message);
processmessage();
System.out.println(Thread.currentThread().getName()+"(End)");
}
private void processmessage(){
try{Thread.sleep(2000);}
catch(InterruptedException e){ e.printStackTrace();}
}
class TestThreadPoll{
public static void main(String args[]){
ExecutorService excecutor=Executors.newFixedThreadPool(5);
for(int i=0;i<10;i++)
{
Runnable worker=new WorkerThread(""+i);
executor.excute(worker);
}
executor.shutdown();
While(!executor.isTerminated()){  }
System.out.println("Finished all threads");
}
}