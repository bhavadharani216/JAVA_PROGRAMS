package Constructor;

class Students
{
    String name;
    int age;

    Students(String n, int a)
    {
        name = n;
        age = a;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Parameterized_Constructor
{
    public static void main(String[] args)
    {
        Students s1 = new Students("Ram", 20);
        Students s2 = new Students("Priya", 21);

        s1.display();
        s2.display();
    }
}