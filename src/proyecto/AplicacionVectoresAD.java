/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author hdomingu2
 */
public class AplicacionVectoresAD extends javax.swing.JFrame {

    /**
     * Creates new form AplicacionVectoresAD
     */
    double v[];
    double v2[];
    
    public AplicacionVectoresAD() {
        initComponents();
        cmdCrear.setEnabled(true);
        cmdLlenadoManu.setEnabled(false);
        cmdLlenadoAuto.setEnabled(false);
        cmdBorrar.setEnabled(false);
        cmdMostrar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtLongitud = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManu = new javax.swing.JButton();
        cmdLlenadoAuto = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdVectores = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MANEJO DE VECTORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 230, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLongitudActionPerformed(evt);
            }
        });
        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, -1));

        jLabel2.setText("longitud");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 20, 70, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 50));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        cmdLlenadoManu.setText("Llenar Manual");
        cmdLlenadoManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManuActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoManu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        cmdLlenadoAuto.setText("Llenar Autom");
        cmdLlenadoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, -1));

        cmdVectores.setText("Vectores");
        cmdVectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVectoresActionPerformed(evt);
            }
        });
        jPanel3.add(cmdVectores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 130, 280));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, 150));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(530, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtLongitud.setText("");
        txtResultado.setText("");
        v = null;
        txtLongitud.requestFocusInWindow();
        
        cmdCrear.setEnabled(true);
        cmdLlenadoManu.setEnabled(false);
        cmdLlenadoAuto.setEnabled(false);
        cmdBorrar.setEnabled(true);
        cmdMostrar.setEnabled(false);
        txtLongitud.setEditable(false);
        
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int longitud;
        if (txtLongitud.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la longitud", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        } else if (Integer.parseInt(txtLongitud.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "La longitud no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        } else {
            longitud = Integer.parseInt(txtLongitud.getText().trim());
            v = new double[longitud];
            v2 = new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector creado Exitosamente!");
            
            
        cmdCrear.setEnabled(false);
        cmdLlenadoManu.setEnabled(true);
        cmdLlenadoAuto.setEnabled(true);
        cmdBorrar.setEnabled(true);
        cmdMostrar.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void txtLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLongitudActionPerformed
       
        
    }//GEN-LAST:event_txtLongitudActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
      char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
        
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdLlenadoManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManuActionPerformed
        double n;
        int sw, res;
        boolean aux =true;
        
        for (int i = 0; i < v.length; i++) {
        do {
        sw=1;
        try {
        n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elmento en la posición " + i));
        v[i] = n;
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Digite un número válido","Error",JOptionPane.ERROR_MESSAGE);
                    sw=0;
                } catch (NullPointerException e) {
                  res= JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                   if(res == 0){
                       sw=1;
                       i = v.length;
                       aux =false;
                   }else{
                       sw=0;
                   }
                      
                }
            } while (sw==0);
}           
        cmdCrear.setEnabled(false);
        cmdLlenadoManu.setEnabled(false);
        cmdLlenadoAuto.setEnabled(false);
        cmdBorrar.setEnabled(true);
        cmdMostrar.setEnabled(aux);
     
    }//GEN-LAST:event_cmdLlenadoManuActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        for (int i = 0; i < v.length; i++) {
            txtResultado.append(v[i] + "\n");
        }for (int i = 0; i < v2.length; i++) {
            
        txtResultado.append(v2[i] + "\n");
        }
        
        cmdCrear.setEnabled(false);
        cmdLlenadoManu.setEnabled(false);
        cmdLlenadoAuto.setEnabled(false);
        cmdBorrar.setEnabled(true);
        cmdMostrar.setEnabled(false);
        
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLlenadoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutoActionPerformed
        double n,m;
        for (int i = 0; i < v.length; i++) {
            n = (int) (Math.random() * 50 + 1);
            v[i] = n;
            m = (int) (Math.random() * 50 + 1);
            v2[i] = m;
        }
        JOptionPane.showMessageDialog(this,"Llenado hehco correctamente");
        cmdCrear.setEnabled(false);
        cmdLlenadoManu.setEnabled(false);
        cmdLlenadoAuto.setEnabled(false);
        cmdBorrar.setEnabled(true);
        cmdMostrar.setEnabled(true);
    }//GEN-LAST:event_cmdLlenadoAutoActionPerformed

    private void cmdVectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVectoresActionPerformed
        TallerVectores f =new TallerVectores ();
       /*
       JOptionPane.showMessageDialog(this, f.sumatoria(v)+" la sumatoria es");
       JOptionPane.showMessageDialog(this,f.productoria(v)+" la productoria es");
       JOptionPane.showMessageDialog(this,f.numeroMayor(v)+" el numero mayor es");
       JOptionPane.showMessageDialog(this, f.numeroMenor(v)+" el numero menor es");
       
       // tercero
        JOptionPane.showMessageDialog(this, Arrays.toString(f.vectorsuma(v, v2))+ "la suma es");
        JOptionPane.showMessageDialog(this, Arrays.toString(f.vectorresta(v, v2))+ "la resta es");
       */
       //sexto 
       JOptionPane.showMessageDialog(this,f.simetrico(v)?"si es simetrico":"no es simetrico");
        
        
    }//GEN-LAST:event_cmdVectoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplicacionVectoresAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacionVectoresAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacionVectoresAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacionVectoresAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacionVectoresAD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenadoAuto;
    private javax.swing.JButton cmdLlenadoManu;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdVectores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
