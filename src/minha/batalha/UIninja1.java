package minha.batalha;

import javax.swing.JOptionPane;

public class UIninja1 extends javax.swing.JFrame {

    public UIninja1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtninja = new javax.swing.JTextField();
        elementochakra = new javax.swing.JLabel();
        raiton = new javax.swing.JCheckBox();
        katon = new javax.swing.JCheckBox();
        fuuton = new javax.swing.JCheckBox();
        doton = new javax.swing.JCheckBox();
        suiton = new javax.swing.JCheckBox();
        classificaçãoninja = new javax.swing.JLabel();
        academia = new javax.swing.JCheckBox();
        chunin = new javax.swing.JCheckBox();
        anbu = new javax.swing.JCheckBox();
        genin = new javax.swing.JCheckBox();
        jonin = new javax.swing.JCheckBox();
        sannin = new javax.swing.JCheckBox();
        nukenin = new javax.swing.JCheckBox();
        kage = new javax.swing.JCheckBox();
        avançar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\manut\\Pictures\\Saved Pictures\\batalha\\Madara-Uchiha-8k-Ultra-HD-Wallpaper-Hintergrund- (2).jpg")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("NINJA");

        txtninja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtninjaActionPerformed(evt);
            }
        });

        elementochakra.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        elementochakra.setForeground(new java.awt.Color(204, 0, 0));
        elementochakra.setText("ELEMENTO DE CHAKRA");

        raiton.setText("RAITON");

        katon.setText("KATON");
        katon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                katonActionPerformed(evt);
            }
        });

        fuuton.setText("FUUTON");

        doton.setText("DOTON");

        suiton.setText("SUITON");

        classificaçãoninja.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        classificaçãoninja.setForeground(new java.awt.Color(204, 0, 0));
        classificaçãoninja.setText("CLASSIFICAÇÃO NINJA");

        academia.setText("Academia");

        chunin.setText("Chūnin");

        anbu.setText("Anbu");
        anbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anbuActionPerformed(evt);
            }
        });

        genin.setText("Genin");

        jonin.setText("Jōnin");

        sannin.setText("Sannin");

        nukenin.setText("Nukenin");

        kage.setText("Kage");

        avançar.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        avançar.setText("Avançar");
        avançar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 0)));
        avançar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avançarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(chunin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jonin))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(anbu)
                                        .addGap(105, 105, 105)
                                        .addComponent(sannin))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(kage)
                                        .addGap(99, 99, 99)
                                        .addComponent(nukenin))))
                            .addComponent(classificaçãoninja)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(academia)
                                .addGap(91, 91, 91)
                                .addComponent(genin))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(avançar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(elementochakra, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(katon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(raiton))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fuuton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(suiton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(doton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtninja, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtninja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(elementochakra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doton)
                            .addComponent(raiton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suiton)
                            .addComponent(katon)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(fuuton)))
                .addGap(47, 47, 47)
                .addComponent(classificaçãoninja)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(academia)
                    .addComponent(genin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chunin)
                    .addComponent(jonin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anbu)
                    .addComponent(sannin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nukenin)
                    .addComponent(kage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avançar)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtninjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtninjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtninjaActionPerformed

    private void katonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_katonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_katonActionPerformed

    private void anbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anbuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anbuActionPerformed

    private void avançarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avançarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avançarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIninja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIninja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIninja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIninja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIninja1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox academia;
    private javax.swing.JCheckBox anbu;
    private javax.swing.JButton avançar;
    private javax.swing.JCheckBox chunin;
    private javax.swing.JLabel classificaçãoninja;
    private javax.swing.JCheckBox doton;
    private javax.swing.JLabel elementochakra;
    private javax.swing.JCheckBox fuuton;
    private javax.swing.JCheckBox genin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jonin;
    private javax.swing.JCheckBox kage;
    private javax.swing.JCheckBox katon;
    private javax.swing.JCheckBox nukenin;
    private javax.swing.JCheckBox raiton;
    private javax.swing.JCheckBox sannin;
    private javax.swing.JCheckBox suiton;
    private javax.swing.JTextField txtninja;
    // End of variables declaration//GEN-END:variables
}
