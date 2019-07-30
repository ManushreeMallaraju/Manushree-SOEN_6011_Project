package javaapplication6;

import java.util.Scanner;
	/*
	 * @author m_allara
	 * Class Fuction6, defines the process of Power Calculation for the function: a(b)^x
	 */
public class JavaApplication6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // TODO code application logic here
      
        Scanner input = new Scanner(System.in);
    	System.out.print("Enter the value of x: ");
    	double x = input.nextDouble();
       System.out.printf("The value of the function a(b)^x is : %f", calculation(x)); 
    }

	 public static double calculation(double x)
	 {
             /*
             * For all the cases, constant values for variables: a and b are fixed
             * i.e., a=2 , b=2
             */
              double b = 2;
	      double a = 2; 
	      double pow = 1;
	      double num = 1;
	      double den = 1;
	      
        if (x == (int)x){
            pow = power(b,x);
            System.out.println("The power is non-fraction\n");
        }
        else
        {
            System.out.println("The power is a fraction\n");
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
    
	/*
	 * Function to calculate power
	 * 
	 * @param base, value of base b
	 * @param exp, value associated with variable 'num' or 'den'
	 * @return res, result of power 
	 */
	static double power(double base, double exp) 
	{ 
	    double res = 1; 
	
	    if (exp >0)
	    {
	        System.out.println("\nThe given value is Positive power");
	        while ((int)exp > 0) 
	        {      
	            res = res*base; 
	            exp = exp-1; 
	        }
	    }
	    else
	    {
	        System.out.println("The given value is Negative power");
	        while ((int)exp < 0) 
	        {      
	            res = res*base;
	            exp = exp+1; 
	        }
	        res = 1/res;
	    }   
	     
	    return res; 
	}
	
	/*
	 *  Function to calculate power of a number
	 *  Using Newton's method of Nth root
	 *  Nth root function
	 *  
	 *  @param A, value returned by the power function
	 *  @param B, value associated with den
	 *  @return x, the current value of the iteration
	 */
	static double nRoot(double A, double N) 
	{ 
	    //initially guessing a random number 
	    double ranVal = 4; 
	    //precision
	    double prec = 1e-3; 
	  
	    //difference between the two roots be max of the following digits
	    double dx = 2147483647; 
	  
	    //x denotes current value of the iteration 
	    double x = 1; 
	  
	    //loop until we reach desired accuracy 
	    while (dx > prec){ 
	        //calculating current value from the previous value obtained
	        x = ((N - 1.0) * ranVal + A/power(ranVal, N-1)) / N; 
	        dx = (x - ranVal);
	        if (dx < 0){
	            dx = dx*-1;
	        }
	        prec = x; 
	    }  
	    return x; 
	}
}

