package ClassCreationCalculator;

public class TestCalculator 
{
    public static void main(String[] args)
    {
        int x=6;
        int y=3;

        Calculator calc= new Calculator();
        System.out.println("Welcome to the Calculator Program!");
        System.out.println(x+"+"+y+"="+calc.addition(x,y));
        System.out.println(x+"-"+y+"="+calc.subtract(x,y));
        System.out.println(x+"*"+y+"="+calc.multiply(x,y));
        System.out.println(x+"/"+y+"="+calc.divide(x,y));
       
    }
    
}
