import java.util.Scanner;
public class Contingencia3{
    static int[] array = new int[5];
    static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
    insertarDatosArray();
    sumarArray();
    maxArray();
    promedioArray();
    ordenArray();
    }
    private static void insertarDatosArray() {
    for (int i = 0; i < array.length; i++) {
    System.out.print("insertar array[" + i + "]:");
    array[i] = SC.nextInt();
    }
    }
    private static void sumarArray() {
    System.out.print("Suma: ");
    int acumulador = 0;
    for (int i = 0; i < array.length; i++) {
    acumulador = acumulador + array[i];
    System.out.print("+" + array[i]);
    }
    System.out.println("= " + acumulador);
    }
    private static void maxArray() {
    System.out.print("Maximo: ");
    int max = 0;
    for (int i = 0; i < array.length; i++) {
    if (array[i] > max) {
    max = array[i];
    }
    }
    System.out.println(max);
    }
    private static void promedioArray() {
    System.out.print("Promedio: ");
    double promedio = 0;
    for (int i = 0; i < array.length; i++) {
    promedio = promedio + array[i];
    }
    promedio = promedio / array.length;
    System.out.println(promedio);
    }
    

    private static void ordenArray(){
        for(int i=0; i < (array.length-1); i++){
            for(int j=0;j<(array.length-1);j++){
                if(array[j]>array[j+1]){
                    int aux= array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
    }
    //Mostrar el arreglo ordenado 
    System.out.println("El arreglo ordenado de forma creciente: ");
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+ "- ");
    }

    System.out.println("El arreglo ordenado de forma decreciente: ");
    for(int i=(array.length-1);i>=0;i--){
        System.out.print(array[i]+".-");
    }
    System.out.println("");

    
    }
     }