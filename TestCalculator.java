package ClassCreationCalculator;

//tests the outputs of the Calculator Class methods
public class TestCalculator 
{
    public static void main(String[] args)
    {
        double x=7.0;
        double y=5.8;


        Calculator calc= new Calculator();
        System.out.println("Welcome to the Calculator Program!");

        //tests the math methods
        System.out.println(x+"+"+y+"="+calc.addition(x,y));
        System.out.println(x+"-"+y+"="+calc.subtract(x,y));
        System.out.println(x+"*"+y+"="+calc.multiply(x,y));
        System.out.println(x+"/"+y+"="+calc.divide(x,y));
    

       
    }
    
}
