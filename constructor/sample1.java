package oop.constructor;

public class sample1 {
    int a=1,b=2;
    sample1(int a,int b){
        System.out.println(a+" "+b);
       a=this.a;
       b=this.b;
        System.out.println(a+" "+b);
    }
    
}
