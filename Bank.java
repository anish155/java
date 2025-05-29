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
class Deposit extends Bank_acc_form{
    private int deposit_amount;
    private int new_balance;
    public Deposit(){
        super();
        this.deposit_amount=0;
    }
    public void Input_Deposit(Scanner sc){
        System.out.println("Enter the amount you want to Deposit:");
        deposit_amount=sc.nextInt();
    }
    public void Depositing_Process(){
        new_balance=balance+deposit_amount;
    }
    public void Deposit_limit(){
        if(deposit_amount<=1000000){
            Depositing_Process();
        }
        else{
            System.out.println("Daily limit is Completed");
        }
    }
    public void Deposit_Messgae(){
        System.out.println("Your Initial balance was "+balance+" after adding deposit amount "+deposit_amount+" the current balance is: "+new_balance);
    }
}
class Withdraw extends Bank_acc_form{
    private int withdraw_amount;
    private int new_balance;
    public Withdraw(){
        super();
        this.withdraw_amount=0;
    }
    public void Input_Withdraw(Scanner sc){
        System.out.println("Enter the amount you want to withdraw:");
        withdraw_amount=sc.nextInt();
    }
    public void Withdrawing_Process(){
        new_balance=balance-withdraw_amount;
    }
    public void Deposit_limit(){
        if(withdraw_amount<=balance){
            Withdrawing_Process();
        }
        else{
            System.out.println("Daily limit is Completed");
        }
    }
    public void Withdraw_Messgae(){
        System.out.println("Your Initial balance was "+balance+" after adding deposit amount "+withdraw_amount+" the current balance is: "+new_balance);
    }
}
public class Bank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    }
}