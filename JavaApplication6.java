/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.*;
/**
 *
 * @author m_allara
 */
public class JavaApplication6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input = new Scanner(System.in);
    	System.out.print("Enter the value of x: ");
    	double x = input.nextDouble();
       System.out.printf("%f", calculation(x)); 
    }

    
    
    
    public static double calculation(double x)
    {
         double b = 2, a = 2 , pow = 1, num = 1, den = 1;
          //Given exponent is not a fraction
        if (x == (int)x)
        {
            pow = power(b,x);
            System.out.print("non fraction\n");
        }
        else
        {
            System.out.print("fraction\n");
            //find the fraction form of the float
            if (x<0)
            {
                x = x*-1;
            }
            while((num/den) != x)
            {
                if((num/den) < x)
                {
                    num = num +1;
                }
                if((num/den) > x)
                {
                    den = den +1;
                }
                if(b <= 0)
                {
                    break;
                }
            }
            if (x>0)
            {
                double val = power(b,num);
                pow = nRoot(val,den);
            }
            else
            {
                double val = power(b,den);
                pow = nRoot(val,num);
            }
                
        }
        return a*pow;
    }
    
////////////////////////////////////////////////////////
// Function to calculate power
///////////////////////////////////////////////////////
static double power(double base, double exp) 
{ 
    double res = 1; 

    if (exp >0)
    {
        System.out.print("positive power \n");
        while ((int)exp > 0) 
        {      
            res = res*base; 
            // n must be even now 
            exp = exp-1; // y = y/2   
        }
    }
    else
    {
        System.out.print("negative power\n");
        while ((int)exp < 0) 
        {      
            res = res*base; 
            // n must be even now 
            exp = exp+1; // y = y/2   
        }
        res = 1/res;
    }   
     
    return res; 
}

////////////////////////////////////////////////////////
// Function to calculate power
// Using Newton's method of Nth root
// Nth root function
///////////////////////////////////////////////////////
static double nRoot(double A, double N) 
{ 
    System.out.println("nth Root");
    //intially guessing a random number 
    double ranVal = 4; 
    //precision
    double prec = 1e-3; 
  
    //diff between two roots be max
    double dx = 2147483647; 
  
    //x denotes current value of iteration 
    double x = 1; 
  
    //loop untill we reach desired accuracy 
    while (dx > prec) 
    { 
        //calculating current value from previous 
        x = ((N - 1.0) * ranVal + A/power(ranVal, N-1)) / N; 
        dx = (x - ranVal);
        if (dx < 0)
        {
            dx = dx*-1;
        }
        prec = x; 
    } 
  
    return x; 
} 
}
