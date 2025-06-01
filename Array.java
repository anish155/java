class Check{
    int[] stocks={9,8,6,4,2,1};
    public void Stock_check(){
        for(int i=0;i<stocks.length;i++){
            for(int j=0;j<i;j++){
                if(stocks[j]>stocks[i]){
                    System.out.println("You had loss of:");
                    int result=stocks[j]-stocks[i];
                    System.out.println(result);
                }
            }
        }
    }
}
public class Array {
    public static void main(String[] args){
        Check c=new Check();
        c.Stock_check();
    }
}
