public class LetterException {

    private String letter;

    LetterException(String letter){
        this.letter=letter;
    }

    public String getLetter(){
        return letter;
    }

    public void setLetter(String letter){
        this.letter=letter;
    }

    public void Operation()throws Exception{
        try {
            int divide=Integer.parseInt(letter)/2;
            System.out.println("Result: " + divide);
        } 
        catch (Exception e) {
            throw new Exception("Input provided is not valid or Integer.");
        }
    }
}
