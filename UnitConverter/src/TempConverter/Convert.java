/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempConverter;

import java.util.Scanner;

/**
 *
 * @author IGWE TONY
 */
public class Convert implements ICtoF {

    public double Celsius;
    public double  Farenheit;
    public String Val;
    public void Apply(){
        Scanner input = new Scanner(System.in);
        System.out.println("What Conversion do you want to perform");
        System.out.println("Enter C to perform conversion from Celsius to Farenheit");
        System.out.println("Enter F to perform conversion from Farenheit to Celsius");
        Val = input.next();
        if("C".equals(Val) || "c".equals(Val)){
            System.out.println("Enter the celsius value");
            double c_val = input.nextDouble();
            CelsiusToFarenheit(c_val);
        }
        else if("F".equals(Val) || "f".equals(Val)){
            System.out.println("Enter the farenheit value");
            double f_val = input.nextDouble();
            FarenheitToCelsius(f_val);
        }
        else
        {
            System.err.println("Please enter an appropriate value");
        }
    }
    @Override
    public double CelsiusToFarenheit(double Celsius) {
        this .Farenheit = (Celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + this.Farenheit);
        return Celsius;
    }

    @Override
    public double FarenheitToCelsius(double Farenheit) {
        this.Celsius = (Farenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius:  " + this.Celsius);
        return Farenheit;
    }
    
}
