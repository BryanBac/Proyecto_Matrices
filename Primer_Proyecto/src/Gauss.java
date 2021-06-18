/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alehe
 */
public class Gauss extends javax.swing.JInternalFrame {

    int f, c;// variables usadas para almacenar las imensiones de la matriz aumentada

    DefaultTableModel modelo = new DefaultTableModel();
    Boolean ban = false;
    
    public Gauss() {
        initComponents();
    }

    public double[] cargarMatriz(double m[][], double r[]) {

        // recuerde que el metodo de Gauss Jordan trabaja con la idea de convertir la matriz aumentada en la matriz identidad
        for (int i = 0; i <= r.length - 1; i++) {
            double d, c = 0;
            d = m[i][i];// seleccionamos el pivote
            //area_de_texto.append("Holaaaa" + Double.toString(d / 2) + "*fila" + (i + 1) + "\n");// muesra en el area de texto el pivote seleccionado
            for (int s = 0; s <= r.length - 1; s++) {// pasamos a convertir en 1 al pivote seleionado
                m[i][s] = ((m[i][s]) / d);
            }
            r[i] = ((r[i]) / d);

            // paso a mostrar las opraciones realizadas en la matriz aumentada
            for (int j = 0; j < r.length; j++) {

                for (int k = 0; k < r.length; k++) {
                    area_de_texto.append(Double.toString( m[j][k]) + "\t");
                }
                area_de_texto.append("|\t" + Double.toString(r[j]) + "\n");
            }
            area_de_texto.append("\n\n");// fin paso a motrar las opraciones realizadas en la matriz aumentada

            for (int x = 0; x <= r.length - 1; x++) {
                if (i != x) {
                    c = m[x][i];
                    //area_de_texto.append("-" + Double.toString(c) + " * fila" + (i + 1) + "+ fila" + (x + 1) + "\n");// mustra en pantalla las opraciones que se realizaran por fila
                    for (int y = 0; y <= r.length - 1; y++) {// se hace cero a todos los elemntos de la colunma que no sean el pivote
                        m[x][y] = m[x][y] - c * m[i][y];

                    }
                    r[x] = r[x] - c * r[i];

                    // paso a mostrar las opraciones realizadas en la matriz aumentada
                    for (int j = 0; j < r.length; j++) {

                        for (int k = 0; k < r.length; k++) {
                            area_de_texto.append(Double.toString(m[j][k]) + "\t");
                        }
                        area_de_texto.append("|\t" + Double.toString(r[j]) + "\n");
                    }
                    area_de_texto.append("\n\n");// fin paso a motrar las opraciones realizadas en la matriz aumentada

                }// fin if (i != x)
            }// fin for (int x = 0; x <= r.length - 1; x++)

        }//fin bucle i
        return r;// retorna la solucion l sistema

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumeroDeIncognitas = new javax.swing.JTextField();
        jButtoncargar_matriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtoncargar_matriz1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_de_texto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButtoncargar_matriz2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gauss Jordan");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese Incognitas");

