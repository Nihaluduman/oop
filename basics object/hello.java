package oop;

public class hello {
    public static void main(String args[]){

        sample s1=new sample();
        sample s2=new sample();
        s1.a=10;
        s1.b=20;
        s2.a=30;
        s2.b=40;

        System.out.println(s1.a);
        System.out.println(s1.b);
        System.out.println(s2.a);
        System.out.println(s2.b);
        s1.disp();
    }
    
}
