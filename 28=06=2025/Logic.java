import java.util.Scanner;
interface Person{
    void Name(Scanner sc);
    void Code(Scanner sc);
}
class Page implements Person{
    private String username,password;
    public Page(){
        this.username="none";
        this.password="none";
    }
    @Override
    public void Name(Scanner sc){
        System.out.println("Username");
        username=sc.nextLine();
    }
    @Override
    public void Code(Scanner sc){
        System.out.println("Password");
        password=sc.nextLine();
    }
    public void Authenticate(){
        if(username.equalsIgnoreCase("anish") && password.equalsIgnoreCase("anish123")){
            System.out.println("Login Successful.");
        }
        else{
            System.out.println("Unauthorized accesss denied");
        }
    }

}
public class Logic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Page p=new Page();
        p.Name(sc);
        p.Code(sc);
        p.Authenticate();
        sc.close();
    }
}

