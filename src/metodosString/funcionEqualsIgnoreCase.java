package metodosString;

public class funcionEqualsIgnoreCase { //esta función es igual a la anterior, pero ignora mayúsculas o minúsculas
    public static void main(String[] args) {
        String te1= "Hola";
        String te2= "hola";
        if(te1.equalsIgnoreCase(te2))
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");
    }
}
