package metodosString;

public class funcionCompareTo1 { //Devuelve un entero menor que cero si el String es alfabéticamente menor que
    // la dada como argumento, cero si los dos String son léxicamente iguales y un entero mayor que cero
    // si el String es mayor.

    public static void main(String[] args) {
        String te1= "Hola";
        String te2= "hola";
        if(te1.compareToIgnoreCase(te2) == 0)
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");

    }
}
