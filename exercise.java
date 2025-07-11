// Crie um programa que peça ao usuário quantos dias ele deseja trnasformar em segundos:

import java.util.Scanner;
public class SecondsInADay {

    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
        // write your program here
      System.out.println("How many days would you like to convert to seconds?");
      int value = Integer.valueOf(scanner.nextLine());
      System.out.print(value * 86400);

    }
}

