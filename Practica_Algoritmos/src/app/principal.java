package app;

import java.util.Random;
import util.Algoritmos;

public class principal {

	public static void main(String[] args) {
	        int[] numeros = new int[5];
	        Random rd = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rd.nextInt(10) + 1;
	        }

	        int[] resulFibo = new int[5];
	        for (int i = 0; i < numeros.length; i++) {
	            resulFibo[i] = Algoritmos.fibonacci(numeros[i]);
	        }

	        int[] resulFac = new int[5];
	        for (int i = 0; i < numeros.length; i++) {
	            resulFac[i] = Algoritmos.factorial(numeros[i]);
	        }

	        boolean[] resulPri = new boolean[5];
	        for (int i = 0; i < numeros.length; i++) {
	            resulPri[i] = Algoritmos.esPrimo(numeros[i]);
	        }
	    }
	}


