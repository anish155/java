import java.util.Scanner;
class Checking{
    private int data;
    public Checking(){
        this.data=0;
    }
    public void Take_data(Scanner sc){
        System.out.println("Enter the number:");
        data=sc.nextInt();
    }
    public void Prime_check(){
        if(data<2){
            System.out.println("the number "+data+" is not a prime number.");
            return;
        }
        for(int i=2;i*i<=data;i++){
            if(data%i==0){
                System.out.println("The number "+data+" is not a prime.");
                return;
            }
            else{
                System.out.println("the number "+data+" is a prime number.");
                return;
            }
        }
    }
    public int getData(){
        return data;
    }
}
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Checking c= new Checking();
        c.Take_data(sc);
        c.Prime_check();
        sc.close();
    }
}
