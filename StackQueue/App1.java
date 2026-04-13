package StackQueue;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Queue queue=new Queue(5);
        queue.enqueue(11);
		queue.enqueue(22);
		queue.enqueue(33);
		queue.enqueue(44);
		queue.enqueue(55);

        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        switch (a) {
            case 1:
            System.out.println("-----------------------------------------");
            System.out.println(queue);   
            System.out.println("-----------------------------------------");
            break;

        case 2:
            System.out.println("----------------------isEmpty-------------------");
            System.out.println(queue.isEmpty());
            System.out.println("-----------------------------------------");
            break;

        case 3:
            System.out.println("---------------------isFull--------------------");
            System.out.println(queue.isFull());
            System.out.println("-----------------------------------------");
            break;


        case 4:
            System.out.println("---------------------isFull--------------------");
            System.out.println(queue.dequeue());
            System.out.println("-----------------------------------------");
            break;



        default:
            System.out.println("Not valid case");
            break;
        }

        

         
        }
 }

