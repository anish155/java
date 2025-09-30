import java.util.Scanner;
class Arr{
    private int[] arr1,arr2,merged;
    Arr(int n1,int n2){
        arr1=new int[n1];
        arr2=new int[n2];
        merged=new int[n1+n2];
    }
    public void Take(Scanner sc){
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for second array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
    }

    public void mergeArrays() {
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
        }
    }

    public void display(){
        System.out.println("Merged Array:");
        for (int val : merged) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
public class Merge {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        Arr obj = new Arr(n1, n2);
        obj.Take(sc);
        obj.mergeArrays();
        obj.display();
        sc.close();
    }
}
