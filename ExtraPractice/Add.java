package ExtraPractice;

public class Add {

    void main(){
        //System.out.println(1+1);

        String str1="Animal";
        String str2="Animal";
        //System.out.println(str1.equals(str2));


        StringBuffer str3=new StringBuffer("Animal");
        StringBuffer str4=new StringBuffer("Animal");
        // System.out.println(str3.equals(str4));
        System.out.println(str3.compareTo(str4));
        System.out.println(str1.contentEquals(str4));
        System.out.println(str3.toString().equals(str4.toString())); // content check instring buffer
        System.out.println(str1.equals(str4));

        //var it say to compiler you decide the datatype based on the value i assign
        //var is not the datatype it is the keyword of java
        var a=5;
        var b=6;
        System.out.println(a+b);
        var c=44.44;
        var e=55.55;
        System.out.println(c+e);


    }
    
}
