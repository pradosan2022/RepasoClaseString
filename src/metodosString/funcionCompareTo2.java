package metodosString;

public class funcionCompareTo2 {
    public static void main(String[] args) {//Ejemplo 2
        String a="gato", b="perro", c="GATO";
        int z=a.compareTo(b);
        int p=b.compareTo(a);
        int q=a.compareToIgnoreCase(c);
    }
}
