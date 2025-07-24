int first = 2;
System.out.println(first);
int second = 4;
System.out.println(second);

int sum = first + second;
System.out.println(sum);


// Podemos mudar a ordem das operações utilizando (). Operações com () são realizadas antes daquelas fora deles.

int calculationWithParentheses = (1+1) + 3 * (2+5);
System.out.println(calculationWithParentheses); // prints 23

int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
System.out.println(calculationWithoutParentheses); // prints 13

//
int first = 2;
int second = 4;

System.out.println(first + second); // prints 6
System.out.println(2 + second - first - second); // prints 0
//

int first = 2;
int second = 4;

// the expression below does not even work, since
// the result is not assigned to any variable
// or given as a parameter to a print statement
first + second;

//
int age = 32;
int height = 178;
height = age + 10;

System.out.println(age); // print 32 -> Pois o valor de age não muda, o que muda é o valor de height que passa a valer 42.
