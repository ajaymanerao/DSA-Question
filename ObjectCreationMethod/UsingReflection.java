package ObjectCreationMethod;

import java.lang.reflect.Constructor;

class Student {
    private int id;
    private String name;

    public Student(){};
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public void display(){
        System.out.println("ID :"+id+" Name: "+name);
    }

}

public class UsingReflection {
    public static void main(String[] args) {
        try {
            //Load the class
             Class clazz=Class.forName("ObjectCreationMethod.Student");
             //getconstructor
             Constructor constructor=clazz.getDeclaredConstructor(int.class,String.class);
            //create object
             Student s=(Student)constructor.newInstance(11, "Ajay");
             s.display();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
}
