import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
interface Person{
    void Name(Scanner sc);
    void Address(Scanner sc);
    void Phone(Scanner sc);
    void Password(Scanner sc);
}
interface Staff extends Person{
    void Speciality(Scanner sc);
    void Field(Scanner sc);
}
class Admin implements  Person{
    protected String name,address;
    protected int pin;
    protected long phone;
    public Admin(){
        this.name="none";
        this.address="none";
        this.phone=0;
    }
    private void Page(){
        System.out.println("Admin Registration Page");
    }
    @Override
    public void Name(Scanner sc){
        System.out.println("Enter admin name:");
        name=sc.nextLine();
    }
    @Override
    public void Address(Scanner sc){
        System.out.println("Enter admin address:");
        address=sc.nextLine();
    }
    @Override
    public void Phone(Scanner sc){
        System.out.println("Enter admin Phone number:");
        phone=sc.nextLong();
        sc.nextLine();
    }
    @Override
    public void Password(Scanner sc){
        System.out.println("Enter admin Pin code:");
        pin=sc.nextInt();
        sc.nextLine();
    }
    public void getTitle(){
        Page();
    }
   public void Store_admin() {
    try {
        FileWriter writer = new FileWriter("12-06-2025/Admin.txt", true); // append mode
        writer.write(name + "," + address + "," + phone + "," + pin + "\n"); // CSV line
        writer.close();
        System.out.println("Admin data stored successfully.");
    } catch (IOException e) {
        System.out.println("Error writing to file.");
        e.printStackTrace();
    }
}

}
class Login_Admin extends Admin{
    private void Title(){
        System.out.println("Login Page");
    }
    public void getPage(){
        Title();
    }
    public boolean login(String inputName, int inputPin) {
    try {
        File file = new File("12-06-2025/Admin.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] data = line.split(",");
            if (data.length == 4) {
                String storedName = data[0].trim();
                int storedPin = Integer.parseInt(data[3].trim());

                if (storedName.equalsIgnoreCase(inputName) && storedPin == inputPin) {
                    reader.close();
                    return true;
                }
            }
        }
        reader.close();
    } catch (Exception e) {
        System.out.println("Login failed due to error.");
        e.printStackTrace();
    }
    return false;
}

}
public class Login {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Admin admin=new Admin();
        admin.getTitle();
        admin.Name(sc);
        admin.Address(sc);
        admin.Phone(sc);
        admin.Password(sc);
        admin.Store_admin();

        Login_Admin login = new Login_Admin();
        login.getPage();

        System.out.print("Enter name for login: ");
        String inputName = sc.nextLine();
        System.out.print("Enter pin: ");
        int inputPin = sc.nextInt();

        if (login.login(inputName, inputPin)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }

        sc.close();
    }
}
