String valueAsString = "42.42";
double value = Double.valueOf(valueAsString);
System.out.println(value);

// Double.valueOf converte uma string em um double.

// Com números inteiros precisa da conversão 

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a value ");
        double value = Double.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value);
    }
}
