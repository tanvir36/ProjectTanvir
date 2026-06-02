/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projecttanvir;

/**
 *
 * @author tanvi
 */
import java.util.Scanner;
public class ProjectTanvir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

//        System.out.println("=== Simple Calculator ===");
        System.out.println("==================================");
        System.out.println("      WELCOME TO CALCULATOR       ");
        System.out.println("==================================");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        double result = 0;

        switch (choice) {

            case 1:
                result = calc.add(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 2:
                result = calc.subtract(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 3:
                result = calc.multiply(num1, num2);
                System.out.println("Result = " + result);
                break;

            case 4:
                result = calc.divide(num1, num2);
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}
