
package pa;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Image;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import static pa.UserPersonal.user;

/**
 *
 * @author USER
 */
public class menu_user extends javax.swing.JFrame {
    static  UserPersonal userr = new UserPersonal();
    public menu_user() {
        initComponents();
        LabelNama.setText(Main.namaLogin.toUpperCase());
//        scaleimage();
    }
    
//    fungsi mengecilkan size gambar icon
//    public void scaleimage(){
////        String lokasi[]={"C:\\Users\\USER\\Documents\\netbeans projek\\catatan pengeluaran\\catatan_pengeluaran\\src\\catatan_pengeluaran\\gambar\\images.png"};
////        for(int i =0; i<2;i++){
//        ImageIcon icon = new ImageIcon("C:\\Users\\USER\\Documents\\netbeans projek\\catatan pengeluaran\\catatan_pengeluaran\\src\\catatan_pengeluaran\\gambar\\images.png");
//        Image img = icon.getImage();
//        Image imgscale = img.getScaledInstance(100, 100, 100);
//        ImageIcon scaleicon = new ImageIcon(imgscale);
//        jLabel1.setIcon(scaleicon);
//        
//        icon = new ImageIcon("C:\\Users\\USER\\Documents\\netbeans projek\\catatan pengeluaran\\catatan_pengeluaran\\src\\catatan_pengeluaran\\gambar\\dragon-quest-viii-journey-of-the-cursed-king-ps2-cover.jpg");
//        img = icon.getImage();
//        imgscale = img.getScaledInstance(100, 100, 100);
//        scaleicon = new ImageIcon(imgscale);
//        jLabel2.setIcon(scaleicon);
////        }  
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        btnLogout = new java.awt.Button();
        label2 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mlihat = new java.awt.Button();
        mgoals = new java.awt.Button();
        mubah = new java.awt.Button();
        mkeuangan = new java.awt.Button();
        mkurs = new java.awt.Button();
        mhapus = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jabout = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(166, 215, 232));

        jPanel2.setBackground(new java.awt.Color(25, 55, 109));

        label1.setBackground(new java.awt.Color(255, 255, 255));

        btnLogout.setBackground(new java.awt.Color(153, 153, 255));
        btnLogout.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setLabel("LOGOUT");
        btnLogout.setName("mlogout"); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        label2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selamat Datang");

        LabelNama.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        LabelNama.setForeground(new java.awt.Color(255, 255, 255));
        LabelNama.setText("NAMA USER");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USER");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MENU UTAMA");

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

        mgoals.setBackground(new java.awt.Color(25, 55, 109));
        mgoals.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mgoals.setForeground(new java.awt.Color(255, 255, 255));
        mgoals.setLabel("GOALS");
        mgoals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mgoalsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mgoalsMouseExited(evt);
            }
        });
        mgoals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgoalsActionPerformed(evt);
            }
        });

        mubah.setBackground(new java.awt.Color(25, 55, 109));
        mubah.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        mubah.setForeground(new java.awt.Color(255, 255, 255));
        mubah.setLabel("UBAH AKUN");
        mubah.setName("mubah"); // NOI18N
        mubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mubahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mubahMouseExited(evt);
            }
        });
        mubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mubahActionPerformed(evt);
            }
        });

        mkeuangan.setBackground(new java.awt.Color(25, 55, 109));
        mkeuangan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mkeuangan.setForeground(new java.awt.Color(255, 255, 255));
        mkeuangan.setLabel("MONEY MANAJER");
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

        mhapus.setBackground(new java.awt.Color(25, 55, 109));
        mhapus.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        mhapus.setForeground(new java.awt.Color(255, 255, 255));
        mhapus.setLabel("HAPUS AKUN");
        mhapus.setName("mhapus"); // NOI18N
        mhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mhapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mhapusMouseExited(evt);
            }
        });
        mhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mlihat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mgoals, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mubah, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mkeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(LabelNama)
                    .addComponent(jLabel4)
                    .addComponent(mkurs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mhapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mkurs, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(mlihat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mgoals, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mubah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mkeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(265, 365));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ABOUT");

        jabout.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jabout);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(101, 101, 101))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 461, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mhapusMouseEntered
        jabout.setText("merupakan menu yang berfungsi untuk menghapus akun, hati hati dalam menekan ini jika tidak mau kehilangan akun anda");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); 
        mhapus.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_mhapusMouseEntered

    private void mgoalsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgoalsMouseEntered
        jabout.setText("merupakan menu yang berguna untuk menyimpan atau mencatat goals atau tujuan yang kita inginkan, sehingga dapat menjadi reminder untuk kita");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);mgoals.setBackground(Color.WHITE);
    }//GEN-LAST:event_mgoalsMouseEntered

    private void mubahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mubahMouseEntered
        jabout.setText("merupakan menu yang berfungsi untuk mengubah data akun");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); mubah.setBackground(Color.WHITE);
    }//GEN-LAST:event_mubahMouseEntered

    private void mkursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkursActionPerformed
    
    }//GEN-LAST:event_mkursActionPerformed

    private void mkursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkursMouseEntered
        jabout.setText("merupakan menu yang berfungsi sebagai converter mata uang yang kita inginkan");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); mkurs.setBackground(Color.WHITE);
    }//GEN-LAST:event_mkursMouseEntered

    private void mlihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlihatActionPerformed
        new menu_akun().setVisible(true);
       
        try {
            userr.LihatAkun();
        } catch (IOException ex) {
            Logger.getLogger(menu_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
                    
    }//GEN-LAST:event_mlihatActionPerformed

    private void mlihatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlihatMouseEntered
        jabout.setText("merupakan menu yang akan menampilkan informasi mengenai data diri atau data akun");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);mlihat.setBackground(Color.WHITE);
    }//GEN-LAST:event_mlihatMouseEntered

    private void mkeuanganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkeuanganMouseEntered
        jabout.setText("merupakan menu yang akan akan berisi fitur fitur untuk memanajement keuangan");
        jabout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);mkeuangan.setBackground(Color.WHITE);
    }//GEN-LAST:event_mkeuanganMouseEntered

    private void mlihatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mlihatMouseExited
        mlihat.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mlihatMouseExited

    private void mgoalsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mgoalsMouseExited
        // TODO add your handling code here:
        mgoals.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mgoalsMouseExited

    private void mubahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mubahMouseExited
        // TODO add your handling code here:
        mubah.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mubahMouseExited

    private void mkeuanganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkeuanganMouseExited
        // TODO add your handling code here:
        mkeuangan.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mkeuanganMouseExited

    private void mkursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkursMouseExited
        // TODO add your handling code here:
        mkurs.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mkursMouseExited

    private void mhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mhapusMouseExited
        // TODO add your handling code here:
        mhapus.setBackground(new Color(25,55,109));
    }//GEN-LAST:event_mhapusMouseExited

    private void mgoalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgoalsActionPerformed

        // TODO add your handling code here:
        new GoalGUI().setVisible(true);
        
        
    }//GEN-LAST:event_mgoalsActionPerformed

    private void mubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mubahActionPerformed
        // TODO add your handling code here:
        new menu_ubah().setVisible(true);
        for (int i=0; i <  user.size(); i++){
            if (Main.idlogin.equals(user.get(i).getId_user())){
               
                menu_ubah.txtNama.setText(user.get(i).getNama());
                menu_ubah.txtNomorHp.setText(user.get(i).getNomorhp());
                menu_ubah.txtAlamat.setText(user.get(i).getAlamat());
                menu_ubah.txtUsername.setText(user.get(i).getUsername());
                menu_ubah.txtpass.setText(user.get(i).getPass());

            }
        }
        this.dispose();
    }//GEN-LAST:event_mubahActionPerformed

    private void mkeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkeuanganActionPerformed
        // TODO add your handling code here:
        new menu_keuangan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mkeuanganActionPerformed

    private void mhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mhapusActionPerformed
        try {
            userr.HapusAkun();
        } catch (Exception ex) {
            Logger.getLogger(menu_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this,"Anda berhasil menghapus data pribadi anda");
        new menu_utama().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_mhapusActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new menu_utama().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel LabelNama;
    private java.awt.Button btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jabout;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Button mgoals;
    private java.awt.Button mhapus;
    private java.awt.Button mkeuangan;
    private java.awt.Button mkurs;
    private java.awt.Button mlihat;
    private java.awt.Button mubah;
    // End of variables declaration//GEN-END:variables
}
