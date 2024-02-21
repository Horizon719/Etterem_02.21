package etterem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class EtteremGUI extends javax.swing.JFrame {

    private final Path etelekFile = Path.of("etel.txt");
    private final Path rendelesFile = Path.of("rendeles.txt");
    
    public EtteremGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListKek = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListZold = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListFeher = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListPiros = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        btnMegrendel = new javax.swing.JButton();
        txfEtelNeve = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        spnrEtelAra = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListEtlap = new javax.swing.JList<>();
        btnEtelHozzaad = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        rdbPiros = new javax.swing.JRadioButton();
        rdbKek = new javax.swing.JRadioButton();
        rdbZold = new javax.swing.JRadioButton();
        rdbFeher = new javax.swing.JRadioButton();
        btnRendelesMent = new javax.swing.JButton();
        btnEtelekMent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Étterem");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Asztalok"));

        jLabel1.setText("Piros");

        jLabel2.setText("Kék");

        jLabel3.setText("Zöld");

        jLabel4.setText("Fehér");

        jScrollPane1.setViewportView(jListKek);

        jScrollPane2.setViewportView(jListZold);

        jScrollPane3.setViewportView(jListFeher);

        jScrollPane4.setViewportView(jListPiros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Étlap"));

        btnMegrendel.setText("Megrendel");
        btnMegrendel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegrendelActionPerformed(evt);
            }
        });

        jLabel5.setText("Étel neve:");

        spnrEtelAra.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        jLabel6.setText("Étel ára:");

        jListEtlap.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Babgulyás|4000", "Rántott sajt|2000", "Sültkrumpli|500" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jListEtlap);

        btnEtelHozzaad.setText("Étel hozzáadása");
        btnEtelHozzaad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtelHozzaadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addGap(93, 93, 93))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfEtelNeve, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnrEtelAra, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMegrendel)
                            .addComponent(btnEtelHozzaad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMegrendel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfEtelNeve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrEtelAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEtelHozzaad))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Asztal kiválasztása:"));

        buttonGroup1.add(rdbPiros);
        rdbPiros.setText("Piros");

        buttonGroup1.add(rdbKek);
        rdbKek.setText("Kék");

        buttonGroup1.add(rdbZold);
        rdbZold.setText("Zöld");

        buttonGroup1.add(rdbFeher);
        rdbFeher.setText("Fehér");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbPiros, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbKek)
                .addGap(18, 18, 18)
                .addComponent(rdbZold)
                .addGap(18, 18, 18)
                .addComponent(rdbFeher)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbPiros)
                    .addComponent(rdbKek)
                    .addComponent(rdbFeher)
                    .addComponent(rdbZold))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRendelesMent.setText("Rendelés mentése");
        btnRendelesMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendelesMentActionPerformed(evt);
            }
        });

        btnEtelekMent.setText("Ételek mentése");
        btnEtelekMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtelekMentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEtelekMent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRendelesMent))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEtelekMent)
                            .addComponent(btnRendelesMent))
                        .addGap(16, 16, 16)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMegrendelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegrendelActionPerformed
        DefaultListModel dflm = new DefaultListModel();
        String[] etelPluszAr = jListEtlap.getSelectedValue().split("\\|");
        String elem = etelPluszAr[0];
        if(rdbPiros.isSelected()){
            meglevoListahozAd(jListPiros.getModel(), dflm, elem);
            jListPiros.setModel(dflm);
        }else if(rdbKek.isSelected()){
            meglevoListahozAd(jListKek.getModel(), dflm, elem);
            jListKek.setModel(dflm);
        }else if(rdbZold.isSelected()){
            meglevoListahozAd(jListZold.getModel(), dflm, elem);
            jListZold.setModel(dflm);
        }else if(rdbFeher.isSelected()){
            meglevoListahozAd(jListFeher.getModel(), dflm, elem);
            jListFeher.setModel(dflm);
        }else{
            JOptionPane.showMessageDialog(null, "Nem választott asztalt!");
        }
    }//GEN-LAST:event_btnMegrendelActionPerformed

    private void btnEtelHozzaadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtelHozzaadActionPerformed
        if (!"".equals(txfEtelNeve.getText()) && txfEtelNeve != null) {
            DefaultListModel dflm = new DefaultListModel();
            ListModel lm = jListEtlap.getModel();
            String elem = txfEtelNeve.getText() + "|" + spnrEtelAra.getValue().toString();
            meglevoListahozAd(lm, dflm, elem);
            jListEtlap.setModel(dflm);
        } else {
            JOptionPane.showMessageDialog(null, "Az étel neve nem lehet üres!");
        }
    }//GEN-LAST:event_btnEtelHozzaadActionPerformed

    private void btnEtelekMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtelekMentActionPerformed
        deleteAndCreateFile(etelekFile);
        ListModel lm = jListEtlap.getModel();
        String txt = "";
        for (int i = 0; i < lm.getSize(); i++) {
            txt += lm.getElementAt(i) + "\n";
        }
        byte[] bytes = txt.getBytes();
        writeFile(etelekFile, bytes);
    }//GEN-LAST:event_btnEtelekMentActionPerformed

    private void btnRendelesMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendelesMentActionPerformed
        deleteAndCreateFile(rendelesFile);
        String txt = "";
        DefaultListModel dflm = new DefaultListModel(); 
        
        dflm.add(0, "Piros"); 
        listatMasol(jListPiros.getModel(), dflm); 
        dflm.add(dflm.getSize(), ""); 
        dflm.add(dflm.getSize(), "Kék"); 
        listatMasol(jListKek.getModel(), dflm);
        dflm.add(dflm.getSize(), ""); 
        dflm.add(dflm.getSize(), "Zöld"); 
        listatMasol(jListZold.getModel(), dflm); 
        dflm.add(dflm.getSize(), ""); 
        dflm.add(dflm.getSize(), "Fehér"); 
        listatMasol(jListFeher.getModel(), dflm);
        dflm.add(dflm.getSize(), "");
        
        for (int i = 0; i < dflm.getSize(); i++) {
            txt += dflm.getElementAt(i) + "\n";
        }
        
        byte[] bytes = txt.getBytes();
        writeFile(rendelesFile, bytes);
    }//GEN-LAST:event_btnRendelesMentActionPerformed

    
    private void meglevoListahozAd(ListModel lm, DefaultListModel dflm, String elem) {
        listatMasol(lm, dflm);
        if (dflm.contains(elem)) {
            JOptionPane.showMessageDialog(null, "Nem lehet egy étel kétszer!");
        }else{
            dflm.addElement(elem);
        }
    }
    
    
    private void listatMasol(ListModel lm, DefaultListModel dflm) {
        for (int i = 0; i < lm.getSize(); i++) {
            dflm.add(i, lm.getElementAt(i));
        }
    }
    
    private void writeFile(Path path, byte[] bytes) {
        try {
            Files.write(path, bytes, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            Logger.getLogger(EtteremGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteAndCreateFile(Path path) {
        if(Files.exists(path)){
            try {
                Files.delete(path);
            } catch (IOException ex) {
                Logger.getLogger(EtteremGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            Files.createFile(path);
        } catch (IOException ex) {
            Logger.getLogger(EtteremGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(EtteremGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtteremGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtteremGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtteremGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtteremGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEtelHozzaad;
    private javax.swing.JButton btnEtelekMent;
    private javax.swing.JButton btnMegrendel;
    private javax.swing.JButton btnRendelesMent;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListEtlap;
    private javax.swing.JList<String> jListFeher;
    private javax.swing.JList<String> jListKek;
    private javax.swing.JList<String> jListPiros;
    private javax.swing.JList<String> jListZold;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton rdbFeher;
    private javax.swing.JRadioButton rdbKek;
    private javax.swing.JRadioButton rdbPiros;
    private javax.swing.JRadioButton rdbZold;
    private javax.swing.JSpinner spnrEtelAra;
    private javax.swing.JTextField txfEtelNeve;
    // End of variables declaration//GEN-END:variables
}
