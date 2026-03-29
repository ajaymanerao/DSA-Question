package ExtraPractice;
class Data{
    int x;
    public Data(int x){
        this.x=x;
    }
}

public class Equal {
    public static void main(String[] args) {
        Data d1=new Data(11);
        Data d2=new Data(11);

        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
        System.out.println("-----------------------------------------");


        int a=11;
        int b=11;
        System.out.println(a==b);
        System.out.println("-----------------------------------------");

       Integer c=11;
       Integer d=11;
       System.out.println(c==d);
       System.out.println(c.equals(d));

       System.out.println("--------------------------------------------------");


       String s1="Ajay";
       String s2="Ajay";

       System.out.println(s1==s2);
       System.out.println(s1.equals(s2));
       System.out.println("-----------------------------------------");


        String s4=new String("Ajay");
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
        System.out.println("-----------------------------------------");




    }
    
}
