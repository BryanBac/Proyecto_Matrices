
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alehe
 */
public class Graficar extends javax.swing.JInternalFrame {
static float [][] puntos= new float[4][2]; //6 de alto y 2 de ancho, las de ancho son 'x' 'y' 

DefaultTableModel modelo = new DefaultTableModel();
int f, c;
    /**
     * Creates new form Graficar
     */
    public Graficar() {
        initComponents();
        this.agregarPrueba();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Graficación 2D");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Multiplicar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "A", "B"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Ingresar valores a la matriz 2x2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFrame.setDefaultLookAndFeelDecorated(true);
       JFrame ventana= new JFrame("Dibujando");
       ventana.setBackground(Color.yellow);
       ventana.setSize(200, 200);
       DibujarPuntos panel= new DibujarPuntos();
       ventana.add(panel);
       ventana.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*for(int i=0;i<4;i++)
        {
            for(int j=0;j<2;j++)
            {
                puntos[i][j]=puntos[i][j]+40;
            }
        }*/
        
        try {
            int n=2;

            double m[][] = new double[n][n];// almacena los coeficientes de la matriz aumentada
            double r[] = new double[n];// almacena al valor de la solucion de cada ecuacion ejemplo si 2x+4x2=3 entonces debera ingresar el los cuadors  2   4   3   en donde , m[0][1]=2,m[0][2]=4  y   r[0]=3

            for (int i = 0; i < n; i++) {// pasamos a alamcenar en un arreglo los datos ingresados en el JTable
                for (int j = 0; j < n; j++) {//
                    m[i][j] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, j)));
                }
                r[i] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, n)));
            }

            double solucion[] = new double[n];// almacena la soluciones del sistema
            
            for (int x=0; x < m.length; x++) {
                System.out.print("|");
                for (int y=0; y < m[x].length; y++) {
                    System.out.print (m[x][y]);
                if (y!=m[x].length-1) System.out.print("\t");
                }
                System.out.println("|");
            }

        }//fin try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error ingreso de datos \n"
                + "NOTA: verifique que no haya casillas seleccionadas ni vacias\n"
                + " también verifique que el ingreso de tados sea correctos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void agregarPrueba()
    {
        puntos[0][0]=10;
        puntos[1][0]=10;
        puntos[2][0]=40;
        puntos[3][0]=40;
        
        puntos[0][1]=10;
        puntos[1][1]=40;
        puntos[2][1]=40;
        puntos[3][1]=10;
        
    }

    public static class DibujarPuntos extends JPanel
    {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); 
            g.setColor(Color.BLACK);
            g.drawLine((int) puntos[0][0], (int) puntos[0][1], (int) puntos[1][0], (int) puntos[1][1]);
            g.drawLine((int) puntos[1][0], (int) puntos[1][1], (int) puntos[2][0], (int) puntos[2][1]);
            g.drawLine((int) puntos[2][0], (int) puntos[2][1], (int) puntos[3][0], (int) puntos[3][1]);
            g.drawLine((int) puntos[3][0], (int) puntos[3][1], (int) puntos[0][0], (int) puntos[0][1]);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
