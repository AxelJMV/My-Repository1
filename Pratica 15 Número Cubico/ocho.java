import java.util.Scanner;
public class ocho{
    public static void main(String[]a){
        Scanner leer=new Scanner(System.in);
        Double x;

        System.out.println("Ingrese un número");
        x=leer.nextDouble();

        Double resultado=Math.cbrt(x);


        double parteDecimal = resultado % 1; // Lo que sobra de dividir al número entre 1
        //System.out.println(parteDecimal);

        double parteEntera = resultado - parteDecimal; // Le quitamos la parte decimal usando una resta
        //System.out.println(parteEntera);

        if ((parteEntera - resultado) == 0) {
            System.out.println("Es un cubo");
        } else {
            System.out.println("No es un cubo");
        }
        
    }
}