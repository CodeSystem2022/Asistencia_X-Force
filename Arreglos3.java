import javax.swing.JOptionPane;

class Arreglos3{
        
    public static void main(String[] args) {

    int numeros[] = new int [5];
    AgregarNumeros(numeros);
}

    public static void AgregarNumeros (int[] lista){
        int agregador =0;
        for (int i=0 ; i<5 ; i++){
        agregador = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        if (agregador == (int) agregador) {
            lista[i] = agregador;
        }
        else{
            JOptionPane.showMessageDialog(null, "el dato ingresado no es un numero, intenta de nuevo.");
            }
        }
        System.out.println("La lista queda de la siguiente manera:");
        for (int index=0 ; index<lista.length ; index++){
            System.out.print(lista[index]+", ");
        }
        SepararNumeros(lista);
    }


    private static void SepararNumeros(int[] lista){
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cantPositivos = 0;
        int cantNegativos = 0;

        for (int i=0 ; i<lista.length ; i++){
            if (lista[i] > 0){
                sumaPositivos = sumaPositivos + lista[i];
                cantPositivos++;
            }  else if(lista[i]<0){
            sumaNegativos = sumaNegativos + lista[i];
            cantNegativos++;
        }
    } 
    System.out.printf("\nHay "+cantPositivos+" numeros positivos en la lista y "+cantNegativos+" numeros negativos."
                            +"\nLa suma de los positivos es igual a "+sumaPositivos+" y la media es de "+(sumaPositivos/cantPositivos)
                            +"\nLa suma de los negativos es igual a "+sumaNegativos+" y la media es de "+(sumaNegativos/cantNegativos)
                            +"\nCantidad de ceros: "+(lista.length-(cantNegativos+cantPositivos)));
                            
    }
}

