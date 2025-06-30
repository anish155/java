import java.util.Scanner;
interface Person{
    void Name(Scanner sc);
    void Address(Scanner sc);
    void Phone(Scanner sc);
    void Email(Scanner sc);
}
class Diary implements Person{
    private String name,address,email;
    private long phone;
    
    public Diary(){
        this.name="none";
        this.address="none";
        this.email="none";
        this.phone=0;
    }

    @Override
    public void Name(Scanner sc){
        System.out.println("Enter Name");
        name=sc.nextLine();
    }
    @Override
    public void Address(Scanner sc){
        System.out.println("Enter Address:");
        address=sc.nextLine();
    }
    @Override
    public void Phone(Scanner sc){
        System.out.println("Enter Phone number:");
        phone=sc.nextLong();
        sc.nextLine();
    }
    @Override
    public void Email(Scanner sc){
        System.out.println("Enter Email:");
        email=sc.nextLine();
    }

    public void Display(){
        System.out.println("Contact details:");
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Phone:"+phone);
        System.out.println("Email:"+email);
    }
}
public class Contact {
    public static void Option(Scanner sc){
        Diary[] d=new Diary[5];
        int count=0;
        while(true){
            System.out.println("\n Options:");
            System.out.println("1. Create Contact");
            System.out.println("2. Display Details");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                if(count>=d.length){
                    System.out.println("cannot exceed the limit.");
                    break;
                }
                else{
                    Diary dr=new Diary();
                    dr.Name(sc);
                    dr.Address(sc);
                    dr.Phone(sc);
                    dr.Email(sc);
                    d[count++]=dr;
                }
                break;

                case 2:
                if(count==0){
                    System.out.println("No contact to display.");
                }
                else{
                    for(int i=0;i<count;i++){
                        d[i].Display();
                    }
                }
                break;

                case 3:
                System.out.println("Exiting program.");
                return;

                default:
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Option(sc);
        sc.close();
    }
}
