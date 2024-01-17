/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeightConverter;

import java.util.Scanner;

/**
 *
 * @author IGWE TONY
 */
public class Con implements ICon {

    Scanner input = new Scanner(System.in);
    int hold;
    double holder;
    String Choice;
    double val;

    public void ApplyWeight() {
        System.out.println("What weight Conversion do you want to perform");
        Choice = input.nextLine();

        if ("kilograms to pounds".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Kg value");
            holder = input.nextDouble();
            KiloToPounds(holder);
        } else if ("pounds to kilograms".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Pounds value");
            holder = input.nextDouble();
            PoundsToKilo(holder);
        } else if ("kilograms to Grams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Kg value");
            holder = input.nextDouble();
            KiloToGrams(holder);
        }
        else if ("kilograms to Milligrams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Kg value");
            holder = input.nextDouble();
            KiloToMilliGrams(holder);
        }
        else if ("kilograms to Tons".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Kg value");
            holder = input.nextDouble();
            KiloToTons(holder);
        }
        else if ("kilograms to Ounce".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Kg value");
            holder = input.nextDouble();
            KiloToOunce(holder);
        }
        else if ("pounds to Grams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Pounds value");
            holder = input.nextDouble();
            PoundsToGrams(holder);
        }
         else if ("pounds to Milligrams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Pounds value");
            holder = input.nextDouble();
            PoundsToMilliGrams(holder);
        }
         else if ("pounds to Ounce".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Pounds value");
            holder = input.nextDouble();
            PoundsToOunce(holder);
        }
         else if ("pounds to Tons".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Pounds value");
            holder = input.nextDouble();
            PoundsToTons(holder);
        }
         else if ("Grams to Kilograms".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Gram value");
            holder = input.nextDouble();
            GramsToKilo(holder);
        }
        else if ("Grams to Pounds".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Gram value");
            holder = input.nextDouble();
            GramsToPounds(holder);
        }
        else if ("Grams to Ounce".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Gram value");
            holder = input.nextDouble();
            GramsToOunce(holder);
        }
        else if ("Grams to Milligrams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Gram value");
            holder = input.nextDouble();
            GramsToMilliGrams(holder);
        }
        else if ("Grams to Tons".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Gram value");
            holder = input.nextDouble();
            GramsToTons(holder);
        }
        else if ("ounce to Kilograms".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Ounce value");
            holder = input.nextDouble();
            OunceToKilo(holder);
        }
         else if ("ounce to Pounds".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Ounce value");
            holder = input.nextDouble();
            OunceToPounds(holder);
        }
         else if ("ounce to Grams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Ounce value");
            holder = input.nextDouble();
            OunceToGrams(holder);
        }
         else if ("ounce to milligrams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Kg value");
            holder = input.nextDouble();
            OunceToMilligrams(holder);
        }
         else if ("ounce to Tons".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Ounce value");
            holder = input.nextDouble();
            OunceToTons(holder);
        }
         else if ("Milligrams to Kilograms".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Milligram value");
            holder = input.nextDouble();
            MilligramsToKilo(holder);
        }
         else if ("Milligrams to Pounds".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Kg value");
            holder = input.nextDouble();
            MilligramsToPounds(holder);
        }
         else if ("Milligrams to Grams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Milligram value");
            holder = input.nextDouble();
            MilligramsToGrams(holder);
        }
         else if ("Milligrams to ounce".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Milligram value");
            holder = input.nextDouble();
            MilligramsToOunce(holder);
        }
         else if ("Milligrams to Tons".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Milligram value");
            holder = input.nextDouble();
            KiloToGrams(holder);
        }
         else if ("Tons to Kilograms".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Kg value");
            holder = input.nextDouble();
            MilligramsToTons(holder);
        }
         else if ("Tons to Kilograms".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Ton value");
            holder = input.nextDouble();
            TonsToKilo(holder);
        }
         else if ("Tons to Pounds".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Ton value");
            holder = input.nextDouble();
            TonsToPounds(holder);
        }
         else if ("Tons to Grams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Ton value");
            holder = input.nextDouble();
            TonsToGrams(holder);
        }
         else if ("Tons to Ounce".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Ton value");
            holder = input.nextDouble();
            TonsToOunce(holder);
        }
         else if ("Tons to milligrams".equalsIgnoreCase(Choice)) {
            System.out.println("Enter the Ton value");
            holder = input.nextDouble();
            TonsToMilligrams(holder);
        }
    }

    @Override
    public double KiloToPounds(double g) {
        val = g * 2.20462;
        System.out.println(val);
        return val;
    }

    @Override
    public double PoundsToKilo(double g) {
        val = g / 2.20462;
        System.out.println(val);
        return val;
    }

    @Override
    public double KiloToOunce(double g) {
        val = g * 35.274;
        System.out.println(val);
        return val;
    }

    @Override
    public double KiloToGrams(double g) {
        val = g * 1000;
        System.out.println(val);
        return val;
    }

    @Override
    public double KiloToTons(double g) {
        val = g / 1000;
        System.out.println(val);
        return val;
    }

    @Override
    public double KiloToMilliGrams(double g) {
         val = g * 1000000;
        System.out.println(val);
        return val;
    }

    @Override
    public double PoundsToOunce(double g) {
        val = g * 16;
        System.out.println(val);
        return val;
    }

    @Override
    public double PoundsToGrams(double g) {
         val = g * 453.592;
        System.out.println(val);
        return val;
    }

    @Override
    public double PoundsToTons(double g) {
        val = g / 2204.62;
        System.out.println(val);
        return val;
    }

    @Override
    public double PoundsToMilliGrams(double g) {
         val = g * 453592;
        System.out.println(val);
        return val;
    }

    @Override
    public double GramsToKilo(double g) {
         val = g / 1000;
        System.out.println(val);
        return val;
    }

    @Override
    public double GramsToPounds(double g) {
          val = g / 453.592;
        System.out.println(val);
        return val;
    }

    @Override
    public double GramsToOunce(double g) {
         val = g / 28.3495;
        System.out.println(val);
        return val;
    }

    @Override
    public double GramsToTons(double g) {
          val = g / 1000000;
        System.out.println(val);
        return val;
    }

    @Override
    public double GramsToMilliGrams(double g) {
        val = g * 1000;
        System.out.println(val);
        return val;
    }

    @Override
    public double OunceToKilo(double g) {
         val = g * 35.274;
        System.out.println(val);
        return val;
    }

    @Override
    public double OunceToPounds(double g) {
        val = g / 16;
        System.out.println(val);
        return val;
    }

    @Override
    public double OunceToGrams(double g) {
            val = g * 28.3495;
        System.out.println(val);
        return val;
    }

    @Override
    public double OunceToTons(double g) {
        val = g / 35274;
        System.out.println(val);
        return val;
    }

    @Override
    public double OunceToMilligrams(double g) {
         val = g * 28349.5;
        System.out.println(val);
        return val;
    }

    @Override
    public double TonsToKilo(double g) {
          val = g * 1000;
        System.out.println(val);
        return val;
    }

    @Override
    public double TonsToPounds(double g) {
        val = g * 2204.62;
        System.out.println(val);
        return val;
    }

    @Override
    public double TonsToGrams(double g) {
        val = g * 1000000;
        System.out.println(val);
        return val;
    }

    @Override
    public double TonsToOunce(double g) {
        val = g * 35274;
        System.out.println(val);
        return val;
    }

    @Override
    public double TonsToMilligrams(double g) {
        val = g * 1000000000 ;
        System.out.println(val);
        return val;
    }

    @Override
    public double MilligramsToKilo(double g) {
          val = g / 1000000;
        System.out.println(val);
        return val;
    }

    @Override
    public double MilligramsToPounds(double g) {
        val = g / 453592;
        System.out.println(val);
        return val;
    }

    @Override
    public double MilligramsToOunce(double g) {
          val = g / 28349.5;
        System.out.println(val);
        return val;
    }

    @Override
    public double MilligramsToGrams(double g) {
        val = g / 1000;
        System.out.println(val);
        return val;
    }

    @Override
    public double MilligramsToTons(double g) {
        val = g / 1000000000 ;
        System.out.println(val);
        return val;
    }

}
