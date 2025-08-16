import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class Calculation{

    public String expr;

    public Calculation(){
        this.expr="none";
    }

    public void take(Scanner sc){
        System.out.print("Enter an expression (or number): ");
        expr = sc.nextLine();
    }

    public void calculator(){

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        try {
            Object result = engine.eval(expr);  
            System.out.println("Result: " + result);
        } catch (ScriptException e) {
            System.out.println("Invalid expression!");
        }

    }

}

public class Expression {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Calculation calc=new Calculation();
        calc.take(sc);
        calc.calculator();
        sc.close();
    }
}
