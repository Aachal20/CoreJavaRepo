//153/10 --> 15
////153/10 --> 1
//153 % 10 ----> 3

package in.demo.varargs;
import java.util.Scanner;  
import java.lang.Math;  
public class ArmstsrongNumber 
{  
	//function to check if the number is Armstrong or not  
	static boolean isArmstrong(int n)   
	{   
		int temp, digits=0, last=0, sum=0;   
		//assigning n into a temp variable  
		temp=n;   
		//loop execute until the condition becomes false  
		while(temp>0)    
		{   
			temp = temp/10;     //15
			digits++;       //1
		}   
		temp = n;   
		while(temp>0)   
		{   
			//determines the last digit from the number      
			last = temp % 10;   //3  
			//calculates the power of a number up to digit times and add the resultant to the sum variable  
			sum +=  (Math.pow(last, digits));   
			//removes the last digit   
			temp = temp/10;   
		}  
		//compares the sum with n  
		if(n==sum)   
			//returns if sum and n are equal  
			return true;      
		//returns false if sum and n are not equal  
		else return false;   
	}   
	//driver code  
	public static void  main(String args[])     
	{     
		int num;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reads the limit from the user  
		num=sc.nextInt();  
		if(isArmstrong(num))  
		{  
			System.out.print("It is a Armstrong ");  
		}  
		else   
		{  
			System.out.print("It is Not a Armstrong ");  
		}  
	}   
}  



//152
//1  ---> 1*1*1 +
//5 ---> 5*5*5  +
//3 ---> 3*3*3  +

//It is not amrmstrong number