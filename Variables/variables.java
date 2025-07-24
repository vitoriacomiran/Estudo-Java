String text = "contains text";
int wholeNumber = 123;
double floatingPoint = 3.141592653;
boolean trueOrFalse = true;

System.out.println("Text variable: " + text);
System.out.println("Integer variable: " + wholeNumber);
System.out.println("Floating-point variable: " + floatingPoint);
System.out.println("Boolean: " + trueOrFalse);

/* Nomes de variáveis são únicos, não pode existir duas variáveis com o mesmo nome.

A variável existe desde o momento da sua declaração, o valor é preservado até que um novo valor seja atribuído à variável.*/

int number = 123;
System.out.println("The value of the variable is " + number);

number = 42;
System.out.println("The value of the variable is " + number);

/* Um valor boleano não pode ser declarado à uma variável inteira, ou ao contrário.

No entanto, um valor inteiro pode ser declarado à uma variável double (com decimal).

O contrário não pode ocorrer. Ou seja, um valor double virar inteiro.*/

double floatingPoint = 0.42;
floatingPoint = 1; // Works

int value = 10;
floatingPoint = value; // Also works
