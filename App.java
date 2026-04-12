import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Student{
    int id;
    Student(int id){
        this.id=id;
    }
}

public class App {

public static void  main(String[] args) {
    // int a=10;
    // int b=20;
    // System.out.println(a+b);
    // System.out.println(a-b);
        // System.out.println("10"+20+30);
        // System.out.println(10+"20"+30);
        // System.out.println(10+20+"30");
        // System.out.println("10"+2*6);

        // int a=1200;
        // int rev=0;
        // while(a!=0){
        //     int d=a%10;
        //     rev=rev*10+d;
        //     a/=10;

        // }
        // System.out.println(rev);

        //print("10"+"20"*3); 10202020

        // String str="aaabbc";
        // for(int i=0;i<str.length();i++){
        //     boolean value=false;
        //     for(int k=0;k<i;k++){
        //         if(str.charAt(i)==str.charAt(k)){
        //             value=true;
        //             break;
        //         }
        //     }
        //     if(value)continue;
        //     int count=1;
        //     for(int j=i+1;j<str.length();j++){
        //         if(str.charAt(i)==str.charAt(j)){
        //             count++;
        //         }
        //     }
        //     System.out.print(str.charAt(i)+""+count);
        
        // }

//          Set<Student> set = new HashSet<>();

// set.add(new Student(1));
// set.add(new Student(1));

// System.out.println(set.size());
    //    Scanner sc=new Scanner(System.in);
    //    int a=sc.nextInt();
    //    double d=sc.nextDouble();
    //    String str=sc.nextLine();
       
    //    System.out.println(a);
    //    System.out.println(str);
    //    System.out.println(d);

    

    //Immutable Integer
    // Integer a=20;
    // Integer b=a;
    // a=30;
    // System.out.println(a+" "+b);



    //mutable StringBuffer
    // StringBuffer sb1=new StringBuffer("A");
    // StringBuffer sb2= sb1;
    // sb1.append("B");
    // System.out.println(sb1);
    // System.out.println(sb2);


    // Integer a=200;
    // a=300;
    // System.out.println(a);


    // String s1="AjayAnerao";
    // final String s2="Ajay";
    // String s3=s2+"Anerao";
    // System.out.println(s1==s3);


    String password="123";
    if(password=="123"){
        System.out.println("Valid");
    }else{
        System.out.println("invalid");
    }








}
    
}
