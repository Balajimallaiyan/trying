import java.util.*;
import java.lang.*;
class thx extends Thread{
    public void run(){

        for(int  i =0;i<6;i++){
            System.out.println("this is form the thread runnable class");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("exception");
        } 
        }
    }
}
class the implements Runnable {
    String name ;
    the(String name){
        this.name =name;
    }
    public void run(){
        for(int  i =0;i<6;i++){
            System.out.println("this is form the thread runnable class"+ name);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("exception");
        } 
        }
        
    }
}
class cot {
    private int counter;
    public synchronized void inc (){
        counter++;
    }// this is new line
    public int getval (){
        return counter;
    }
}
class exthread extends Thread{
    cot c ;
    exthread(cot c){
        this.c = c;
    }
    public void run(){
        for(int i =0;i<1000;i++){
            c.inc();
        }
        // this is the second line
    }
}

class  threa {
    public static void main(String args[]){
       /*  Thread t = new Thread(new the("balaji"));
        t.start();
        for(int i =0;i<5;i++){
            System.out.println("this is from the main"+i);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println("exception");
                } 
        }*/
        cot c = new cot();
        exthread t1 = new exthread(c);
        exthread t2 = new exthread(c);
        t1.start();
        t2.start();
        t1.setPriority(10);
        try {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println("summma errors ");
        }
        System.out.println("this is the values of countet"+c.getval() );
     }
 }
