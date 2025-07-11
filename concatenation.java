// Pode adicionar mais de uma string a ser impressa na tela através do operador +:

public class Program {
	public static void main(String[] args) {
		System.out.println("hello" + "world");
	}
}

// O mesmo método pode ser usado para juntar a string literal e o valor da string variável.

public class Program {
	public static void main(String[] args) {
		System.out.println(message + "...and the universe");
	}
}

// Podemos fazer o mesmo com qualquer número de strings:
public class Program {
	public static void main(String[] args) {
		String start = "My name is ";
		String end = ", James Bond";
		System.out.println(start + "Bond" + end);
	}
}
