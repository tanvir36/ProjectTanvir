/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecttanvir;

/**
 *
 * @author tanvi
 */
public class Calculator {

    // Addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public double divide(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }

        return num1 / num2;
    }
}
