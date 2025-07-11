/* Para converter uma string em um valor booleano deve-se usar Boolean.valueOf().

Booleano aceita valor true e false, qualquer outro valor que não seja true torna a variável falsa. */

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a boolean ");
		boolean value = Boolean.valueOf(scanner.nextLine());
		System.out.println("You wrote " + value);
