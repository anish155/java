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
        sc.nextLine();
    }
    @Override
    public void Account_num(Scanner sc){
        System.out.println("Enter the Account holder Account Number:");
        acc=sc.nextLong();
        sc.nextLine();
    }
    @Override
    public void Balance(Scanner sc){
        System.out.println("Enter the Account holder Bank Balance:");
        balance=sc.nextInt();
        sc.nextLine();
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
     public long getAccNum(){
        return acc;
    }
}
class Deposit extends Bank_acc_form{
    private int deposit_amount;
    protected  int Nbalance;
    public Deposit(){
        super();
        this.deposit_amount=0;
    }
    public void Input_Deposit(Scanner sc){
        System.out.println("Enter the amount you want to Deposit:");
        deposit_amount=sc.nextInt();
        sc.nextLine();
    }
    public void Depositing_Process(){
        Nbalance=balance+deposit_amount;
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
        System.out.println("Your Initial balance was "+balance+" after adding deposit amount "+deposit_amount+" the current balance is: "+Nbalance);
    }
}
class Withdraw extends Bank_acc_form{
    private int withdraw_amount;
    protected int Nbalance;
    public Withdraw(){
        super();
        this.withdraw_amount=0;
    }
    public void Input_Withdraw(Scanner sc){
        System.out.println("Enter the amount you want to withdraw:");
        withdraw_amount=sc.nextInt();
        sc.nextLine();
    }
    public void Withdrawing_Process(){
        Nbalance=balance-withdraw_amount;
    }
    public void Withdraw_limit(){
        if(withdraw_amount<=balance){
            Withdrawing_Process();
        }
        else{
            System.out.println("Daily limit is Completed");
        }
    }
    public void Withdraw_Messgae(){
        System.out.println("Your Initial balance was "+balance+" after adding deposit amount "+withdraw_amount+" the current balance is: "+Nbalance);
    }
}
class Account_Display extends Bank_acc_form{
    public Account_Display(){
        super();
    }
    protected void Account_Details(){
        System.out.println("Customer Details:");
        System.out.println("Account Holders Name:"+super.name);
        System.out.println("Account Holders Address:"+super.address);
        System.out.println("Account Holders Phone Number:"+super.phone);
        System.out.println("Account Holders Account Number:"+super.acc);
        System.out.println("Account Holders Bank Balance:"+super.balance);
    }
}
public class Bank{
    public static void Option(Scanner sc){
        Bank_acc_form[] ba=new Bank_acc_form[20];
        int count=0;
        while(true){
        System.out.println("\n Options:");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Display Details");
        System.out.println("5. Exit");
        System.out.print("Enter the choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                if(count >= 20){
                    System.out.println("Maximum user limit reached.");
                    break;
                }
                Bank_acc_form newAcc = new Bank_acc_form();
                newAcc.Name(sc);
                newAcc.Address(sc);
                newAcc.Phone_no(sc);
                newAcc.Account_num(sc);
                newAcc.Balance(sc);
                if(newAcc.Check()){
                    ba[count++] = newAcc;
                }
                break;

            case 2:
                System.out.print("Enter account number to deposit into: ");
                long accNumD = sc.nextLong();
                sc.nextLine();
                boolean foundD = false;
                for(int i = 0; i < count; i++){
                    if(ba[i].getAccNum() == accNumD){
                        Deposit deposit = new Deposit();
                        deposit.balance = ba[i].balance;
                        deposit.Input_Deposit(sc);
                        deposit.Deposit_limit();
                        deposit.Depositing_Process();
                        deposit.Deposit_Messgae();
                        ba[i].balance = deposit.balance = deposit.Nbalance; // Update actual account
                        foundD = true;
                        break;
                    }
                }
                if(!foundD){
                    System.out.println("Account not found.");
                }
                break;

            case 3:
                System.out.print("Enter account number to withdraw from: ");
                long accNumW = sc.nextLong();
                sc.nextLine();
                boolean foundW = false;
                for(int i = 0; i < count; i++){
                    if(ba[i].getAccNum() == accNumW){
                        Withdraw withdraw = new Withdraw();
                        withdraw.balance = ba[i].balance;
                        withdraw.Input_Withdraw(sc);
                        withdraw.Withdraw_limit();
                        withdraw.Withdrawing_Process();
                        withdraw.Withdraw_Messgae();
                        ba[i].balance = withdraw.balance = withdraw.Nbalance; // Update actual account
                        foundW = true;
                        break;
                    }
                }
                if(!foundW){
                    System.out.println("Account not found.");
                }
                break;

            case 4:
                System.out.print("Enter account number to display: ");
                long accNum = sc.nextLong();
                sc.nextLine();
                boolean found = false;
                for(int i = 0; i < count; i++){
                    if(ba[i].getAccNum() == accNum){
                        System.out.println("Customer Details:");
                        System.out.println("Name: " + ba[i].name);
                        System.out.println("Address: " + ba[i].address);
                        System.out.println("Phone: " + ba[i].phone);
                        System.out.println("Account Number: " + ba[i].acc);
                        System.out.println("Balance: " + ba[i].balance);
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("Account not found.");
                }
                break;

            case 5:
                System.out.println("Exiting program.");
                return;

            default:
                System.out.println("Invalid Choice.");
                break;
        }
    }
} 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Option(sc);
        sc.close();
    }
}