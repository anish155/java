import java.util.Scanner;
class Number{
    private int num;

    public Number() {
        this.num=0;
    }
    public void Take(Scanner sc){
        System.out.println("Enter the number:");
        num=sc.nextInt();
        sc.nextLine();
    }
    public void Process(){
        int temp=num;
        int rev=0;

        while(temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
public class Reversal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Number nm=new Number();
        nm.Take(sc);
        nm.Process();
        sc.close();
    }
}
