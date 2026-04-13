package StackQueue;

public class Stack {

    int top;
    int arr[];

    Stack(int size){
        arr=new int[size];
        top=-1;
    }

    public boolean isEmpty(){
        return top==-1;
        
    }

    public boolean isFull(){
         return top == arr.length - 1;
    }

    public void push(int ele){
        if(isFull()){
            return;
        }
        top++;
        arr[top]=ele;
    }

    public int pop(int ele){
        if(isEmpty()){
            System.out.println("Stack is Empty");
             return -1;
        }
        int val =arr[top];
        top=top-1;
        return val;

    }

    	public int search(int ele) {
		for (int i = top; i >= 0; i--) {
			if (arr[i] == ele)
				return i;
		}
		return -1;// indicate ele not found in stack
	}
    
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int val=arr[top];
        return val;

    }

    @Override
	public String toString() {
		StringBuilder res = new StringBuilder(arr.length);
		for (int i = top; i >= 0; i--)
			res.append(arr[i] + "  ");

		return res.toString();
	}
    
}
