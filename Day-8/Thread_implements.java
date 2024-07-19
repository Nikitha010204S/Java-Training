public class Thread_implements implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            try
            {
            System.out.println(i);
            Thread.sleep(3000);
        }
        catch(Exception e){

        }
    }
}
    public static void main(String[] args) {
        Thread_implements obj=new Thread_implements();
        Thread t1=new Thread(obj);
        t1.start();
        try
        {
        t1.join();
        }
        catch(Exception e){}
       
        
        Thread t2=new Thread(obj);
        t2.start();
        try {
            t2.yield();
        } catch (Exception e) {
        }
    }
}
