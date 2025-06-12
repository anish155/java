import java.util.Arrays;
import java.util.Scanner;
class Take{
    private int[] num;
    public Take(){
        this.num=new int[10];
    }
    public void In_data(Scanner sc){
        System.out.println("Enter the series of number:");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
    }
    public void Sort(){
        Arrays.sort(num);
        System.out.println("Sorted numbers:");
        for(int n:num){
            System.out.println(n+" ");
        }
        System.out.println();
    }
}
public class Sarr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Take t=new Take();
        t.In_data(sc);
        t.Sort();
        sc.close();
    }
}
