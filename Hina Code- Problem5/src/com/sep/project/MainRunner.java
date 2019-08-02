package com.sep.project;
import java.util.Scanner;
import java.util.regex.Pattern;



/**
 * 
 */

/**
 * @author Hina
 *
 */
public class MainRunner {

	static  final double a=2;
	static  final double b=-3;
	static MathHelper help= new MathHelper();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MainRunner main=new MainRunner();
		

		System.out.println("Enter 1 for Whole variables such as 2, -5, 2.5");
		System.out.println("Enter 2 for Fractional Variables-Positive or negative --Like 1/5 or -2/3");
		
		
		String choice=sc.nextLine();
		
		
		//check for whole positive  numbers
		if (choice.equals("1")) {
			double x= sc.nextDouble();
			double value=0.0;
			

			if(x > 0  &&  x==(int)x) {
				
			System.out.println(calculatePositiveX(x,b));
			}
			
			if(x >0 && x%1 !=1 ) {
				
				System.out.println(main.calcDecValues(x));
			    
			    
				
				
			}
		//----------------------------------------------------------------------------------------------------//	
			if(x<0 && x %-1 ==1)
			{
				double temp=calculateNegativePower(x, b);
				double val=0;
				if(temp <0)
				{
					val=calculateNegativePower(temp, a);
				}
				else if(temp >0)
				{
					val=calculateValue(val,b);
				}
				System.out.println(val);
			}
			
			//----------------------------------------------------------------------------------------------------//
			
			
			  if(x<0 && x %-1 !=0) { 
				  System.out.println(main.calculateNegDecimal(x)); 
			  }
			  
			//----------------------------------------------------------------------------------------------------//
			  
			  if( x==0) {
				  System.out.println(calculateNegativePower(b, a));
			  }
				  
			 
			
		}
		
