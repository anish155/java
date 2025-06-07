import java.util.Arrays;
import java.util.Scanner;
class Arr{
    int[] first={1,2,3,7,8,5,6,9};
    int[] second={8,0,4,7,2,6,3,5,1};
    
    public void Sort(){
        Arrays.sort(first);
        Arrays.sort(second);
    }

    public int[] merge() {

        int n = first.length;
        int m = second.length;
        int[] merged = new int[n + m];

        int i = 0;      
        int j = 0;      
        int k = 0;      

        
        while (i < n && j < m) {
            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }

        
        while (i < n) {
            merged[k++] = first[i++];
        }

        
        while (j < m) {
            merged[k++] = second[j++];
        }

        return merged;
    }
}
public class Merge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         Arr arrOps = new Arr();

        
        arrOps.Sort();

        
        int[] merged = arrOps.merge();

       
        System.out.println("First  (sorted): " + Arrays.toString(arrOps.first));
        System.out.println("Second (sorted): " + Arrays.toString(arrOps.second));
        System.out.println("Merged          : " + Arrays.toString(merged));
    }
}
