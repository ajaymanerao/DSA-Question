package ObjectCreationMethod;
class Address implements Cloneable{
    String city;
    Address(String city){
        this.city=city; 
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Student implements Cloneable{
    int id; 
    String name;
    Address address;
    Student(int id, String  name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

      @Override
        protected Object clone() throws CloneNotSupportedException{
            Student cloned=(Student)super.clone();
            cloned.address=(Address)address.clone();
            return cloned;

        }
}

public class DeepCopy {
    public static void main(String[] args) throws Exception{
        Address adr=new Address("Pune");
        Student s1=new Student(11, "Ajay", adr);
        Student s2=(Student)s1.clone();

        s1.address.city="Mumbai";
        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }
    
}
