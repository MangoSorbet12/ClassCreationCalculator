package ClassCreationCalculator;

public class Calculator 
{
    public int addition(int a, int b)
    {
        return a+b;
    }

    public int subtract(int a,int b)
    {
        return a-b;
    }

    public int multiply(int a, int b)
    {
        return a*b;
    }

    public int divide(int a, int b)
    {
        return a/b;
    }

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
}
