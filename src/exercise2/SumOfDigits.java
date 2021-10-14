package exercise2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int num1 = n % 10;
    int num3 = n / 10;
    int num4 = num3 / 10;
    int num5 = num3 % 10;
    int sum = num1 + num4 + num5;
    
  
    System.out.println(sum);

    }

}