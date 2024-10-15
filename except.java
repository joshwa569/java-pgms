package joshwa;

import java.util.Scanner;

public class except{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
           
            System.out.println("Select an option:");
            System.out.println("1. Arithmetic Exception");
            System.out.println("2. Array Index Out of Bounds Exception");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                     
                        System.out.print("Enter the first number: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Enter the second number: ");
                        int num2 = scanner.nextInt();
                        int result = num1 / num2; 
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println(e);
                    }
                    break;

                case 2:
                    try {
                      
                        System.out.print("Enter the size of the array: ");
                        int size = scanner.nextInt();
                        int[] array = new int[size];

                        System.out.println("Enter array elements:");
                        for (int i = 0; i < size; i++) {
                            array[i] = scanner.nextInt();
                        }

                        System.out.print("Enter the position of the element you want to access: ");
                        int position = scanner.nextInt();
                        
                       
                        System.out.println("Element at position " + position + ": " + array[position - 1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.print("Do you want to continue? (y/n): ");
            continueChoice = scanner.next().charAt(0);
        } while (continueChoice == 'y' || continueChoice == 'Y');

        System.out.println("Program terminated.");
        scanner.close();
    }
}
