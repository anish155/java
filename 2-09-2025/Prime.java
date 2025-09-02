import java.util.Scanner;
class Check{
    private int num;
    private boolean isPrime;
    public Check(){
        this.num=0;
        this.isPrime=true;
    }
    public void Take(Scanner sc){
        System.out.println("Enter the numbers:");
        num=sc.nextInt();
        sc.nextLine();
        Checker();
    }
    public void Checker(){
        if (num<2){
            System.out.println(num+"Not a Prime.");
            isPrime=false;
        }
        else{
            for (int i=2;i<=Math.sqrt(num);i++){
                if (num%i==0){
                    System.out.println(num+"Not a Prime.");
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+"Is a Prime.");
        }
        else{
            System.out.println(num+"Not a Prime.");
        }
    }
}

public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Check c =new Check();
        c.Take(sc);
        sc.close();
    }
}
