package ObjectCreationMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

 

class keyword  {

    private final int  a=10;
    String name;
}

public class FinalKeyword {

    public static void main(String[] args) {

         try {
            
            keyword key=new keyword();
            Field field=keyword.class.getDeclaredField("a");
            field.setAccessible(true);
            field.set(key, 99);
            System.out.println(field.get(key));

            
         } catch (Exception e) {
               e.printStackTrace();
         }

         

        
    }
    
}






// import java.lang.reflect.Field;
// import java.util.*;
//  class Keyword{
//     private final int a = 10; 
// } 

// public class FinalKeyword{
//     public static void main(String[] args) throws Exception {
//         Keyword key= new Keyword();
        
//         Field field=Keyword.class.getDeclaredField("a");
//         field.setAccessible(true);
//         field.set(key,99);
//         System.out.println(field.get(key));
//     }
// }