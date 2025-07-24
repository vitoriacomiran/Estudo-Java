String valueAsString = “42”;

int value = Integer.valueOf(valueAsString);

System.out.println(value)

// Integer.valueOf converte uma string em uma int.

// Quando utilizado um objeto scanner a leitura do valor é inserida diretamente dentro do tipo convertido. 

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a value ");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value);
    }
}
