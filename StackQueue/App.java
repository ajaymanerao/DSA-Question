package StackQueue;

import java.util.Scanner;

public class App {
     public static void main(String[] args) {
    Stack st=new Stack(5);
    st.push(11);
	st.push(22);
	st.push(33);
	st.push(44);
	st.push(55);

    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    switch (a) {
        case 1:
            System.out.println("-----------------------------------------");
            System.out.println(st);   
            System.out.println("-----------------------------------------");
            break;

         case 2:
            System.out.println("-----------------------------------------");
            System.out.println("Search  index "+st.search(33));
            System.out.println("-----------------------------------------");
            break;

        case 3:
            System.out.println("-----------------------------------------");
            System.out.println(st.pop(33));
            System.out.println(st);
            System.out.println("-----------------------------------------");
            break;

        case 4:
            System.out.println("-----------------------------------------");
            System.out.println(st.peek());
            System.out.println("-----------------------------------------");
            break;

        default:
            System.out.println("This case not valid");
            break;
    }
     
}
    
}
