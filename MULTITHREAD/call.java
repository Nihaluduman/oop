package oop.MULTITHREAD;

public class call{

        public static void main(String A[]){

            samplethread s1 =new samplethread(1);
            samplethread s2 =new samplethread(2);
            samplethread s3 =new samplethread(3);
           s1.start();
            s2.start();

            s3.start();
        }
}