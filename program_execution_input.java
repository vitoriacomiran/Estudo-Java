/* Quando a execução do programa chega a uma instrução que tenta ler o input do usuário (comando nextLine())
a execução para e espera até o usuário escrever algum input e dar enter.*/

import java.util.Sanner;
public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write the first string");
		String first = scanner.nextLine();
		System.out.println("Write the second string");
		String second = scanner.nextLine();
		System.out.println("Write the third string");
		String second = scanner.nextLine();

		System.out.println("You wrote");
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}
}

/* O input do usuário é salvo em diferentes strings variáveis. 
  Pode ser feitas quantas vezes forem necessárias, contanto que elas tenham diferentes nomes (first, second, third). */

import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Write the first string: ");
		String first = reader.nextLine();
		System.out.println("Write the second string: ");
		String second = reader.nextLine();
		System.out.println("Write the third string: ");
		String third = reader.nextLine();

		System.out.println("Last string you wrote was " third + ", which ");
		Sytem.out.println("was preceded by " + second +".");
		Sytem.out.println("The first string war " + first +".");

