import java.util.Scanner;

class Check{
        private int[] nums;
        public Check(){
            nums=new int[6];
        }
        public void Take(Scanner sc){
            System.out.println("Enter the numbers:");
            for(int x=0;x<nums.length;x++){
                nums[x]=sc.nextInt();
                sc.nextLine();
            }
        }

        public void Large_Smol(){
            int big=nums[0];
            int smol=nums[0];

            for(int n:nums){
                if(n>big){
                    big=n;
                }
                if(n<smol){
                    smol=n;
                }
            }
            
            System.out.println("Largest: " + big);
            System.out.println("Smallest: " + smol);
        }
    }

public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Check c=new Check();
        c.Take(sc);
        c.Large_Smol();
        sc.close();
    }
}
