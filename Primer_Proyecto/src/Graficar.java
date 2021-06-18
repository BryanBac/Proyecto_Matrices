
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
    
    //Matriz Cuadrado Inicial ----Es la primer figura
    static double MInicial[][] = new double[4][2]; //6 de alto y 2 de ancho, las de ancho son 'x' 'y'
    //Matriz Ingresada     
    static double MMedia[][] = new double[2][2];// almacena los coeficientes de la matriz aumentada
    //Matriz Final (Ya multiplicada)
    double MFinal[][] = new double[4][2];
    // ############ AQUÍ VA LA SEG FIGURA
    static double SegundaFigura[][] = new double[6][2];
    double MFinalizimo[][] = new double[6][2];
    
    
    //Inicio la clase OperacionesM
    OperacionesM Matriz = new OperacionesM();
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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

        jLabel1.setText("                                   Ingresar valores a la matriz 2x2");

        jLabel2.setText("           Figura 1");

        jLabel3.setText("           Figura 2");

        jButton3.setText("Multiplicar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Aceptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFrame.setDefaultLookAndFeelDecorated(true);
       JFrame ventana= new JFrame("Dibujando");
       ventana.setBackground(Color.yellow);
       ventana.setSize(500, 500);
       DibujarPuntos panel= new DibujarPuntos();
       ventana.add(panel);
       ventana.setVisible(true);
       vaciarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {          
            // Almacenamos en un arreglo los datos ingresados en el JTable
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    MMedia[i][j] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, j)));
                }
            }       
            MInicial=Matriz.multiplicacion(MInicial, MMedia, MFinal, 4, 2, 2);
        }//fin try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error ingreso de datos \n"
                + "NOTA: verifique que no haya casillas seleccionadas ni vacias\n"
                + " también verifique que el ingreso de tados sea correctos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {          
            // Almacenamos en un arreglo los datos ingresados en el JTable
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    MMedia[i][j] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, j)));
                }
            }       
            SegundaFigura=Matriz.multiplicacion(SegundaFigura, MMedia, MFinalizimo, 6, 2, 2);
        }//fin try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error ingreso de datos \n"
                + "NOTA: verifique que no haya casillas seleccionadas ni vacias\n"
                + " también verifique que el ingreso de tados sea correctos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana= new JFrame("Dibujando");
        ventana.setBackground(Color.yellow);
        ventana.setSize(500, 500);
        DibujarSecond panel2= new DibujarSecond(); //dif
        ventana.add(panel2);
        ventana.setVisible(true);
        vaciarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public void agregarPrueba()
    {
        //los de la primer figura
        MInicial[0][0]=10;
        MInicial[1][0]=10;
        MInicial[2][0]=40;
        MInicial[3][0]=40;
        
        MInicial[0][1]=10;
        MInicial[1][1]=40;
        MInicial[2][1]=40;
        MInicial[3][1]=10;
        // los de la segunda figura
        SegundaFigura[0][0]=10;
        SegundaFigura[1][0]=30;
        SegundaFigura[2][0]=50;
        SegundaFigura[3][0]=50;
        SegundaFigura[4][0]=30;
        SegundaFigura[5][0]=10;
        
        SegundaFigura[0][1]=30;
        SegundaFigura[1][1]=10;
        SegundaFigura[2][1]=30;
        SegundaFigura[3][1]=50;
        SegundaFigura[4][1]=70;
        SegundaFigura[5][1]=50;
        
    }

    public static class DibujarPuntos extends JPanel
    {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); 
            g.setColor(Color.BLACK);
            g.drawLine((int) MInicial[0][0], (int) MInicial[0][1], (int) MInicial[1][0], (int) MInicial[1][1]);
            g.drawLine((int) MInicial[1][0], (int) MInicial[1][1], (int) MInicial[2][0], (int) MInicial[2][1]);
            g.drawLine((int) MInicial[2][0], (int) MInicial[2][1], (int) MInicial[3][0], (int) MInicial[3][1]);
            g.drawLine((int) MInicial[3][0], (int) MInicial[3][1], (int) MInicial[0][0], (int) MInicial[0][1]);
        }
        
    }
    public static class DibujarSecond extends JPanel
    {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); 
            g.setColor(Color.BLACK);
            g.drawLine((int) SegundaFigura[0][0], (int) SegundaFigura[0][1], (int) SegundaFigura[1][0], (int) SegundaFigura[1][1]);
            g.drawLine((int) SegundaFigura[1][0], (int) SegundaFigura[1][1], (int) SegundaFigura[2][0], (int) SegundaFigura[2][1]);
            g.drawLine((int) SegundaFigura[2][0], (int) SegundaFigura[2][1], (int) SegundaFigura[3][0], (int) SegundaFigura[3][1]);
            g.drawLine((int) SegundaFigura[3][0], (int) SegundaFigura[3][1], (int) SegundaFigura[4][0], (int) SegundaFigura[4][1]);
            g.drawLine((int) SegundaFigura[4][0], (int) SegundaFigura[4][1], (int) SegundaFigura[5][0], (int) SegundaFigura[5][1]);
            g.drawLine((int) SegundaFigura[5][0], (int) SegundaFigura[5][1], (int) SegundaFigura[0][0], (int) SegundaFigura[0][1]);
        }
        
    }
    public void vaciarTabla()
    {
        for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    jTable1.setValueAt("", i, j);
                }
            }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
