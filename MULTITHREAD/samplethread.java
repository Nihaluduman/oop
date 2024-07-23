package oop.MULTITHREAD;

public class samplethread extends Thread {
    int a;
    samplethread(int a){
        this.a=a;
        

    }

    public void run(){
        int i;
        for(i=0;i<10;i++){
        try {
            System.out.println("this is sleep "+i+"of "+a);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }}
    }
}
