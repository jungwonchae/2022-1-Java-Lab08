package edu.handong.csee.java.hw2.math;
/** This is the MathCalculator class
Depending on user's input, it calculates each function
*/
public class MathCalculator {
	private String name;
	/**This brings the name that the user inserted
	    */
	public void setName(String name) {
        this.name = name;
    }
	/**This gets the name and returns it
	    */
	public String getName(){
        return name;
    }
	/**This calculates Max number(Bigger number) for two parameters
	    */
	public int getMax(int a, int b){
        int max  = 0;

        if(a>b){
            max = a;
            return a;
        }

        if(a<b){
            max = b;
            return b;
        }
        return a;    
    }
	/**This calculates Min number(Smaller number) for two parameters
	    */
	public int getMin(int a, int b){
        int min  =0;

        if(a>b){
            min = b;
            return b;
        }

        if(a<b){
            min = a;
            return a;
        }
        return a;    
    }
	/**This calculates Absoluate value
	    */
	public int getAbs(int a){
        if(a<0) return -a;
        return a;
    }
	/**This calculates Sum of two parameters
	    */
	public int getSum(int a, int b){
        int sum  =0;

        sum = a+b;

        return sum;
    }
	/**This calculates the difference in between two parameters
	    */
	public int getDiff(int a, int b){
        int diff = a-b;
        return diff;
    }
	/**This calculates product of two parameters
	    */
	public int getProduct(int a, int b){
        int product  =0;

        product = a*b;

        return product;
    }
	/**This calculates quotient of two parameters
	    */
	public int getQuotient(int a, int b){

        int quotient = a/b;
        return quotient;
    }
	/**This calculates remainder of two parameters
	    */
	public int getRemainder(int a, int b){

        int remainder = a % b;

        return remainder;
    }
	/**This calculates a(first parameter) power of b(second parameter)
	    */
	public int getPower(int a, int b){
        int power =1;
        while(b != 0){
            power = power * a;
            b--;
        }
        return power;
    }
	/**This calculates factorial of the parameter
	    */
	public int getFactorial(int a){
        if(a==0) return 1;
        else return (a * getFactorial(a-1));
    }
	/**This calculates Greatest Common Divisor between two parameters
	    */
	public int getGcd(int a, int b){
        int temp,gcd;

        while(b!=0){
            temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a;
        return gcd;
    }
	/**This calculates Least Common Multiple between two parameters
	    */
	public int getLcm(int a, int b){
        return a*( b / getGcd(a,b));
    }
	/**This calculates the square of the parameter
	    */
	public int getSquare(int a){
        int square = a*a;

        return square;
    }
	
	
	
}
