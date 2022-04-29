package edu.handong.csee.java.hw2.math;

public class MathCalculator {
	private String name;
	
	public void setName(String name) {
        this.name = name;
    }
	
	public String getName(){
        return name;
    }
	
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
	
	public int getAbs(int a){
        if(a<0) return -a;
        return a;
    }
	
	public int getSum(int a, int b){
        int sum  =0;

        sum = a+b;

        return sum;
    }
	
	public int getDiff(int a, int b){
        int diff = a-b;
        return diff;
    }
	
	public int getProduct(int a, int b){
        int product  =0;

        product = a*b;

        return product;
    }
	
	public int getQuotient(int a, int b){

        int quotient = a/b;
        return quotient;
    }
	
	public int getRemainder(int a, int b){

        int remainder = a % b;

        return remainder;
    }
	
	public int getPower(int a, int b){
        int power =1;
        while(b != 0){
            power = power * a;
            b--;
        }
        return power;
    }
	
	public int getFactorial(int a){
        if(a==0) return 1;
        else return (a * getFactorial(a-1));
    }
	
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
	
	public int getLcm(int a, int b){
        return a*( b / getGcd(a,b));
    }
	
	public int getSquare(int a){
        int square = a*a;

        return square;
    }
	
	
	
}
