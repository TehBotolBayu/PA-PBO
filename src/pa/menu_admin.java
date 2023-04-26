package pa;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pa.menu_user.userr;



public class menu_admin extends javax.swing.JFrame {
    public menu_admin() {
        new MyDB();
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mgoals = new java.awt.Button();
        mlihat = new java.awt.Button();
        mkurs = new java.awt.Button();
        mkeuangan = new java.awt.Button();

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
        jLabel2.setText("Selamat datang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("nama admin");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("admin");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("menu utama");

        mgoals.setActionCommand("Data User");
        mgoals.setBackground(new java.awt.Color(25, 55, 109));
        mgoals.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mgoals.setForeground(new java.awt.Color(255, 255, 255));
        mgoals.setLabel("Data User");
        mgoals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgoalsActionPerformed(evt);
            }
        });

        mlihat.setBackground(new java.awt.Color(25, 55, 109));
        mlihat.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mlihat.setForeground(new java.awt.Color(255, 255, 255));
        mlihat.setLabel("lihat akun");
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
        mkurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkursActionPerformed(evt);
            }
        });

        mkeuangan.setBackground(new java.awt.Color(25, 55, 109));
        mkeuangan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mkeuangan.setForeground(new java.awt.Color(255, 255, 255));
        mkeuangan.setLabel("PEMBUKUAN");
        mkeuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mkeuanganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mkeuanganMouseExited(evt);
            }
        });
        mkeuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkeuanganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mkurs, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mlihat, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mgoals, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(rregister5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mkeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
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
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addComponent(mgoals, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mlihat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mkurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mkeuangan, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addComponent(rregister5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(532, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void mlihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlihatActionPerformed
        MyDB.move(userr);
        new menu_ubah().setVisible(true);
        for (int i=0; i <  Main.admin.size(); i++){
            if (Main.idlogin.equals(Main.admin.get(i).getId_user())){               
                menu_ubah.txtNama.setText(Main.admin.get(i).getNamaAdmin());
                menu_ubah.txtNomorHp.setText(Main.admin.get(i).getNomorhp());
                menu_ubah.txtAlamat.setText(Main.admin.get(i).getAlamat());
                menu_ubah.txtUsername.setText(Main.admin.get(i).getUsername());
                menu_ubah.txtpass.setText(Main.admin.get(i).getPass());

            }
        }
        
    }//GEN-LAST:event_mlihatActionPerformed

    private void mkursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkursActionPerformed
        new menuKonversi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mkursActionPerformed

    private void mgoalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgoalsActionPerformed
        // TODO add your handling code here:
        new daftar_user().setVisible(true);
    }//GEN-LAST:event_mgoalsActionPerformed

    private void rregister5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rregister5ActionPerformed
        // TODO add your handling code here:
        new menu_utama().setVisible(true);
    }//GEN-LAST:event_rregister5ActionPerformed

    private void mkeuanganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkeuanganMouseEntered
//        jabout.setText("merupakan menu yang akan akan berisi fitur fitur untuk memanajement keuangan");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);mkeuangan.setBackground(Color.WHITE);
    }//GEN-LAST:event_mkeuanganMouseEntered

    private void mkeuanganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkeuanganMouseExited
        // TODO add your handling code here:
        mkeuangan.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mkeuanganMouseExited

    private void mkeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkeuanganActionPerformed
        // TODO add your handling code here:
        new menu_keuangan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mkeuanganActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Button mgoals;
    private java.awt.Button mkeuangan;
    private java.awt.Button mkurs;
    private java.awt.Button mlihat;
    private java.awt.Button rregister5;
    // End of variables declaration//GEN-END:variables
}
