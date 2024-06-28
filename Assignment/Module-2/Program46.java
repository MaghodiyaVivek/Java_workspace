package javaprogram;

// W.A.J.P to start the same Thread twice by calling start () method twice. Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();

class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() 
    {
        System.out.println("Thread '" + threadName + "' is running.");
        try {
            
            Thread.sleep(2000);
        } catch (InterruptedException e) 
        {
            System.out.println("Thread '" + threadName + "' was interrupted.");
        }
        System.out.println("Thread '" + threadName + "' has completed.");
    }
}

public class Program46 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) 
        {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
