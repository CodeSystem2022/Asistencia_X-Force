/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ejerc8_Cadena;

import java.util.Scanner;

public class ServicioCadena {

    static Scanner tipe = new Scanner(System.in);

    public static void pedirFrase(Cadena p) {
	System.out.println("Ingrese una frase: ");
	p.setFrase(tipe.nextLine());
	p.setLongitudFrase(p.getFrase().length());
    }

    public static void mostarVocales(Cadena p) {
	int cont = 0;
	for (int i = 0; i < p.getLongitudFrase(); i++) {
	    if (p.getFrase().substring(i, i + 1).toLowerCase().equals("a") || 
	        p.getFrase().substring(i, i + 1).toLowerCase().equals("e") || 
		p.getFrase().substring(i, i + 1).toLowerCase().equals("i") || 
		p.getFrase().substring(i, i + 1).toLowerCase().equals("o") ||
		p.getFrase().substring(i, i + 1).toLowerCase().equals("u")) {
		cont++;
	    }
	}
	System.out.println("La cantidad de vocales es: " + cont);
    }

    public static void invertirFrase(Cadena p) {
	String fraseInvertida;

	StringBuilder invertir = new StringBuilder(p.getFrase());
	fraseInvertida = invertir.reverse().toString();
	System.out.println("La frase invertida es: " + fraseInvertida);
    }

    public static void vecesRepetido(Cadena p) {
	String letra;
	System.out.println("Ingrese la letra que desea buscar: ");
	letra = tipe.nextLine();

	int cont = 0;
	for (int i = 0; i < p.getLongitudFrase(); i++) {
	    if (p.getFrase().substring(i, i + 1).toLowerCase().equals(letra)) {
		cont++;
	    }
	}
	System.out.println("La la letra ``" + letra + "´´ se repite " + cont + " veces");
    }

    public static void compararLongitud(Cadena p) {
	String frase;
	System.out.println("Ingrese una nueva frase: ");
	frase = tipe.nextLine();
    }

    public static void unirFrase(Cadena p) {
	String frase;
	System.out.println("Ingrese una nueva frase");
	frase = tipe.nextLine();
	System.out.println(p.getFrase() + frase);
    }

    public static void reemplazarFrase(Cadena p) {
	String letra;
	System.out.println("Ingrese una letra para reemplazar las ''a'' ");
	letra = tipe.nextLine();
	String fraseReemplazada = p.getFrase().replaceAll("a", letra);
	System.out.println(fraseReemplazada);
    }

// Método contiene(String letra), deberá comprobar si la frase contiene una letra que
// ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public static void contiene(Cadena p) {
	System.out.println("Ingrese una letra para comprobar");
	String letra = tipe.nextLine();
	boolean contiene = p.getFrase().contains(letra);
	System.out.println(contiene);
    }
}
