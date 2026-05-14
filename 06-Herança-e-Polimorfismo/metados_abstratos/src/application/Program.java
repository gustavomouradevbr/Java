package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Shape> list = new ArrayList<>();

    System.out.println("Enter the number of shapes: ");
    int n = sc.nextInt();
 
    for (int i=1; i<= n; i++) {
      System.out.println("Shape #" + i + " data: ");

      System.out.print("Rectangle or Circle? r/c");
      char ch = sc.next().charAt(0);

      System.out.print("Color (BLACK/BLUE/RED): ");
      Color color = Color.valueOf(sc.next());
      Shape shape;

      if (ch == 'r') {
        System.out.print("Width: ");
        double width = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        shape = new Rectangle(color, width, height);
      } 
      else {
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        shape = new Circle(color, radius);
      }

      list.add(shape);

    System.out.println();
    System.out.println("Shape areas:");
    for (Shape shapeItem : list) {
      System.out.println(shapeItem.area());
    }


      

    }







    sc.close();
  }

}
