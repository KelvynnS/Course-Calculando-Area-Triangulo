package com.kelv.test;

import java.util.Locale;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
      
      triangle x, y;
      x = new triangle();
      y = new triangle();
      
      System.out.println("Entre com a medida do triangulo X: ");
      x.a = sc.nextDouble();
      x.b = sc.nextDouble();
      x.c = sc.nextDouble();
      System.out.println("Entre com a medida do triangulo Y: ");
      y.a = sc.nextDouble();
      y.b = sc.nextDouble();
      y.c = sc.nextDouble();

      double areaX = x.area();
      double areaY = y.area();

     System.out.printf("Area do triangulo X: %.4f%n", areaX);
     System.out.printf("Area do triangulo Y: %.4f%n", areaY);

     if (areaX > areaY){
        System.out.println("A maior area : X");
     }
     else {
        System.out.println("A maior area : Y");
     } 
     
      sc.close();
    }
}
