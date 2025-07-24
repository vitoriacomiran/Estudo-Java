// Caso pelo menos um seja floating point, o resultado será um floating point.
double whenDividedIsFloat = 3.0 / 2;
System.out.printlm(whenDividedIsFloat); // print 1.5

// Um valor inteiro pode ser convertido em float adicionando uma conversão do tipo antes da operação.

int first = 3;
int second = 2;

double result1 = (double) first / second;
System.out.println(result1); // prints 1.5

double result2 = first / (double) second;
System.out.println(result2); // prints 1.5

double result3 = (double) (first / second);
System.out.println(result3); // prints 1.0
//

line 1: int first = (1 + 1);
line 2: int second = first + 3 * (2 + 5);
line 3:
line 4: first = 5;
line 5:
line 6: int third = first + second;
line 7: System.out.println(first);
line 8: System.out.println(second);
line 9: System.out.println(third);

/* The execution flow of the program above has been broken down below.

line 1: initiate a variable first
line 1: copy the result of the calculation 1 + 1 as the value of the variable first
line 1: the value of the variable first is 2
line 2: create the variable second
line 2: calculate 2 + 5, 2 + 5 -> 7
line 2: calculate 3 * 7, 3 * 7 -> 21
line 2: calculate first + 21
line 2: copy the value of the variable first into the calculation, its value is 2
line 2: calculate 2 + 21, 2 + 21 -> 23
line 2: copy 23 to the value of the variable second
line 2: the value of the variable second is 23
line 3: (empty, do nothing)
line 4: copy 5 to the value of the variable first
line 4: the value of the variable first is 5
line 5: (empty, do nothing)
line 6: create variable third
line 6: calculate first + second
line 6: copy the value of the variable first into the calculation, its value is 5
line 6: calculate 5 + second
line 6: copy the value of the variable second into the calculation, its value is 23
line 6: calculate 5 + 23 -> 28
line 6: copy 28 to the value of the variable third
line 6: the value of the variable third is 28
line 7: print the variable first
line 7: copy the value of the variable first for the print operation, its value is 5
line 7: print the value 5
line 8: print the variable second
line 8: copy the value of the variable second for the print operation, its value is 23
line 8: print the value 23
line 9: print the variable third
line 9: copy the value of the variable third for the print operation, its value is 28
line 9: we print the value 28 */
