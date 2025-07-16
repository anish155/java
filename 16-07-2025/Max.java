import java.util.Scanner;
class Maxarr{
    private int[] nums=new int[10];
    public void Take_num(Scanner sc){
        System.out.println("Enter the numbers:");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.nextLine();
    }
    public void Display(){
        System.out.println("Displaying all the numbers in array:");
        for(int num:nums){
            System.out.println(num+" ");
        }
        System.out.println("");
    }
    public void Max(){
        int max=nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("The maximum elements in the array is:"+max);
    }
}
public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Maxarr m=new Maxarr();
        m.Take_num(sc);
        m.Display();
        m.Max();
        sc.close();
    }
}
