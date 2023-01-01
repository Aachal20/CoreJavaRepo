package in.demo.fundamentalClasses;
//program to show shallow cloning

import java.io.*;


class GFG1 {

 
 public static void main(String[] args)
 {
     // t1 and t2 objects are used to
     // illustrate shallow copy

     // t1 is first object created in heap memory
     GFG t1 = new GFG();

     // Creating only one object(t1) and
     // both objects (t1,t2) are pointing to only one
     // object
     GFG t2 = t1;

   // Display message
     // return true if reference is same that is shallow copy
     // false if different
     // Should be returning - true
     System.out.print(
             "Output: False if Deepcopy & True if shallow : ");
             System.out.println(t1 == t2);
 }
}