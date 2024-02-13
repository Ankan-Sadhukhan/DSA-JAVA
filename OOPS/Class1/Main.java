//create a class for every single student
class Student{
    int rno;
    String name;
    float marks = 91.4f; 

    //We need a way to add the values of the above properties object by object - constructor

    //we need one word to access every object - this

    //Student ankan = new Student(12, "Ankan Sadhukhan",87);
    //here, this will be replaced with ankan
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){ //copy constructor
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(){
        // this is how you call a constructor  from another constructor
        // internally: new Student(11, "random roy",56.6f);
        this(11, "random roy",56.6f);
    }

    void greeting(){
        System.out.println("Hello! My name is "+ this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }
}

public class Main{

    public static void main(String[] args) {
        Student ankan = new Student(12, "Ankan Sadhukhan",87);
        System.out.println(ankan.name);
        ankan.changeName("Cricket lover");

        Student Rahul;
        Rahul = new Student(ankan);
        System.out.println(Rahul.name);
        System.out.println(Rahul.rno);
        System.out.println(Rahul.marks);

        Student riya = new Student();
        System.out.println(riya.name);
        System.out.println(riya.rno);
        System.out.println(riya.marks);
    }

}

