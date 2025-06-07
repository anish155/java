class Split{
    int[] num={1,2,3,4,5,6,7,8,9};
    public void Subarr(){
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(num[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
public class Sub {
    public static void main(String[] args){
        Split s=new Split();
        s.Subarr();
    }
}
