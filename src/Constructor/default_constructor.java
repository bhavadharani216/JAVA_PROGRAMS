package Constructor;

class Student
{
    Student()
    {
        System.out.println("Constructor Called");
    }

    void display()
    {
        System.out.println("Student Object");
    }
}

public class default_constructor
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.display();
        s2.display();
    }
}