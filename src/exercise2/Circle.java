package exercise2;

import java.util.Scanner;

public class Circle  {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double r = Double.parseDouble(scanner.nextLine());
    double c = 2 * r * Math.PI;
    double a = r*r * Math.PI;
    System.out.println("Circumference: " + c);
    System.out.println("Area: " + a);

    }

}