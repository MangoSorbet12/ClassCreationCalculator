package ClassCreationCalculator;

public class Calculator 
{
    //generics methods (accepts int and double input values)
    //prints out answer as a double
    public <T extends Number> double addition(T a, T b)
    {
       return a.doubleValue()+b.doubleValue();
    }

    public <T extends Number> double subtract(T a,T b)
    {
        return a.doubleValue()-b.doubleValue();
    }

    public <T extends Number> double multiply(T a, T b)
    {
        return a.doubleValue()*b.doubleValue();
    }

    public <T extends Number> double divide(T a, T b)
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
