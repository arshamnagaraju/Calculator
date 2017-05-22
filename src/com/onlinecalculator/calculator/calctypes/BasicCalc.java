package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

public class BasicCalc
{
	int a,b,c,res;
	
	public BasicCalc()
        {
		a=0;
		b=0;
		c=0;
		res=0;
		
	}
	
	public int menu()
        {
		System.out.println("1. for addition");
		System.out.println("2. for subtraction");
		System.out.println("3. for multiplication");
		System.out.println("4. for division");
		System.out.println("enter your choice");
		Scanner s = new Scanner(System.in);
		c=s.nextInt();
		return 0;
	}
	
    public void userInputs()
    
    
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter first number");
    	a=s.nextInt();
    	System.out.println("enter second number");
    	b=s.nextInt();
    	
    	
    }

    public void performOperation()
{
    	switch(c)
    	
    	{
    	case 1 : res=add();
    	System.out.println(res);
    	break;
    	case 2 : res=subtract();
    	System.out.println(res);
    	break;
    	case 3 : res=multiply();
    	System.out.println(res);
    	break;
    	case 4 : res=divide();
    	System.out.println(res);
    	break;
    	
    		
    	}
       
    }
    int add()
    

	{
	c=a+b;
			return c;
	
	}
	
	int subtract()
	{
	c=a-b;
	return c;
	
	}
	
	int multiply()
	{
	c=a*b;
	return c;
	
	}
	
	int divide()
	{
		c=a/b;
		return c;
		
	}
	
}
 class BasicCalc1
{
	public static void main(String args[])
	{
		BasicCalc c=new BasicCalc();
		c.userInputs();
		c.menu();
		
		c.performOperation();
	}
}