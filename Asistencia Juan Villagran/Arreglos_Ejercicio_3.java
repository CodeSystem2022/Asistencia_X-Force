package ejercicioArray;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        float[] numeros = new float[5];
        float numPos = 0;
        float contPos = 0;
        float numNeg = 0;
        float contNeg = 0;
        float numCer = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = Float.parseFloat(entrada.nextLine());
        }
        for (float numero : numeros) {
            if (numero == 0) {
                numCer++;
            }
            if (numero > 0) {
                numPos = numPos + numero;
                contPos++;
            }
            if (numero < 0) {
                numNeg = numNeg +numero;
                contNeg++;
            }
        
        }
        
        System.out.println("Cantidad de ceros: "+numCer);
        System.out.println("Media de numeros positivos: "+(numPos / contPos));
        System.out.println("Media de numeros negativos: "+(numNeg / contNeg));
    }
}
