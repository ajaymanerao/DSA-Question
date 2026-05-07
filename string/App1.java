package string;

public class App1 {
public static int  tryFinal(){
    
    try{
        return 10;
    }finally{
        return 20;
    }
 
}
    public static void main(String[] args) {
        System.out.println(tryFinal());
        
    }
    
}
