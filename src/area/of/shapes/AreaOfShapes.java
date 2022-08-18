/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.shapes;

import java.util.Scanner;

/**
 *
 * @author LAURA
 */
public class AreaOfShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    String name;
    int ch;
    double area;
    Scanner sonia= new Scanner(System.in);
    
    System.out.println("Hello.... Which area do you want to calculate? Choose on the list below!!! ");
    System.out.println("List of Shapes");
    System.out.println("************************************************");
    System.out.println("1:Area of Right-angled triangle");
    System.out.println("2:Area of Equilateral triangle");
    System.out.println("3:Area of Square");
    System.out.println("4:Area of rectangle");
    System.out.println("5:Area of Circle");
    System.out.println("6:Area of Rhombus");
    System.out.println("7:Terminate Program");
   System.out.println("************************************************");
   
   
   while(true){
    System.out.println("What is your choice? ");
    ch=sonia.nextInt();
    
    if(ch==1) 
   { System.out.println("what is the size of the height?");
     int height;
     height= sonia.nextInt();
     System.out.println("what is the size of the breadth?");
     int breadth;
     breadth=sonia.nextInt();
    int ar=breadth*height/2;
      System.out.println("The area of a right-angled triangle is " +ar);
      
   }
    else if (ch==2)
   
    {
         System.out.println("what is the size of the side?");
         int side;
         side=sonia.nextInt();
      double AE=((Math.sqrt(3)/4)*(side*side));
      System.out.println("The area of the equilateral triangle is " +AE);
    }
      if(ch==3)
      { System.out.println("what is the length?");
      int length;
      length=sonia.nextInt();
      double AS=length*length;
      System.out.println("The area of the square is " +AS);
      }
      else if(ch==4)
      {
         System.out.println("what is the base");
        int base;
        base=sonia.nextInt();
        System.out.println("What is the height");
        int ht;
        ht=sonia.nextInt();
        double AR=base*ht;
        System.out.println("The area of the rctangle is " +AR);
      
      } 
      if(ch==5)
      {
          System.out.println("What is the radius");
          double radius;
          radius=sonia.nextInt();
          double AC=Math.PI*radius*radius;
          System.out.println("The area of the circle is " +AC);
      }
      else if(ch==6)
      {
          
          System.out.println("What is the size of d1?");
          int d1;
          d1=sonia.nextInt();
           System.out.println("What is the size of d2?");
           int d2;
           d2=sonia.nextInt();
           double Rhomb= (d1*d2)/0.5;
            System.out.println("The area of the circle is " +Rhomb);
            System.out.println("*****************************************");
      }
      else if(ch==7)
      {
          System.out.println("THANK YOU FOR USING OUR SYSTEM");
          System.out.println("==============================");
          System.out.println("GOOD BYE!!!");
          System.exit(0);
      }else
      {
          System.out.println("INVALID SELECTION");
      }          
      }
}
}
