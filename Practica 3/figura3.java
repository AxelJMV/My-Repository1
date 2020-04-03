import java.util.Scanner;
public class figura3{

    public static void main(String[] args) {

        int i,j;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las filas de la matriz");

        int n=teclado.nextInt();
        int y=n-1;
        System.out.println("Ingrese las columnas de la matriz");

        int m=teclado.nextInt();

        String matriz [][]= new String [n][m];

        for( i=0;i<n;i++){
            for(j=0;j<m;j++){
                    matriz[i][j]=" ";  
                }    
             }
             /// llena la matriz por filas
        for(i=0;i<m;i++){
            matriz[0][i]="x";
            matriz[n-1][i]="x";
        }
        //llena la matriz por columnas 
        for(i=0;i<n;i++){
            matriz[i][0]="x";
            matriz[i][m-1]="x";
        }

        ///se imprime la matriz final
        for(i=0; i<n;i++){
            for(j=0;j<m;j++){
              System.out.print(" [ " + matriz[i][j] + "  ] ");
            }
            System.out.println();
         }
    }
}