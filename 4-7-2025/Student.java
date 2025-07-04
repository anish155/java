import java.util.ArrayList;
import java.util.Scanner;

interface Person{
    void Name(Scanner sc);
    void Address(Scanner sc);
    void Roll(Scanner sc);
    void Marks(Scanner sc);
}
class Stud implements Person{
    protected String name,address;
    protected int roll,marks;
    public Stud(){
        this.name="none";
        this.address="none";
        this.roll=0;
        this.marks=0;
    }

    @Override
    public void Name(Scanner sc){
        System.out.println("Enter the name of student:");
        name=sc.nextLine();
    }
    @Override
    public void Address(Scanner sc){
        System.out.println("Enter the address of student:");
        address=sc.nextLine();
    }
    @Override
    public void Roll(Scanner sc){
        System.out.println("Enter the roll no of student:");
        roll=sc.nextInt();
        sc.nextLine();
    }
    @Override
    public void Marks(Scanner sc){
        System.out.println("Enter the marks of student:");
        marks=sc.nextInt();
        sc.nextLine();
    }
    public void Display(){
        System.out.println("Displaying Student Details:");
        System.out.println("Student's Name:"+name);
        System.out.println("Student's Address:"+address);
        System.out.println("Student's Roll:"+roll);
        System.out.println("Student's Marks:"+marks);
    }
    public int getRoll(){
        return roll;
    }
}

public class Student {
    public static void Option(Scanner sc){
        ArrayList<Stud> students = new ArrayList<>();
        while (true) { 
            System.out.println("\n\nAdmin's Panel");
            System.out.println("1. Student detail (Entering)");
            System.out.println("2. Student detail (Displaying)");
            System.out.println("3. Student detail (Deleting)");
            System.out.println("4. Exiting the program \t");
            System.out.println("Enter your choice (1 to 4):");
            int choice=sc.nextInt();
            sc.nextLine();
            
            switch(choice){

                case 1:
                Stud s=new Stud();
                s.Name(sc);
                s.Address(sc);
                s.Roll(sc);
                s.Marks(sc);
                students.add(s);
                System.out.println("Student added successfully");
                break;

                 case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (Stud stu : students) {
                            stu.Display();
                        }
                    }
                break;

                case 3:
                    System.out.print("Enter roll number to delete: ");
                    int rollToDelete = sc.nextInt();
                    sc.nextLine();
                    boolean removed = students.removeIf(stu -> stu.getRoll() == rollToDelete);
                    if (removed) {
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");

        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Option(sc);
        sc.close();
    }
}
