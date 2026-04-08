// package ObjectCreationMethod;

// import java.lang.reflect.Constructor;
// import java.lang.reflect.Field;

 

// class keyword{

//     private final int  a=10;
//     public int getValue() {
//         return a;
//     }

// }

// public class FinalKeyword {

//     public static void main(String[] args) {

//          try {
             
//             keyword key=new keyword();
//             Field field=keyword.class.getDeclaredField("a");
//             field.setAccessible(true);
//             Field modifdField =Field.class.getDeclaredField("modify");
//             modifdField.setAccessible(true);
//             field.set(key, 99);
//             System.out.println(key.getValue());

            
//          } catch (Exception e) {
//                e.printStackTrace();
//          }

         

        
//     }
    
// }
