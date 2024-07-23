package oop.inheritance.supr;

public class b extends a{
    int a=20;
    void disp(){
        System.out.println("\nTHIS is class B ;A="+a);
    }
    void updatesu(){
        super.a=50;
        super.disp();
    }

}
