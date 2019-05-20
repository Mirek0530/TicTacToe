package tictactoe;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class TicTacToeForm extends javax.swing.JFrame {
    
    int counter = 0;
    
    public TicTacToeForm() {
        super("Tic Tac Toe");
        initComponents();
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(600,280);
        setPreferredSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(402, 401));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton1.setActionCommand("jButton2");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton2.setActionCommand("jButton3");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton4.setActionCommand("jButton5");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton5.setActionCommand("jButton6");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton6.setActionCommand("jButton4");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton7.setActionCommand("jButton8");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton8.setActionCommand("jButton9");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButton9.setActionCommand("jButton7");
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void highlightButtons(JButton b1, JButton b2, JButton b3) {
        b1.setBackground(Color.GREEN);
        b2.setBackground(Color.GREEN);
        b3.setBackground(Color.GREEN);
    }
    
    private void checkSituation() {
        if (counter < 9) {    
        if ("X".equals(jButton3.getText()) && "X".equals(jButton1.getText()) && "X".equals(jButton2.getText())) {
            highlightButtons(jButton3, jButton1, jButton2);
            showMessageDialog(null, "X wins!");
            clearAll();
        }
        if ("X".equals(jButton4.getText()) && "X".equals(jButton5.getText()) && "X".equals(jButton6.getText())) {
            highlightButtons(jButton4, jButton5, jButton6);
            showMessageDialog(null, "X wins!");
            clearAll();
        }
        if ("X".equals(jButton7.getText()) && "X".equals(jButton8.getText()) && "X".equals(jButton9.getText())) {
            highlightButtons(jButton7, jButton8, jButton9);
            showMessageDialog(null, "X wins!");
            clearAll();
        }
        if ("X".equals(jButton3.getText()) && "X".equals(jButton6.getText()) && "X".equals(jButton9.getText())) {
            highlightButtons(jButton3, jButton6, jButton9);
            showMessageDialog(null, "X wins!");
            clearAll();
        }
        if ("X".equals(jButton1.getText()) && "X".equals(jButton4.getText()) && "X".equals(jButton7.getText())) {
            highlightButtons(jButton1, jButton4, jButton7);
            showMessageDialog(null, "X wins!");
            clearAll();
        }
        if ("X".equals(jButton2.getText()) && "X".equals(jButton5.getText()) && "X".equals(jButton8.getText())) {
            highlightButtons(jButton2, jButton5, jButton8);
            showMessageDialog(null, "X wins!");
            clearAll();
        }
        if ("X".equals(jButton3.getText()) && "X".equals(jButton4.getText()) && "X".equals(jButton8.getText())) {
            highlightButtons(jButton3, jButton4, jButton8);
            showMessageDialog(null, "X wins!");
            clearAll();
        }
        if ("X".equals(jButton9.getText()) && "X".equals(jButton4.getText()) && "X".equals(jButton2.getText())) {
            highlightButtons(jButton9, jButton4, jButton2);
            showMessageDialog(null, "X wins!");
            clearAll();
        } 
        
        if ("O".equals(jButton3.getText()) && "O".equals(jButton1.getText()) && "O".equals(jButton2.getText())) {
            highlightButtons(jButton3, jButton1, jButton2);
            showMessageDialog(null, "O wins!");
            clearAll();
        }
        if ("O".equals(jButton4.getText()) && "O".equals(jButton5.getText()) && "O".equals(jButton6.getText())) {
            highlightButtons(jButton4, jButton5, jButton6);
            showMessageDialog(null, "O wins!");
            clearAll();
        }
        if ("O".equals(jButton7.getText()) && "O".equals(jButton8.getText()) && "O".equals(jButton9.getText())) {
            highlightButtons(jButton7, jButton8, jButton9);
            showMessageDialog(null, "O wins!");
            clearAll();
        }
        if ("O".equals(jButton3.getText()) && "O".equals(jButton6.getText()) && "O".equals(jButton9.getText())) {
            highlightButtons(jButton3, jButton6, jButton9);
            showMessageDialog(null, "O wins!");
            clearAll();
        }
        if ("O".equals(jButton1.getText()) && "O".equals(jButton4.getText()) && "O".equals(jButton7.getText())) {
            highlightButtons(jButton1, jButton4, jButton7);
            showMessageDialog(null, "O wins!");
            clearAll();
        }
        if ("O".equals(jButton2.getText()) && "O".equals(jButton5.getText()) && "O".equals(jButton8.getText())) {
            highlightButtons(jButton2, jButton5, jButton8);
            showMessageDialog(null, "O wins!");
            clearAll();
        }
        if ("O".equals(jButton3.getText()) && "O".equals(jButton4.getText()) && "O".equals(jButton8.getText())) {
            highlightButtons(jButton3, jButton4, jButton8);
            showMessageDialog(null, "O wins!");
            clearAll();
        }
        if ("O".equals(jButton9.getText()) && "O".equals(jButton4.getText()) && "O".equals(jButton2.getText())) {
            highlightButtons(jButton9, jButton4, jButton2);
            showMessageDialog(null, "O wins!");
            clearAll();
        } 
    } else {
        showMessageDialog(null, "Draw!");
        clearAll();
    }
}
    
    private void clearAll() {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        counter = 0;
        jButton1.setBackground(null);
        jButton2.setBackground(null);
        jButton3.setBackground(null);
        jButton4.setBackground(null);
        jButton5.setBackground(null);
        jButton6.setBackground(null);
        jButton7.setBackground(null);
        jButton8.setBackground(null);
        jButton9.setBackground(null);
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if ("".equals(jButton3.getText())) {
            if (counter % 2 == 0) {
                jButton3.setText("X");
            } else {
                jButton3.setText("O");
            }
            counter++; 
        checkSituation();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ("".equals(jButton1.getText())) {
            if (counter % 2 == 0) {
                jButton1.setText("X");
            } else {
                jButton1.setText("O");
            }
            counter++; 
        checkSituation();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ("".equals(jButton2.getText())) {
            if (counter % 2 == 0) {
                jButton2.setText("X");
            } else {
                jButton2.setText("O");
            }
            counter++; 
        checkSituation();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if ("".equals(jButton6.getText())) {
            if (counter % 2 == 0) {
                jButton6.setText("X");
            } else {
                jButton6.setText("O");
            }
            counter++; 
        checkSituation();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if ("".equals(jButton4.getText())) {
            if (counter % 2 == 0) {
                jButton4.setText("X");
            } else {
                jButton4.setText("O");
            }
            counter++; 
        checkSituation();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if ("".equals(jButton5.getText())) {
            if (counter % 2 == 0) {
                jButton5.setText("X");
            } else {
                jButton5.setText("O");
            }
            counter++; 
        checkSituation();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if ("".equals(jButton9.getText())) {
            if (counter % 2 == 0) {
                jButton9.setText("X");
            } else {
                jButton9.setText("O");
            }
            counter++; 
        checkSituation();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if ("".equals(jButton7.getText())) {
            if (counter % 2 == 0) {
                jButton7.setText("X");
            } else {
                jButton7.setText("O");
            }
            counter++; 
        checkSituation();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if ("".equals(jButton8.getText())) {
            if (counter % 2 == 0) {
                jButton8.setText("X");
            } else {
                jButton8.setText("O");
            }
            counter++; 
        checkSituation();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
