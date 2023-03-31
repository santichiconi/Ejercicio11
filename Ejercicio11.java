/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la secuencia de caracteres
        System.out.println("Ingrese una secuencia de caracteres terminada en punto:");
        String secuencia = scanner.nextLine();

        // Llamar al subprograma para codificar la secuencia
        String codificada = codificarSecuencia(secuencia);

        // Imprimir la secuencia codificada
        System.out.println("La secuencia codificada es: " + codificada);
    }

    public static String codificarSecuencia(String secuencia) {
        
        char[] caracteres = secuencia.toCharArray();

  
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            switch (c) {
                case 'a':
                    caracteres[i] = '@';
                    break;
                case 'e':
                    caracteres[i] = '#';
                    break;
                case 'i':
                    caracteres[i] = '$';
                    break;
                case 'o':
                    caracteres[i] = '%';
                    break;
                case 'u':
                    caracteres[i] = '*';
                    break;
            }
        }

        // Convertir el array de caracteres de vuelta a una cadena y devolverla
        return new String(caracteres);
    }
}
