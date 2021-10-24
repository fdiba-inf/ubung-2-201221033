package exercise2;

import java.util.Scanner;

public class DayOfWeek {

  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int n = Integer.parseInt(scanner.nextLine());
    if (n < 8 && n > 0 ) {
        if (n == 1) {
            System.out.println("Day of week: Monday");
        } else if (n == 2) {
            System.out.println("Day of week: Tuesday");
        } else if (n == 3) {
            System.out.println("Day of week: Wednesday");
        } else if (n == 4) {
            System.out.println("Day of week: Thursday");
        } else if (n == 5) {
            System.out.println("Day of week: Friday");
        } else if (n == 6) {
            System.out.println("Day of week: Saturday");
        } else if (n == 7) {
            System.out.println("Day of week: Sunday");
        }
    } else {
        System.out.println("Invalid day");
    }
    


   }

}
