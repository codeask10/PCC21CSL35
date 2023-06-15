//File Name should be Multithread.java

Import java.util.*;
Class second implements Runnable{
    public int x;
    public second (int x){
        this.x=x;
    }
    public void run(){
        System.out.println("Second thread:Square of the number is "+x*x);
    }
}
Class third implements Runnable{
    public int x;
    public third (int x){
        this.x=x;
    }
    public void run(){
        System.out.println("third thread:Cube of the number is "+x*x*x);
    }
}
Class first extends Thread{
    public void run(){
        int num=0;
        Random r=newRandom();
        try{
            for(inti=0;i<5;i++){
                num=r.nextInt(100);
                System.out.println("first thread generated number is "+num);
                Thread t2=new Thread (newsecond(num));
                t2.start();
                Thread t3=newThread(new third(num));
                t3.start();
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class Multithread{
    public static void main(String args[]){
        first a=new first();
        a.start();
    }
}
