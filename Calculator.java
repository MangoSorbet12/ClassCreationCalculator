package ClassCreationCalculator;

public class Calculator 
{
    public  <T> T addition(T a, T b)
    {
       return a.doubleValue()+b.doubleValue();
    }

    public static <T> T subtract(T a,T b)
    {
        return a.doubleValue()-b.doubleValue();
    }

    public static <T> T multiply(T a, T b)
    {
        return a.doubleValue()*b.doubleValue();
    }

    public static <T> T divide(T a, T b)
    {
        return a.doubleValue()/b.doubleValue();
    }
/* 
    //these are the overloaded methods- uses double inputs and has a double return type
    public double addition(double c, double d)
    {
        return c+d;
    }

    public double subtract(double c, double d)
    {
        return c-d;
    }

    public double multiply(double c, double d)
    {
        return c*d;
    }

    public double divide(double c, double d)
    {
        return c/d;
    }
 */
}
