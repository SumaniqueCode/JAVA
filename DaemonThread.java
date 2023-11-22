/* Daemon thread in Java is a low-priority thread that runs in the background to perform 
tasks such as garbage collection. Daemon thread in Java is also a service provider thread
that provides services to the user thread. */
public class DaemonThread extends Thread  
{    
    public void run()  
    {    
        if(Thread.currentThread().isDaemon())  
        {  
            System.out.println("daemon thread work");    
        }    
        else 
        {    
            System.out.println("user thread work");    
        }    
    }    
    public static void main(String[] args)  
    {    
        DaemonThread thread1=new DaemonThread();   
        DaemonThread thread2=new DaemonThread();    
        DaemonThread thread3=new DaemonThread(); 
        System.out.println();   
        thread1.setDaemon(true);  
        thread1.start();   
        thread2.setDaemon(true);  
        thread2.start();    
        thread3.start();    
    }    
}   