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
public class Funciones {
    public float[][] reColocar(float[][] matA, int fila1, int fila2){
        float [] arreglo= new float[6];
        for(int i=0; i<6;i++)
        {
            arreglo[i]=matA[fila1][i];
            matA[fila1][i]=matA[fila2][i];
            matA[fila2][i]=arreglo[i];
        }
        return matA;
    }
    public void mostrar(float[][] matA,int t)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<t;j++)
            {
                System.out.print(matA[i][j]+" # ");
            }
            System.out.println();
        }
    }
    public void mostrarB(float[] matA)
    {
        for(int i=0;i<3;i++)
        {
                System.out.println(matA[i]);
        }
    }
    public int[] verificarAbajo(float[][] matA, int pivY, int pivX) //el Y es el primer corchete de la matriz, el x es el segundo
    {
        int sigAbajo=pivY+1;
        int siHubo=-1;
        int [] arrAux= new int[3];
        while(sigAbajo!=4)
        {
            if(matA[sigAbajo][pivX]!=0)
            {
                siHubo=sigAbajo;
                sigAbajo=3;
            }
            sigAbajo=sigAbajo+1;
        }
        if(siHubo!=-1)
        {
            arrAux[0]=1;    //indica que si hay una fila con la cual se debe intercambiar
            arrAux[1]=pivY; //es el numero de la fila que tenía el cero
            arrAux[2]=siHubo; // es el numero de fila que tenía un numero distinto a cero (para que haga de pivote)
        }
        else
        {
            arrAux[0]=0;
            arrAux[1]=-1; //solo pa que se viera chido
            arrAux[2]=-1; //igual que el de arriba
        }
        return arrAux;
    }
    public float[][] CeroColumna(float[][] matA, int pivY, int pivX) //deja en cero los valores debajo del pivote
    {
        float a=matA[pivY][pivX];
        int x=(pivY+1);
        for(int i=x;i<3;i++)
        {
            float b=matA[i][pivX];
            float factor=-b/a;
            for(int j=0;j<6;j++)
            {
                matA[i][j]=(matA[pivY][j]*factor) + matA[i][j];
            }
        }
        return matA;
    }
    //aquí ya vienen de regreso
    public float[][] dejarEnUno(float[][] matA, int pivY, int pivX) //deja en 1 el pivote
    {
        float factor= 1/matA[pivY][pivX];
        for(int i=pivX;i<6;i++)
        {
            matA[pivY][i]=matA[pivY][i]*factor;
        }
        return matA;
    }
    public float[][] CeroArriba(float[][] matA, int pivY, int pivX)
    {
        float a=matA[pivY][pivX];
        int x=(pivY-1);
        for(int i=x;i>-1;i--)
        {
            float b=matA[i][pivX];
            float factor=-b/a;
            for(int j=0;j<6;j++)
            {
                matA[i][j]=(matA[pivY][j]*factor) + matA[i][j];
            }
        }
        return matA;
    }
    public float[] multiplicarB(float[][] matI, float [] b) //le envió la inversa y el b, me devuelve x
    {
        float [] x = new float[3];
        for(int i=0; i<3;i++)
        {
            float suma=0;
            for(int j=0;j<3;j++)
            {
                suma=(matI[i][j]*b[j])+suma;
            }
            x[i]=suma;
        }
        return x;
    }
    public float[][] recorrido1(float[][] matX)
    {
        int x=0,y=0;
        while(y!=2)
        {
            if(matX[x][y]==0) //si es cero el pivote o no lo es
            {
                int [] arreg=this.verificarAbajo(matX, y, x);
                if(arreg[0]==1) //significa que al menos uno de los de abajo no es cero
                {
                    matX=this.reColocar(matX, arreg[1], arreg[2]);
                    //#########  AHORA AQUÍ DEBO HACER EL MISMO PROCESO QUE CON LOS PIVOTES NO CERO (porque ahora el pivote ya no es cero)
                    matX=this.CeroColumna(matX, y, x);
                }
                else //muevase al lado
                {
                    y=y-1; //para que no se mueva de esa fila, solo se mueva de columna al llegar al final de esta iteración del while
                }
            }
            else    //si no era cero el pivote, aquí tiene que comenzar el algoritmo de bajada
            {
                matX=this.CeroColumna(matX, y, x);
            }
            x=x+1;
            y=y+1;
        }
        return matX;
    }
    public float[][] recorrido2(float[][] matX)
    {
        int x=2;
        int y=2;
        while(y!=0)
        {
            if(matX[x][y]!=0) //si el pivote es cero ya valió, por eso si no lo es que pase al algoritmo
            {
                if(matX[x][y]!=1) // si no es 1 habrá que dejarlo en 1
                {
                    matX=this.dejarEnUno(matX, y, x);
                }
                //ahora que ya tenemos un pivote de 1
                matX=this.CeroArriba(matX, y, x);
            }
            else
            {
                y=-1; //este es el ya valió
            }
            x=x-1;
            y=y-1;
        }
        return matX;
    }
}
