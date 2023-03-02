
//abstract class is non access modifier.It can not be created object to access it .
// it must be inherited by child class.
//an abstract method has no body.the body is provided by child class.
// it is only used in abstract class.
//abstract class is by default static.
abstract class A{
    public String name="john";
    public int age=18;
    public abstract void study();
}
class Student extends A{
    public String graduationYear="2017";
    public void study() {
        System.out.println("Studying all day long");
    }
}

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("name:" + obj.name);
        System.out.println("age :" + obj.age);

        System.out.println("graduation year:" + obj.graduationYear);

        obj.study();
        // System.out.println("Hello world!");
    }
}