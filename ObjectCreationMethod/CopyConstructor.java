package ObjectCreationMethod;

class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    //copy constructor
    Student(Student s){
        this.id=s.id;
        this.name=name;
    }

    void display(){
        System.out.println(id+" "+name);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1=new Student(1, "Ajay");
        Student s2=new Student(s1);

        s1.display();
        s2.display();

        s2.name="Rahul";
        s1.display();
        s2.display();
        
    }
    
}
