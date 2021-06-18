/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alehe
 */
public class OperacionesM {
   
   //Funcion para Imprimir la matriz 
    
   public static void mostrar(double m[][], int f,int c){
       for(int i=0;i<f;i++){
           System.out.print("|");
           for(int j=0;j<c;j++){
               System.out.print(m[i][j]);
               if (j!=m[i].length-1) System.out.print("\t");   
           }
           
           System.out.println("|");
       }
   }
   
   //Funcion para multiplicar matrices
   //Recibe las 2 matrices ingresadas, la matriz final
   //Las filas y columnas de la primer matriz y columnas de la segunda matriz
   
   public double[][] multiplicacion(double m[][], double n[][],double g[][], double f, double c , double y){    
       for(int i=0;i<f;i++){
           for(int j=0;j<y;j++){
               for(int k=0;k<c;k++){
                   g[i][j] += m[i][k] * n[k][j];
               }
               
           }
       }
       return g;
   }
   
}
