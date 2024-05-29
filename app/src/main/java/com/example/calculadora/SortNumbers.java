package com.example.calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("Enter numbers (type fin to finish):");
    while (true) {
      if (scanner.hasNextInt()) {
        int num = scanner.nextInt();
        if (num == 4) {
          System.out.println("Number 4 is not allowed.");
        } else {
          numbers.add(num);
        }
      } else {
        scanner.next(); // Consume the non-integer input
        break;
      }
    }

    System.out.println("Sort the numbers in ascending (1) or descending (2) order?");
    int opcion = scanner.nextInt();

    if (opcion == 1) {
      Collections.sort(numbers);
    } else if (opcion == 2) {
      Collections.sort(numbers, Collections.reverseOrder());
    } else {
      System.out.println("Invalid option. The numbers will not be ordered.");
    }

    System.out.println("Sortered list of numbers:");
    for (int number : numbers) {
      System.out.print(number + " ");
    }

    scanner.close();
  }
}
