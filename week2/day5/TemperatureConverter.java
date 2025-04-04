package extras;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            double celsius = convertToCelsius(temperature);
            System.out.println("Temperature in Celsius: " + celsius);
        } else if (choice == 'F') {
            double fahrenheit = convertToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
