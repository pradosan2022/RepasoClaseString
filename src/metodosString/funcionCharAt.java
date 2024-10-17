package metodosString;

public class funcionCharAt {
    public static void main(String[] args) { //Devuelve el carácter que encuentre en la posición indicada
        String tx= " Todos quedaremos expertos en java ";
        System.out.print("El carácter que se encuentra en la ");
        System.out.println("posición 3 del texto \"");
        System.out.print( tx + "\" es: ");
        System.out.println(tx.charAt(3));
    }
}
