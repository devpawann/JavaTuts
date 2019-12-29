/*Thread priority is the process of assiging priority to the thread created.
By default JVM provides priority to each thread and we as a programmer can set the priority by our own.*/

package HomeAssignment1;

import static java.lang.Thread.sleep;

class Athread implements Runnable{

     @Override
     public void run() {
         for (int i=0;i<10;i++){
             System.out.println(i);
             try {
                 sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

     }
 }

 class Bthread implements Runnable{

     @Override
     public void run() {
         for (int i=10;i<20;i++){
             System.out.println(i);
             try {
                 sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

     }
 }


public class ThreadPriority {
    public static void main(String[] args) {
        Athread a=new Athread();
        Thread t1=new Thread(a);


        Bthread b=new Bthread();
        Thread t2=new Thread(b);


        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();





    }
}
