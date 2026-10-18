
package ClassCreationCalculator;
import java.util.Scanner;

public class CalculatorDriver 
{
    
    public static void main (String[] args)
    {
        Scanner input= new Scanner(System.in);
        Calculator calculator= new Calculator();

        
        String stringInput= input.nextLine();
        //stores the indexes of the spaces in the user's input
        int space1= stringInput.indexOf(" ");
        
        //stores the type of data type the user selects
        String dataType= stringInput.substring(0,space1);
        String operator= stringInput.substring(space1, space1+2);


        // Code block that handles doubles
        if ( dataType.equals (" double ") ) {

        double value1 = input.nextDouble() ; 

        double value2 = input.nextDouble() ;
        double result ;

         if ( operator . equals ("+") )
        result = calculator . addition ( value1 , value2 ) ;
        else if ( operator . equals ("-") )
        result = calculator . subtract ( value1 , value2 ) ;
        else if ( operator . equals ("*") )
        result = calculator . multiply ( value1 , value2 ) ;
        else if ( operator . equals ("/") )
         result = calculator . divide ( value1 , value2 ) ;
         else {
        System . err . println (" Invalid operator .") ;
        return ;
         }
         // Add your result printing statement here
        }

        // Code block that deals with integers
        else if ( dataType . equals (" integer ") ) 
        {

        int value1 = input . nextInt () ;
        int value2 = input . nextInt () ;
        int result ;
        

        if ( operator . equals ("+") )
        result = calculator . addition ( value1 , value2 ) ;
        else if ( operator . equals ("-") )
        result = calculator . subtract ( value1 , value2 ) ;
        else if ( operator . equals ("*") )
        result = calculator . multiply ( value1 , value2 ) ;
        else if ( operator . equals ("/") )
        result = calculator . divide ( value1 , value2 ) ;
        else 
        {
            System.err.println ("Invalid operator.");
            return result;
        }
        // Add your result printing statement here
        System.out.println(value1+operator+value2+"="+result);
        }


        // Code block to deal with a non - valid data type input
        else 
        {
        System . err . println (" Data type incompatible - exiting program .") ;
        }

        input.close();
    }
}
