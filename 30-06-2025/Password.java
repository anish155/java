import java.util.Scanner;
class Input{
    private String password;
    public Input(){
        this.password="none";
    }

    public void Code(Scanner sc){
        System.out.println("Enter your password:");
        password=sc.nextLine();
    }
    public void Check(Scanner sc){
        String nums="0123456789";
        String symbols="@#$&~";
        while (true) { 
            if(password.length()<8 || password.length()>14){
            System.out.println("Password limit is inappropriate, Try again.");
            Code(sc);
            }

            boolean hasnumber= false;
            boolean hassymbol=false;

            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);
                if(nums.indexOf(ch) !=-1){
                    hasnumber=true;
                }
                if(symbols.indexOf(ch) !=-1){
                    hassymbol=true;
                }
            }

            if(!hasnumber){
                System.out.println(" Password must contain at least one number.");
                Code(sc);
                continue;
            }
            if(!hassymbol){
                System.out.println(" Password must contain at least one symbol.");
                Code(sc);
                continue;
            }

            System.out.println("Password is valid");
            break;
        }
        
    }

}

public class Password {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Input i=new Input();
        i.Code(sc);
        i.Check(sc);
        sc.close();
    }
    
}
