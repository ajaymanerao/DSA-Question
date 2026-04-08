package ObjectCreationMethod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    int id;
    String name;

    public Student(int id, String name) {
        this.id=id;
        this.name=name;

    }
}

public class Deserialization {
    public static void main(String[] args) {
        try {

            //Serialization
            Student s=new Student(11, "Ajay");
            FileOutputStream fos=new FileOutputStream("Student.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();
            System.out.println("Object Serialization Successfully");
            

            // Deserialization
            FileInputStream fis= new FileInputStream("Student.ser");
            ObjectInputStream ois= new ObjectInputStream(fis);

            Student std= (Student)ois.readObject();
            ois.close();
            fis.close();

            System.out.println("ID :"+std.id);
            System.out.println("Name :"+std.name); 


            
        } catch (Exception e) {
           e.printStackTrace();
        }
        
    }
    
}
