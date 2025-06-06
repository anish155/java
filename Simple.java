import java.util.Scanner;
class Arr_input{
    private int[] arr;
    public Arr_input(){
        this.arr=new int[10];
    }
    public void Arr_Input(Scanner sc){
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the series of number:");
            arr[i]=sc.nextInt();
        }
    }
    public void Checking(){
        int target=90;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("The number that matched target was in index: "+i);
                found = true ;
                break;
            }
        }
        if(!found){
            System.out.println("The number is not found in the array.");
         } 
    }
}
public class Simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Arr_input a=new Arr_input();
        a.Arr_Input(sc);
        a.Checking();
        sc.close();
    }
}
