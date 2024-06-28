package javaprogram;
//W.A.J. P to create one thread by implementing Runnable interface in class.


class MyRunnable implements Runnable 
{
 
 @Override
 public void run() 
 {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread running: " + i);
         try 
         {
            
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }
 }
}

public class Program43 
{
 public static void main(String[] args) 
 {
     
     MyRunnable myRunnable = new MyRunnable();
 
     Thread thread = new Thread(myRunnable);
     thread.start();
 }
}
