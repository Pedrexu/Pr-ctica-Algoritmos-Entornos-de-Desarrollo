package util;

public abstract class Algoritmos {

	/**
     * Calcular Fibonacci de un número entero.
     * @param numero El número entero del que se va a calcular fibonacci.
     * @return El número de Fibonacci.
     */
    public static int fibonacci(int numero) {
        if (numero <= 1)
            return numero;
        else
            return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

    /**
     * Calcula factorial de un número entero.
     * @param numero El número entero del cual se va a calcular el factorial.
     * @return El factorial del número.
     */
    public static int factorial(int numero) {
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero - 1);
    }

    /**
     * Verifica si un número entero es primo.
     * @param numero El número entero.
     * @return true si el número es primo, false si no lo es.
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
}
