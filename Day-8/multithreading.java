// Class extending Thread to print numbers from 0 to 4
class Thread1 extends Thread {
   
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            
        }
    }
}

class Thread2 extends Thread {
  
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
           
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1(); 
        Thread2 t2 = new Thread2(); 
        t1.start(); 
        t2.start(); 
    }
}