        jTextFieldNumeroDeIncognitas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldNumeroDeIncognitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDeIncognitasActionPerformed(evt);
            }
        });

        jButtoncargar_matriz.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtoncargar_matriz.setText("Diseñar Matriz");
        jButtoncargar_matriz.setBorder(null);
        jButtoncargar_matriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncargar_matrizActionPerformed(evt);
            }
        });

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtoncargar_matriz1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtoncargar_matriz1.setText("Resolver Matriz");
        jButtoncargar_matriz1.setActionCommand("Resolver matriz");
        jButtoncargar_matriz1.setBorder(null);
        jButtoncargar_matriz1.setMaximumSize(new java.awt.Dimension(97, 25));
        jButtoncargar_matriz1.setMinimumSize(new java.awt.Dimension(97, 25));
        jButtoncargar_matriz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncargar_matriz1ActionPerformed(evt);
            }
        });

        area_de_texto.setEditable(false);
        area_de_texto.setColumns(20);
        area_de_texto.setRows(5);
        jScrollPane2.setViewportView(area_de_texto);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Solución");

        jButtoncargar_matriz2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtoncargar_matriz2.setText("Borrar");
        jButtoncargar_matriz2.setBorder(null);
        jButtoncargar_matriz2.setMaximumSize(new java.awt.Dimension(41, 25));
        jButtoncargar_matriz2.setMinimumSize(new java.awt.Dimension(41, 25));
        jButtoncargar_matriz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncargar_matriz2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButtoncargar_matriz1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtoncargar_matriz2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNumeroDeIncognitas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtoncargar_matriz, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(112, 112, 112))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldNumeroDeIncognitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtoncargar_matriz, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtoncargar_matriz2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jButtoncargar_matriz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroDeIncognitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeIncognitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroDeIncognitasActionPerformed

    private void jButtoncargar_matrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncargar_matrizActionPerformed
        /*
        * pasamos a mostrar los cuadros para llenar la matriz aumentada en la pantalla
        */

        /*
        * ejemplo si el sistema tiene 2 incognitas aparecera en la pantalla una matriz de 2x3
        */
        try {
            /*
            * ejemplo si el sistema tiene 2 incognitas aparecera en la pantalla una matriz de 2x3
            */
            f = Integer.parseInt(jTextFieldNumeroDeIncognitas.getText());
            c = f + 1;

            //
            Object col[] = new Object[c];//  al erreglo mostrara en el titulo del JTabel las las incognitas y su solucion de la ecuaciom
            // ejemplo si el sistema tiene 2 incognitas aparecera en la pantalla una matriz de 2x3
            // se motrara en el titulo del JTable  x1  x2   d
            for (int j = 0; j < c; j++) {
                if (j < c - 1) {
                    col[j] = "X" + (j + 1);
                } else {
                    col[j] = "d";
                }
            }
            modelo = new DefaultTableModel(col, f);// se muestra el titulo y el Jtablet toma la dimension de la matriz aumentada
            jTable1.setModel(modelo);// el Jtablet toma la dimension de la matriz aumentada

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INGRESO ERRONEO", "MENSAJE", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButtoncargar_matrizActionPerformed

    private void jButtoncargar_matriz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncargar_matriz1ActionPerformed
        /*
        * acontinuacion pasamos a gargar los datos ingresados en los cuadros del Jtablet en la matriz aumntada
        */
        try {

            int n = Integer.parseInt(jTextFieldNumeroDeIncognitas.getText());// alamacena el nuemro de ingonitas ingresado por teclado

            double m[][] = new double[n][n];// almacena los coeficientes de la matriz aumentada
            double r[] = new double[n];// almacena al valor de la solucion de cada ecuacion ejemplo si 2x+4x2=3 entonces debera ingresar el los cuadors  2   4   3   en donde , m[0][1]=2,m[0][2]=4  y   r[0]=3

            for (int i = 0; i < n; i++) {// pasamos a alamcenar en un arreglo los datos ingresados en el JTable
                for (int j = 0; j < n; j++) {//
                    m[i][j] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, j)));
                }
                r[i] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, n)));
            }

            double solucion[] = new double[n];// almacena la soluciones del sistema
            r = this.cargarMatriz(m, r);// llamada al metodo a calcula la solucion del sistema de eciones

            //pasamos a mostrar las soluciones del sistema en el area de texto
            for (int i = 0; i < n; i++) {
                area_de_texto.append("x" + (i + 1) + " = " + r[i] + "\n");
            }

        }//fin try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error ingreso de datos \n"
                + "NOTA: verifique que no haya casillas seleccionadas ni vacias\n"
                + " también verifique que el ingreso de tados sea correctos");
        }
    }//GEN-LAST:event_jButtoncargar_matriz1ActionPerformed

    private void jButtoncargar_matriz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncargar_matriz2ActionPerformed
        // TODO add your handling code here:
        area_de_texto.setText("");
    }//GEN-LAST:event_jButtoncargar_matriz2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_de_texto;
    private javax.swing.JButton jButtoncargar_matriz;
    private javax.swing.JButton jButtoncargar_matriz1;
    private javax.swing.JButton jButtoncargar_matriz2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNumeroDeIncognitas;
    // End of variables declaration//GEN-END:variables
}
