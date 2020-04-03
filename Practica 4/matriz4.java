import java.util.Scanner;
public class matriz4{
    public static void main(String []arg) {

        int i,j;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las filas de la matriz");

        int n=teclado.nextInt();

        System.out.println("Ingrese las columnas de la matriz");

        int m=teclado.nextInt();

        String matriz [][]= new String [n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
               matriz[i][j]="a";
            }
        }

         ///Llena la matriz con los valores de 1
         for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((i==0) && (j>0) && (j<6)){
                    matriz[i][j]="1"; 
                }
                if((i==1) && (j>1) && (j<5)){
                    matriz[i][j]="1"; 
                }
                if((i==2) && (j>2) && (j<4)){
                    matriz[i][j]="1"; 
                }
            }
        }

        ///Llena la matriz con los valores de 3
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((i==6) && (j>0) && (j<6)){
                    matriz[i][j]="3"; 
                }
                if((i==5) && (j>1) && (j<5)){
                    matriz[i][j]="3"; 
                }
                if((i==4) && (j>2) && (j<4)){
                    matriz[i][j]="3"; 
                }
            }
        }

        ///Llena la matriz con los valores de 2
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((j==6) && (i>0) && (i<6)){
                    matriz[i][j]="2"; 
                }
                if((j==5) && (i>1) && (i<5)){
                    matriz[i][j]="2"; 
                }
                if((j==4) && (i>2) && (i<4)){
                    matriz[i][j]="2"; 
                }
            }
        }

         ///Llena la matriz con los valores de 4
         for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((j==0) && (i>0) && (i<6)){
                    matriz[i][j]="4"; 
                }
                if((j==1) && (i>1) && (i<5)){
                    matriz[i][j]="4"; 
                }
                if((j==2) && (i>2) && (i<4)){
                    matriz[i][j]="4"; 
                }
            }
        }



        ///Llena la matriz con 0 en forma de X
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i==j){
                    matriz[i][j]="0";
                }
                if((i+j)==(n-1)){
                    matriz[i][j]="0";
                }
            }
        }
       ///Imprimir Matriz
       for(i=0; i<n;i++){
        for(j=0;j<m;j++){
          System.out.print(" [ " + matriz[i][j] + "  ] ");
        }
        System.out.println();
     }

    }
}