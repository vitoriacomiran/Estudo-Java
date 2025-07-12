/* Else
Se o valor expresso dentro dos parênteses condicionais for falso, então a execução do código segue para a estrutura else. Uma opção alternativa. */

int number = 4;

if (number > 5) {
    System.out.println("Your number is greater than five!");
} else {
    System.out.println("Your number is five or less!");
}

/* Else if
No caso de múltiplos condicionais utiliza-se o else-if, é como um else mas com uma condição adicional. 
Else-if segue o condicional if, e pode ser múltiplas. */

int number = 3;

if (number == 1) {
    System.out.println("The number is one");
} else if (number == 2) {
    System.out.println("The given number is two");
} else if (number == 3) {
    System.out.println("The number must be three!");
} else {
    System.out.println("Something else!");
}

//

// Como a execução é feita de cima para baixo, quando ela chega em uma condição verdadeira, ela para.

int number = 5;

if (number == 0) {
    System.out.println("The number is zero.");
} else if (number > 0) {
    System.out.println("The number is greater than zero.");
} else if (number > 2) {
    System.out.println("The number is greater than two.");
} else {
    System.out.println("The number is less than zero.");
} // prints The number is greater than zero.
