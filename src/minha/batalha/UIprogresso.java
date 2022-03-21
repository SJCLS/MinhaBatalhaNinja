package minha.batalha;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UIprogresso extends javax.swing.JFrame {

    public UIprogresso() {
        initComponents();
        
        
        new Thread() {

            public void run() {
                for (int i = 0; i < 101; i++) {
                    barraprogresso.setValue(i);
                    
                    try {
                        sleep (100);
                        
                        if (i == 100){
                            
                            UIninja1 ninja = new UIninja1();
                            dispose();
                            ninja.setVisible(true);
                            
                        
                        }
                        
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UIprogresso.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jiraya = new javax.swing.JLabel();
        barraprogresso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jiraya.setForeground(new java.awt.Color(204, 0, 0));
        jiraya.setIcon(new javax.swing.ImageIcon("C:\\Users\\manut\\Pictures\\Saved Pictures\\batalha\\1svxjiraya.gif")); // NOI18N

        barraprogresso.setBackground(new java.awt.Color(204, 0, 0));
        barraprogresso.setForeground(new java.awt.Color(204, 0, 0));
        barraprogresso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barraprogresso.setRequestFocusEnabled(false);
        barraprogresso.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jiraya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barraprogresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jiraya, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(barraprogresso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIprogresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIprogresso().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraprogresso;
    private javax.swing.JLabel jiraya;
    // End of variables declaration//GEN-END:variables
}
