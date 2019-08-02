package com.sep.project;
/**
 * 
 */

/**
 * @author Hina
 *
 */
public class MathHelper 
{
	 static double power(double x, int n) {
	        if(n == 0) {
	            return 1;
	        }
	        return x * power(x, n-1);
	    }
	    
	    public static double nthRoot(int n, double A) {
	        double x0 = 1;
	        boolean accurate = false;
	        while (!accurate) {
	            double x1 = (1 / (double)n) * ((n - 1) * x0 + A / power(x0, n - 1));
	            accurate = accurate(x0, x1);
	            x0 = x1;
	        }
	        return x0;
	    }
	 
	    
	    private static boolean accurate(double x0, double x1) {
	        return abs(x1-x0) < 0.000001;
	    }
	    
	    
	    public static double abs(double a) {
	        return (a <= 0.0) ? 0.0 - a : a;
	    }
	    
	    
	   public static double calculateNegativePower(double negPower, double base)
		{
			double temp=1.0;
			double result=0.0;
			negPower = (negPower < 0 ? -negPower : negPower);
		
			for(int i=0; i < negPower ; i++)
			{
			temp=temp* base;
			}
			
			result=1/temp;
			
			
			return result;
		}
	   
	   
	 //Reduce Fraction to lowest
	 		static String reduceFraction(int x, int y)  
	 		{  
	 		    int d;  
	 		    d = __gcd(x, y);  
	 		  
	 		    x = x / d;  
	 		    y = y / d;  
	 		  
	 		    
	 		    return x + " " + y;
	 		}  
	 		  
	 		static int __gcd(int a, int b)  
	 		{  
	 		    if (b == 0)  
	 		        return a;  
	 		    return __gcd(b, a % b);  
	 		      
	 		} 
	 		
	 		//Convert Decimal to Fraction
	 		static int roundNumbertoNearestDec(double num)
	 		{
	 			 double data =num *100;
	 			 int numerator= (int) data;
	 			
	 			 return numerator;
	 		}
	 		

}
