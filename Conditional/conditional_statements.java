/* Adicionar funções que acrescentem condições. Funções que de um jeito ou de outro dependam do estado das variáveis do programa.
  Adicionar o condicional statement. */

System.out.println("Hello, world!");
if (true) {
    System.out.println("This code is unavoidable!");
}

/* A condição inicia com o if seguido dos (). Os () são seguidos por um bloco {}. 
O comando inserido dentro dos {} é executado se a expressão dentro dos () for verdadeira. */
int number = 11;
if (number > 10) {
    System.out.println("The number was greater than 10");
}

//

import java.util.Scanner;
public class SpeedingTicket {
  public state void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give speed:");
    int value = Integer.valueOf(scanner.nextLine());
    if (value > 120) {
      System.out.println("Speending Ticket");

    }
  }
}

//

import java.util.Scanner;
public class CheckYourIndentation {
  public state void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give a number:");
    int first = Integer.valueOf(scanner.nextLine());
    System.out.println("Give a second number:");
    int second = Integer.valueOf(scanner.nextLine());
    if (first == second) {
      System.out.println("Same");
    } else if (first > second) {
      System.out.println("The first was larger than the second");
    } else {
      System.out.println("The second was larger than the first");

    }
  }
}



        

