/* O comando reader.nextLine(); lê o imput do usuário e retorna a string.

Se quiser usar a string no programa, ela deve ser salva como uma string variável.

String message = scanner.nextLine();

O valor salvo na variável pode ser usado repetitivamente. */

import java.util.Scanner;
public class Program {
	publi static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("write a message: ");
		String message =  scanner.nextLine();
		
		System.out.println(message);
		
		System.out.println(message);
	}
}
