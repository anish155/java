import java.util.Scanner;
class Take_num{
    private int num;
    public void In(Scanner sc){
        System.out.println("Enter the number:");
        num=sc.nextInt();
        sc.nextLine();
    }
    public int getNum(){
        return num;
    }
}
class Num{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Take_num[] take=new Take_num[10];
            for(int i=0;i<take.length;i++){
                take[i]=new Take_num();
                take[i].In(sc);
            }
            for(int i=0;i<take.length;i++){
                System.out.println("The numbers are:"+take[i].getNum());
            }
        sc.close();
    }
}