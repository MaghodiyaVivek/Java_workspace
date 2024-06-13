package javaprogram;
//W.A.J. P to create one thread by extending Thread class in another Class.


class MyThread extends Thread {
 
 @Override
 public void run() 
 {
     for (int i = 1; i <= 5; i++) 
     {
         System.out.println(": " + i);
         try 
         {
             Thread.sleep(1000);
         } catch (InterruptedException e) 
         {
             System.out.println(e.getMessage());
         }
     }
 }
}

public class Program44 
{
 public static void main(String[] args) {
     
     MyThread myThread = new MyThread();

     myThread.start();
 }
}
