public class Reverse {
    public static void main(String[] args){
       String word="madam";
       String reversed="";
       for (int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);
       }

       if (word.equals(reversed)){
            System.out.println(word+" is a palindrom.");
       }
       else{
            System.out.println(word+" is not a palindrom.");
       }
    }
}
