package com.soft2techno.NonStatic;

public class Examplee{
	int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		
       Examplee e1 = new Examplee();
       Examplee e2 = new Examplee();
       
       System.out.println(e1.x+ "  " +e1.y);      //10     20
       System.out.println(e2.x+ "  " +e2.y);     //10     20
       
       e2.x = 50;
       e2.y= 60;
       
       System.out.println(e1.x+ "  " +e1.y);      //10   20
       System.out.println(e2.x+ "  " +e2.y);      //50  60
       
       System.out.println(e1);
       System.out.println(e1);
       System.out.println(e2);
       
 
	}

}
