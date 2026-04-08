package ObjectCreationMethod;

class Student implements Cloneable {
    int id = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Clone {
    public static void main(String[] args) {
        try {
            Student s1 = new Student();
            Student s2 = (Student) s1.clone();

            System.out.println(s1.id);
            System.out.println(s2.id);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}