		if (choice.equals("2")) {
		
	      System.out.println( main.calculateFractionalPowers());
			
		}
		
	}

	/*Use for positive power values
	 * @param positive exponent and base
	 * 
	 * @return positive value
	 */
		static double calculateValue(double exp, double base) {
			double result =1.0;
			double temp=1.0;

			for(int i=0; i < exp ; i++)
			{
			temp=temp* base;
			}
			
			return temp;
		}
		
		
		/*Use for negative power values
		 * @param negative exponent and base
		 * 
		 * @return double value
		 */
		static double calculateNegativePower(double negPower, double base)
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
		

		/*For positive whole x
		 * @param x positive exponent and base
		 * 
		 * @return double value
		 */
		static double calculatePositiveX(double exp ,double base) {
			double result =1.0;
			double temp=1.0;

			temp =calculateValue(exp, base);
			if(temp >0)
			{
			
				result=calculateValue(temp, a);
			}
			
			else if(temp <0)
			{
				result = calculateNegativePower(temp, a);
			}
			return result;
			}
		
		/*For negative whole x
		 * @param x negative exponent and base
		 * 
		 * @return double value
		 */
		static double calculateNegativeX(double exp ,double base)
		{
			double result =1.0;
			double temp=1.0;

			temp=calculateNegativePower(exp, base);
			
			if(temp>0){
			result =calculateValue(temp, a);
			}
			
			else if(temp <0){
			result = calculateNegativePower(temp, a);
			}
			return result;
		}
		
		
		
		/*To get fraction value from user
		 * 
		 * 
		 * @return double value
		 */
		public double calculateFractionalPowers() {
	
		double result =0.0;
		Scanner scan=new Scanner(System.in);
		Pattern whitespace=scan.delimiter();       
        scan.useDelimiter("/");                            // set delimiter as /
        
        int numer = scan.nextInt();                            // read numerator
        String test = scan.findWithinHorizon(".",0);       // read the /
        scan.useDelimiter(whitespace);                     // reset delimter to whitespace
        int denom = scan.nextInt();                            // read the denominator
        String values=help.reduceFraction(numer, denom);
        String valArr[] = values.split(" ");
        numer=Integer.parseInt(valArr[0]);
       denom=Integer.parseInt(valArr[1]);
       
       if(numer <0 || denom <0)
       {
    	   result =calcNegFraction(numer, denom);
       }
       else {
       result = calcFraction(numer, denom);
       }
			return result;
        
       }
		
		
	
		//Convert Decimal to Fraction
		static int roundNumbertoNearestDec(double num)
		{
			 double data =num *100;
			 int numerator= (int) data;
			 System.out.println(numerator);
			 return numerator;
		}
		
		
		/*To calculate when x is a decimal value
		 * 
		 * @param decimal converted to numerator and denominator
		 * @return double value
		 */
		
		static double calculateForDecimal(int numerator, int denominator)
		{
			
			double result=0.0;
			double root=0.0;
			double temp=calculateValue(numerator, b);
			// calculate b^x
			if(temp >0) {
			 root=help.nthRoot(denominator,temp);
	        
	        
			}
			else
			{
				temp =help.abs(temp);
				root=help.nthRoot(denominator,temp);
			     root=root *-1;
			}
			
			//calculate a^exp
	        if(root>0 && root == (int)root) {
				result =calculateValue(root, a);
				}
				
				else if(root <0 && root==(int)root){
				result = calculateNegativePower(root, a);
				}
	        
	        else if(root >0 && root != (int)root) {
	        	int num =roundNumbertoNearestDec(root);
				String values=help.reduceFraction(num, 100);
				String valArr[] = values.split(" ");
				numerator=Integer.parseInt(valArr[0]);
				denominator=Integer.parseInt(valArr[1]);
				
					
				double temp1= calculateValue(numerator, a);
					 
				if(temp1 >0) {
					result=help.nthRoot(denominator,temp);
				 }
				else{
					temp1 =help.abs(temp);
					result=help.nthRoot(denominator,temp);
					result=result *-1;
					}
					 
			}
	        
	        else if(root <0 && root != (int)root) {
	        	int num =roundNumbertoNearestDec(root*-1);
	        	String values=help.reduceFraction(num, 100);
	        	String valArr[] = values.split(" ");
				numerator=Integer.parseInt(valArr[0]);
				denominator=Integer.parseInt(valArr[1]);
				
				double temp1= calculateValue(numerator, a);
				 
				if(temp1 >0) {
					result=help.nthRoot(denominator,temp1);
					result= 1/result;
				 }
				else{
					temp1 =help.abs(temp1);
					result=help.nthRoot(denominator,temp1);
					result=result *-1;
					result=1/result;
					}
	        	
	        }
	        
	        
			System.out.println(result);
				return result;
		
		}
	
		
		public double calcDecValues(double x) {
			int numerator= roundNumbertoNearestDec(x);
			int denominator =100;
			
			String values=help.reduceFraction(numerator, denominator);
		    String valArr[] = values.split(" ");
		    numerator=Integer.parseInt(valArr[0]);
		    denominator=Integer.parseInt(valArr[1]);
		    
		 return calculateForDecimal(numerator, denominator);
		    
		}
		
		/*To calculate when x is a positive  fractional value
		 * 
		 * @param  converted to numerator and denominator
		 * @return double value
		 */
		public double calcFraction(int numer, int denom) {
			double result=0.0;
			 if(numer >0) {
			        double temp=calculateValue(numer, b);
			        double root=help.nthRoot(denom,temp);
			       
			        if(root>0 && root == (int) root){
						result =calculateValue(root, a);
						}
						
						else if(root <0 && root ==(int) root){
						result = calculateNegativePower(root, a);
						}
			        
						else if(root >0 && root != (int) root)
						{
							int num =roundNumbertoNearestDec(root);
							String values1=help.reduceFraction(num, 100);
							String valArr1[] = values1.split(" ");
							int numerator1=Integer.parseInt(valArr1[0]);
							int denominator1=Integer.parseInt(valArr1[1]);
						
							double temp1= calculateValue(numerator1, a);
							
							if(temp1 >0) {
								result=help.nthRoot(denominator1,temp1);
							 }
							else{
								temp1 =help.abs(temp1);
								result=help.nthRoot(denominator1,temp1);
								result=result *-1;
								}
						}
			        
						else if(root <0 && root != (int) root) {
							int num =roundNumbertoNearestDec(root);
							String values1=help.reduceFraction(num, 100);
							String valArr1[] = values1.split(" ");
							int numerator1=Integer.parseInt(valArr1[0]);
							int denominator1=Integer.parseInt(valArr1[1]);
						
							double temp1= calculateValue(numerator1, a);
						
							if(temp1 >0) {
								result=help.nthRoot(denominator1,temp1);
								result=1/result;
							 }
							else{
								temp1 =help.abs(temp1);
								result=help.nthRoot(denominator1,temp1);
								result=result *-1;
								result=1/result;
								}
						}
			       }
			      
						return result;
		}
		
		/*To calculate when x is a negative  fractional value
		 * 
		 * @param  converted to numerator and denominator
		 * @return double value
		 */
		public double calcNegFraction(int numer, int denom)
		{
			double result=0.0;
			
			numer =(int)help.abs(numer);
			denom =(int)help.abs(denom);
			 double root=0.0;
			 double temp=calculateValue(numer, b);
			
			 if(temp >0) {root=help.nthRoot(denom ,temp);
			 }
			 if(temp <0) {
				  root=help.nthRoot(denom ,(int)help.abs(temp));
			 }
	           root=1/root;
	          
	           if(root>0 && root%1 == 0){
	   			result =calculateValue(root, a);
	   			}
	   			
	   			else if(root <0 && root %-1== 0){
	   			
	   			result = calculateNegativePower(root, a);
	   			}
	           
	   			else if(root >0 && root%1 != 0)
	   			{
	   				
	   				int num =roundNumbertoNearestDec(root);
	   				String values1=help.reduceFraction(num, 100);
	   				String valArr1[] = values1.split(" ");
	   				int numerator1=Integer.parseInt(valArr1[0]);
	   				int denominator1=Integer.parseInt(valArr1[1]);
	   			
	   				double temp1= calculateValue(numerator1, a);
	   				
	   				if(temp1 >0) {
	   					
	   					result=help.nthRoot(denominator1,temp1);
	   					
	   				 }
	   				else{
	   					temp1 =help.abs(temp1);
	   					result=help.nthRoot(denominator1,temp1);
	   					result=result *-1;
	   					}
	   			}
	           
	   			else if(root <0 && root %-1 !=0) {
	   				int num =roundNumbertoNearestDec(root);
	   				String values1=help.reduceFraction(num, 100);
	   				String valArr1[] = values1.split(" ");
	   				int numerator1=Integer.parseInt(valArr1[0]);
	   				int denominator1=Integer.parseInt(valArr1[1]);
	   			
	   				double temp1= calculateValue(numerator1, a);
	   				
	   				if(temp1 >0) {
	   					result=help.nthRoot(denominator1,temp1);
	   					result=1/result;
	   				 }
	   				else{
	   					temp1 =help.abs(temp1);
	   					result=help.nthRoot(denominator1,temp1);
	   					result=result *-1;
	   					result=1/result;
	   					}
	   			}
	          
	          return result;
		}
		
		/*To calculate when x is a negative  decimal value
		 * 
		 * @param  negative irrational x
		 * @return double value
		 */
		public double calculateNegDecimal(double x)
		{
			double result=0.0;
			int num =roundNumbertoNearestDec(x);
				String values1=help.reduceFraction(num, 100);
				String valArr1[] = values1.split(" ");
				int numerator1=Integer.parseInt(valArr1[0]);
				int denominator1=Integer.parseInt(valArr1[1]);
				result=calcNegFraction(numerator1, denominator1);
			return result;
		}

}
