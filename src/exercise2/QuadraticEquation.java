package exercise2;

import java.util.Scanner;

public class QuadraticEquation  {

  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = 0;
    double x = 0;
    double y = 0;
    if (a != 0) {
        d = b * b - 4 * a * c;
        if (d >= 0) {
            d = Math.sqrt(d);
            x = (-b + d) / (2 * a);
            y = (-b - d) / (2 * a);
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println("Imaginary values");
        }
    } else if (b != 0) {
        x = -b / (2 * a);
        System.out.println(x);
    } else if (c != 0) {
        System.out.println("No values");
    } else {
        System.out.println("Many values");
    }
  }
}