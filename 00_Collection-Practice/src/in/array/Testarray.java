package in.array;
class Testarray{  
}
	/*	public static void main(String args[]){  
		int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array   1<5
			System.out.println(a[i]);  //0       //10 20
	}
	}  */



	/*
		public static void main(String args[]){  
		int a[]={33,3,4,5};//declaration, instantiation and initialization  
		//printing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
		}
		}  
	 */

	/*	//for-each loop
		public static void main(String args[]){  
		int arr[]={33,3,4,5};  
		//printing array using for-each loop  
		for(int i : arr)  
		System.out.println(i);  
		}
		}  
	 */


	/*//Java Program to return an array from the method  
	//creating method which returns an array  
	static int[] get(){  
		return new int[]{10,30,50,90,60};  
	}  

	public static void main(String args[]){  
		//calling method which returns an array  
		int arr[]=get();  
		//printing the values of an array  
		for(int i=0;i<arr.length;i++)  
			System.out.println(arr[i]);  
	}
}  */


	/*//Java Program to demonstrate the case of   
	//ArrayIndexOutOfBoundsException in a Java Array.  

	public static void main(String args[]){  
		int arr[]={50,60,70,80};   //0 1 2 3
		for(int i=0;i<=arr.length;i++){     //4        //0<4 //1<4  // 2<4  //3<4    //4<=4
			System.out.println(arr[i]);                 //50        60         70        80 
		}  
	}
}  
*/

