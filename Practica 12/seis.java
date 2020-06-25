public class seis {

    //Con esta función creo la matriz de tantas filas y columnas como me indiquen 
    //en los parámetros. Y a continuación pongo en cada casilla de dicha matriz el
    //resultado de sumar el número de fila y el número de columna en la que está.
    static int[][] generaMatriz(int filas, int columnas){
        int[][] matriz=new int[filas][columnas];
        int f,c;
        
        for(f=0 ; f < matriz.length ; f++){
            for (c=0 ; c < matriz[f].length ; c++){
                matriz[f][c]=f*c;
            }
        }
        return matriz;
    }
    
    //Con esta función hacemos un recorrido por la matriz para mostrar todas sus
    //casillas, utilizo la salida con formato "%4d" para que todos los valores salgan
    //tabulados con un ancho de 4 carácteres.
    static void imprimeMatriz(int[][] matriz){
        int filas, columnas;
        
        for (filas=0 ; filas < matriz.length ; filas++){
            for (columnas=0 ; columnas < matriz[filas].length ; columnas++){
                System.out.printf("%4d", matriz[columnas][filas]);
            }
            System.out.println();
        }
    }
   
    //Desde la función principal sólo tengo que hacer dos llamadas a las 
    //funciones creadas arriba para mostrar por pantalla la matriz generada
    public static void main(String[] args) {
        int[][] matriz;
        
        matriz=generaMatriz(10,10);
        imprimeMatriz(matriz);   
    }
}