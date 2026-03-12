package Inheritance;

class A{
    int x=10;
    public void copy(){
        System.out.println("copy A method");
    }
}

class B extends A{
    int x=20;
    public void copy(){
        super.copy();
        System.out.println(super.x);
        System.out.println("copy B method");
    }

}

public class Progarm1 {
    public static void main(String[] args) {
        B a=new B();
        a.copy();
        System.out.println(a.x); 
        //a.x variable access depends on the Reference Type not object Type
        // Obj is type A
        //A.x
        
    }
    
}
