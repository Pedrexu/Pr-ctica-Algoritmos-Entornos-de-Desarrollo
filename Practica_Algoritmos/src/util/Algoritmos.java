package util;

public abstract class Algoritmos {

	public static int fibonacci(int numero) {
        if (numero <= 1)
            return numero;
        else
            return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
	
	public static int factorial(int numero) {
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero - 1);
    }
	
	public static boolean primo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
}
