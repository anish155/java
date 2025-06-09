import java.util.Scanner;
class Sort{
    public int[] num;
    public Sort(){
        this.num=new int[10];
    }
    public void In_data(Scanner sc){
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
    }
    public void sorting(){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
     public void display() {
        System.out.println("Sorted array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
public class Bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sort s=new Sort();
         s.In_data(sc);
        s.sorting();
        s.display();
        sc.close();
    }
}
