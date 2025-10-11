import java.util.Scanner;
class Checker{
    private int num;
    Checker(){
        this.num=0;
    }
    public void Take(Scanner sc){
        System.out.println("Enter the numbers:");
        num=sc.nextInt();
        sc.nextLine();
    }
    public void Check(){
        int temp=num;
        int rev=0;

        while (temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp /=10;
        }

        if (rev==num){
            System.out.println(num + " is a palindrome.");
        }
        else{
            System.out.println(num + " is not a palindrome.");
        }
    }
}

public class Palindrom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Checker ch=new Checker();
        ch.Take(sc);
        ch.Check();
        sc.close();
    }
}
