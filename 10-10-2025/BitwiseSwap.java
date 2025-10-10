import java.util.Scanner;
class Swap{
    private int n1,n2;
    Swap(){
        this.n1=0;
        this.n2=0;
    }
    public void Take(Scanner sc){
        System.out.println("Enter the first number:");
        n1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the second number:");
        n2=sc.nextInt();
        sc.nextLine();
    }
    public void Change(){
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("n1="+n1+" n2="+n2);
    }
}
public class BitwiseSwap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Swap s=new Swap();
        s.Take(sc);
        s.Change();
        sc.close();
    }
}
