import java.util.Scanner;
interface Person{
    void Name(Scanner sc);
    void Address(Scanner sc);
    void Phone_no(Scanner sc);
    void Account_num(Scanner sc);
    void Balance(Scanner sc);
}
class Bank_acc_form implements Person{
    protected String name,address;
    protected long phone,acc;
    protected int balance;
    public Bank_acc_form(){ 
        this.name="none";
        this.address="none";
        this.phone=0;
        this.acc=0;
        this.balance=0;
    }
    @Override
    public void Name(Scanner sc){
        System.out.println("Enter the Account holder Name:");
        name=sc.nextLine();
    }
    @Override
    public void Address(Scanner sc){
        System.out.println("Enter the Account holder Address:");
        address=sc.nextLine();
    }
    @Override
    public void Phone_no(Scanner sc){
        System.out.println("Enter the Account holder Phone Number:");
        phone=sc.nextLong();
    }
    @Override
    public void Account_num(Scanner sc){
        System.out.println("Enter the Account holder Account Number:");
        acc=sc.nextLong();
    }
    @Override
    public void Balance(Scanner sc){
        System.out.println("Enter the Account holder Bank Balance:");
        balance=sc.nextInt();
    }
    protected boolean Check(){
        if(balance>=500){
            System.out.println("Account has successfully created.");
            return true;
        }
        else{
            System.out.println("Insufficient Starting Fund.");
            return false;
        }
    }
    protected void Account_Details(){
        System.out.println("Customer Details:");
        System.out.println("Account Holders Name:"+name);
        System.out.println("Account Holders Address:"+address);
        System.out.println("Account Holders Phone Number:"+phone);
        System.out.println("Account Holders Account Number:"+acc);
        System.out.println("Account Holders Bank Balance:"+balance);
    }
}
class deposit extends Bank_acc_form{
    private int deposit_amount;
    public deposit(){

    }
}
public class Bank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }
}