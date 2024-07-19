public class Thread_extends extends Thread{
    public void run()
    {
        System.out.println("Thread 1");
    }
    public static void main(String[] args) {
        Thread_extends a=new Thread_extends();
        a.start();
        Thread_extends b=new Thread_extends();
        b.start();
    }
}
