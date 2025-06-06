import java.util.Scanner;
class Arr{
    private int[] arr;
    public Arr(){
        this.arr=new int[10];
    }
    public void Arr_input(Scanner sc){
        System.out.println("Enter the numbers:");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public void Check(){
        int target=50;
        boolean found=false;
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println("The number matching target was in index: "+mid);
                found=true;
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        if (!found) {
            System.out.println("The number was not found in the array.");
        }
    }
}
public class Mid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Arr a=new Arr();
        a.Arr_input(sc);
        a.Check();
        sc.close();
    }
}
