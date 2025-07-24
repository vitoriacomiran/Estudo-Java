//introduce the scanner tool used for reading user input
import java.until.Scanner;

public class Program {
		public static void main(String[] args) {
	// create a tool for reading user input and name it scanner
		Scanner scanner = new Scanner(System.in);
	
	//print "write a message: ");
		System.out.println("write a message: ");
	
	//read the string written by the user, and assign it
	//to program memory "string message = (string that was given as input)"
		String message = scanner.nextLine();
	
	//print the message written by the user
		System.out.println(message);
	}
}

/* Nesse caso o sistema pede:

Write a message:

‘o usuário escreve’

O sistema repete na tela o que foi escrito

Input é lido com a ferramenta scanner nextLine().

scanner.nextLine() está esperando que o usuário escreva algo.

Ao escrever e dar enter, a string é marcada como uma string variable. O programa fica disponível para referenciar a variável mensagem. */
