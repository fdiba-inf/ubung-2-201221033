package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());
    if (num % 2 == 0) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }


  }
}