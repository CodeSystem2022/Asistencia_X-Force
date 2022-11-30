package media;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        float numeros[] = new float[5];
        float meanPos = 0,meanNeg = 0, ceros = 0;
        float contPos = 0, contNeg = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = Float.parseFloat(scanner.nextLine());
        }
        
        for (float numero : numeros) {
            if (numero == 0) {
                ceros++;
            } else if (numero > 0) {
                meanPos += numero;
                contPos++;
            } else if (numero < 0) {
                meanNeg += numero;
                contNeg++;
            }
        }
        
        meanPos = meanPos / contPos;
        meanNeg = meanNeg / contNeg;
        System.out.println("La media los numeros positivos es = " + meanPos + 
                ". La media de los numeros negativos es = " + meanNeg + ". Y la cantidad de ceros es = " + ceros + ".");
        
    }
}
