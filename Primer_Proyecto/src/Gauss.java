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

        for (int i = 0; i <= r.length - 1; i++) {
            double d, c = 0;
            d = m[i][i];
            
            //Convertimos en 1 al pivote seleionado
            
            for (int s = 0; s <= r.length - 1; s++) {
                m[i][s] = ((m[i][s]) / d);
            }
            r[i] = ((r[i]) / d);

            //Mostramos las opraciones realizadas en la matriz aumentada
            for (int j = 0; j < r.length; j++) {

                for (int k = 0; k < r.length; k++) {
                    area_de_texto.append(Double.toString( m[j][k]) + "\t");
                }
                area_de_texto.append("|\t" + Double.toString(r[j]) + "\n");
            }
            area_de_texto.append("\n\n");// fin 

            for (int x = 0; x <= r.length - 1; x++) {
                if (i != x) {
                    c = m[x][i];
                    // se hace cero a todos los elemntos de la colunma que no sean el pivote
                    for (int y = 0; y <= r.length - 1; y++) {
                        m[x][y] = m[x][y] - c * m[i][y];

                    }
                    r[x] = r[x] - c * r[i];

                    //Mostramos las opraciones realizadas en la matriz aumentada
                    for (int j = 0; j < r.length; j++) {

                        for (int k = 0; k < r.length; k++) {
                            area_de_texto.append(Double.toString(m[j][k]) + "\t");
                        }
                        area_de_texto.append("|\t" + Double.toString(r[j]) + "\n");
                    }
                    area_de_texto.append("\n\n");// fin paso a motrar las opraciones realizadas en la matriz aumentada

                }
            }

        }
        return r;// retorna la solucion l sistema

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumeroDeIncognitas = new javax.swing.JTextField();
        BtDiseñar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtResolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_de_texto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        BtBorrar = new javax.swing.JButton();

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

        BtDiseñar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtDiseñar.setText("Diseñar Matriz");
        BtDiseñar.setBorder(null);
        BtDiseñar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDiseñarActionPerformed(evt);
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

        BtResolver.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtResolver.setText("Resolver Matriz");
        BtResolver.setActionCommand("Resolver matriz");
        BtResolver.setBorder(null);
        BtResolver.setMaximumSize(new java.awt.Dimension(97, 25));
        BtResolver.setMinimumSize(new java.awt.Dimension(97, 25));
        BtResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtResolverActionPerformed(evt);
            }
        });

        area_de_texto.setEditable(false);
        area_de_texto.setColumns(20);
        area_de_texto.setRows(5);
        jScrollPane2.setViewportView(area_de_texto);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Solución");

        BtBorrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtBorrar.setText("Borrar");
        BtBorrar.setBorder(null);
        BtBorrar.setMaximumSize(new java.awt.Dimension(41, 25));
        BtBorrar.setMinimumSize(new java.awt.Dimension(41, 25));
        BtBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBorrarActionPerformed(evt);
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
                        .addComponent(BtResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNumeroDeIncognitas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtDiseñar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(BtDiseñar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(BtResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroDeIncognitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeIncognitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroDeIncognitasActionPerformed

    private void BtDiseñarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDiseñarActionPerformed
       
        try {
            
            f = Integer.parseInt(jTextFieldNumeroDeIncognitas.getText());
            c = f + 1;

            //  Al erreglo mostrara en el titulo del JTabel las las incognitas y su solucion de la ecuaciom
            Object col[] = new Object[c];
            
            for (int j = 0; j < c; j++) {
                if (j < c - 1) {
                    col[j] = "X" + (j + 1);
                } else {
                    col[j] = "d";
                }
            }
            modelo = new DefaultTableModel(col, f);
            jTable1.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INGRESO ERRONEO", "MENSAJE", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_BtDiseñarActionPerformed

    private void BtResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtResolverActionPerformed
        
         //Pasamos a cargar los datos ingresados en los cuadros del Jtablet en la matriz aumntada
        
        try {

            // alamacena el nuemero de ingonitas ingresado por teclado
            
            int n = Integer.parseInt(jTextFieldNumeroDeIncognitas.getText());

            double m[][] = new double[n][n];// almacena los coeficientes de la matriz aumentada
            double r[] = new double[n];// almacena la respuesta final

            // pasamos a alamcenar en un arreglo los datos ingresados en el JTable
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {//
                    m[i][j] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, j)));
                }
                r[i] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, n)));
            }

            double solucion[] = new double[n];// almacena la soluciones del sistema
            r = this.cargarMatriz(m, r);

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
    }//GEN-LAST:event_BtResolverActionPerformed

    private void BtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBorrarActionPerformed

        area_de_texto.setText("");
    }//GEN-LAST:event_BtBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBorrar;
    private javax.swing.JButton BtDiseñar;
    private javax.swing.JButton BtResolver;
    private javax.swing.JTextArea area_de_texto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNumeroDeIncognitas;
    // End of variables declaration//GEN-END:variables
}
