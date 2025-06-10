import java.util.Scanner;
class Same{
    private int num;
    public Same(){
        this.num=0;
    }
    public void Inp(Scanner sc){
        System.out.println("Enter:");
        num=sc.nextInt();
    }
    public void Check(){
        int rem=0;
        int rev=0;
        int temp=num;
        while(temp>0){
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(rev==num){
            System.out.println("the number is a palindrom.");
        }
        else{
             System.out.println("the number is not a palindrom.");
        }
        
    }
}
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Same s=new Same();
        s.Inp(sc);
        s.Check();
        sc.close();
    }
}
