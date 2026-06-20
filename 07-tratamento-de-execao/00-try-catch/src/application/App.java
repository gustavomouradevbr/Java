package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    try {
    String[] vect = sc.nextLine().split(" ");
    int position = sc.nextInt();
    System.out.println(vect[position]);

    }
    catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("invalido");


    } 
    catch (InputMismatchException e) {
              System.out.println("input");


    }
        System.out.println("fim");




    sc.close();
  }
}