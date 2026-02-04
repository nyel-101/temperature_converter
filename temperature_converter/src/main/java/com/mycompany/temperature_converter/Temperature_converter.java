/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperature_converter;

/**
 *
 * @author Nullroot 13
 */

import java.util.Scanner;

public class Temperature_converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperture:   ");
        temp = sc.nextDouble();

        System.out.println("Convert to celius or fahrenheit ? (c or f):  ");
        unit = sc.next().toUpperCase();

        // condition ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f0%s", newTemp , unit);

        sc.close();

    }
}
