/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer_proyecto;

/**
 *
 * @author HP15DA0023LA
 */
public class Primer_Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float [][] matriz= new float[3][6];
        float [] b = new float[3];
        float [][] inversa= new float[3][3];
        Funciones fun= new Funciones();
        matriz[0][0]=1;
        matriz[0][1]=0;
        matriz[0][2]=-2;
        matriz[0][3]=1;
        matriz[0][4]=0;
        matriz[0][5]=0;
        
        matriz[1][0]=-3;
        matriz[1][1]=1;
        matriz[1][2]=4;
        matriz[1][3]=0;
        matriz[1][4]=1;
        matriz[1][5]=0;
        
        
        matriz[2][0]=2;
        matriz[2][1]=-3;
        matriz[2][2]=4;
        matriz[2][3]=0;
        matriz[2][4]=0;
        matriz[2][5]=1;
        //
        b[0]=1;
        b[1]=2;
        b[2]=3;
        // pensar en como recorrer el arreglo
        fun.mostrar(matriz,3);
        int x=0,y=0;
        matriz=fun.recorrido1(matriz);
        matriz=fun.recorrido2(matriz);
        //esto no sé si sea necesario pero igual lo dejé por si acaso
        if(matriz[0][0]!=1)
        {
            matriz=fun.dejarEnUno(matriz, 0, 0);
        }
        //aquí lleno la inversa
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                inversa[i][j]=matriz[i][j+3];
            }
        }
        System.out.println("############################################");
        fun.mostrar(inversa,3);
        System.out.println("############################################");
        b=fun.multiplicarB(inversa, b);
        fun.mostrarB(b);
    }
}
