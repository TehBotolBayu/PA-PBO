package pa;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pa.menu_bisnis.bisniss;
import static pa.menu_user.userr;



public class menu_admin extends javax.swing.JFrame {
    public menu_admin() {
        new MyDB();
        initComponents();
        LabelNama.setText(Main.namaLogin.toUpperCase());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        rregister5 = new java.awt.Button();
        label2 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DataUserBisnis = new java.awt.Button();
        mlihat = new java.awt.Button();
        mkurs = new java.awt.Button();
        mgoals1 = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jabout1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(166, 215, 232));

        jPanel2.setBackground(new java.awt.Color(25, 55, 109));

        label1.setBackground(new java.awt.Color(255, 255, 255));

        rregister5.setBackground(new java.awt.Color(153, 153, 255));
        rregister5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        rregister5.setForeground(new java.awt.Color(0, 0, 0));
        rregister5.setLabel("LOGOUT");
        rregister5.setName("mlogout"); // NOI18N
        rregister5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rregister5ActionPerformed(evt);
            }
        });

        label2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selamat Datang");

        LabelNama.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        LabelNama.setForeground(new java.awt.Color(255, 255, 255));
        LabelNama.setText("NAMA ADMIN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADMIN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MENU UTAMA");

        DataUserBisnis.setActionCommand("Data User");
        DataUserBisnis.setBackground(new java.awt.Color(25, 55, 109));
        DataUserBisnis.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        DataUserBisnis.setForeground(new java.awt.Color(255, 255, 255));
        DataUserBisnis.setLabel("Data User Bisnis");
        DataUserBisnis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DataUserBisnisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DataUserBisnisMouseExited(evt);
            }
        });
        DataUserBisnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataUserBisnisActionPerformed(evt);
            }
        });

        mlihat.setBackground(new java.awt.Color(25, 55, 109));
        mlihat.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mlihat.setForeground(new java.awt.Color(255, 255, 255));
        mlihat.setLabel("LIHAT AKUN");
        mlihat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mlihatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mlihatMouseExited(evt);
            }
        });
        mlihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlihatActionPerformed(evt);
            }
        });

        mkurs.setBackground(new java.awt.Color(25, 55, 109));
        mkurs.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mkurs.setForeground(new java.awt.Color(255, 255, 255));
        mkurs.setLabel("KURS");
        mkurs.setName("mkurs"); // NOI18N
        mkurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mkursMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mkursMouseExited(evt);
            }
        });
        mkurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkursActionPerformed(evt);
            }
        });

        mgoals1.setActionCommand("Data User");
        mgoals1.setBackground(new java.awt.Color(25, 55, 109));
        mgoals1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mgoals1.setForeground(new java.awt.Color(255, 255, 255));
        mgoals1.setLabel("Data User");
        mgoals1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mgoals1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mgoals1MouseExited(evt);
            }
        });
        mgoals1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgoals1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(rregister5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(LabelNama)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mgoals1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mlihat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mkurs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DataUserBisnis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(mgoals1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mlihat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mkurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataUserBisnis, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(rregister5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(265, 365));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ABOUT");

        jabout1.setEditable(false);
        jabout1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(jabout1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(101, 101, 101))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgoals1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgoals1ActionPerformed
        new data_user().setVisible(true);
        data_user.tampil(userr);
        this.dispose();
    }//GEN-LAST:event_mgoals1ActionPerformed

    private void mgoals1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgoals1MouseExited
        // TODO add your handling code here:
        mgoals1.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mgoals1MouseExited

    private void mgoals1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgoals1MouseEntered
        // TODO add your handling code here:
        mgoals1.setBackground(Color.WHITE);
        jabout1.setText("merupakan menu yang berfungsi untuk melihat data user");
        jabout1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    }//GEN-LAST:event_mgoals1MouseEntered

    private void mkursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkursActionPerformed
        new menuKonversi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mkursActionPerformed

    private void mkursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkursMouseExited
        // TODO add your handling code here:
        mkurs.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mkursMouseExited

    private void mkursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkursMouseEntered
        // TODO add your handling code here:
        mkurs.setBackground(Color.WHITE);
        jabout1.setText("merupakan menu yang berfungsi untuk konversi mata uang");
        jabout1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    }//GEN-LAST:event_mkursMouseEntered

    private void mlihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlihatActionPerformed
        MyDB.move(userr);
        new menu_akun().setVisible(true);
        menu_akun.txtDataLogin.setText("Admin".toUpperCase());
        Admin.LihatAkun();
        this.dispose();

    }//GEN-LAST:event_mlihatActionPerformed

    private void mlihatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlihatMouseExited
        // TODO add your handling code here:
        mlihat.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mlihatMouseExited

    private void mlihatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlihatMouseEntered
        // TODO add your handling code here:
        jabout1.setText("merupakan menu yang berfungsi untuk manajemen akun admin");
        jabout1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        mlihat.setBackground(Color.WHITE);
    }//GEN-LAST:event_mlihatMouseEntered

    private void DataUserBisnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataUserBisnisActionPerformed
        // TODO add your handling code here:
        new data_user().setVisible(true);
        data_user.tampil(bisniss);
        this.dispose();
    }//GEN-LAST:event_DataUserBisnisActionPerformed

    private void DataUserBisnisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataUserBisnisMouseExited
        // TODO add your handling code here:
        DataUserBisnis.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_DataUserBisnisMouseExited

    private void DataUserBisnisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataUserBisnisMouseEntered
        // TODO add your handling code here:
        jabout1.setText("merupakan menu yang berfungsi untuk melihat data user bisnis");
        jabout1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        DataUserBisnis.setBackground(Color.WHITE);
    }//GEN-LAST:event_DataUserBisnisMouseEntered

    private void rregister5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rregister5ActionPerformed
        // TODO add your handling code here:
        new menu_utama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rregister5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button DataUserBisnis;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jabout;
    private javax.swing.JTextPane jabout1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Button mgoals1;
    private java.awt.Button mkurs;
    private java.awt.Button mlihat;
    private java.awt.Button rregister5;
    // End of variables declaration//GEN-END:variables
}
