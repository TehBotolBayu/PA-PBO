package pa;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import static pa.UserPersonal.no_urut;

/**
 *
 * @author acer
 */
public class register extends javax.swing.JFrame {
    
    public register() {
        new MyDB();
        initComponents();
        jPaneldata.setVisible(false);
        no_urut();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPaneldata = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ralamat = new java.awt.TextField();
        rnama = new java.awt.TextField();
        rnohp = new java.awt.TextField();
        rselesai = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctipe = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanelregist = new javax.swing.JPanel();
        rregister2 = new java.awt.Button();
        rpassword = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        rlogin1 = new java.awt.Button();
        rregister1 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        rlogin2 = new javax.swing.JLabel();
        rusername1 = new java.awt.TextField();
        rdatadiri = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(166, 215, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPaneldata.setBackground(new java.awt.Color(255, 255, 255));
        jPaneldata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Data Diri");
        jPaneldata.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        ralamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ralamatActionPerformed(evt);
            }
        });
        jPaneldata.add(ralamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 240, 30));

        rnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnamaActionPerformed(evt);
            }
        });
        jPaneldata.add(rnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 240, 30));

        rnohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnohpActionPerformed(evt);
            }
        });
        rnohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rnohpKeyTyped(evt);
            }
        });
        jPaneldata.add(rnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 240, 30));

        rselesai.setBackground(new java.awt.Color(87, 108, 189));
        rselesai.setForeground(new java.awt.Color(255, 255, 255));
        rselesai.setLabel("SELESAI");
        rselesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rselesaiMouseClicked(evt);
            }
        });
        jPaneldata.add(rselesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 240, 39));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Daftar Sebagai :");
        jPaneldata.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nomor Hp");
        jPaneldata.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nama");
        jPaneldata.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        ctipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Akun Reguler", "Akun Bisnis" }));
        jPaneldata.add(ctipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 240, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Alamat");
        jPaneldata.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jPanel1.add(jPaneldata, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -70, 530, 430));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jPanelregist.setBackground(new java.awt.Color(255, 255, 255));
        jPanelregist.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rregister2.setBackground(new java.awt.Color(87, 108, 189));
        rregister2.setForeground(new java.awt.Color(255, 255, 255));
        rregister2.setLabel("register");
        rregister2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rregister2ActionPerformed(evt);
            }
        });

        rpassword.setText("PASSWORD");
        rpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rpasswordMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("register");

        rlogin1.setBackground(new java.awt.Color(240, 240, 240));
        rlogin1.setLabel("Login");
        rlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rlogin1ActionPerformed(evt);
            }
        });

        rregister1.setBackground(new java.awt.Color(87, 108, 189));
        rregister1.setForeground(new java.awt.Color(255, 255, 255));
        rregister1.setLabel("Register");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("SUDAH PUNYA AKUN ?");
        jLabel3.setToolTipText("");

        rlogin2.setBackground(new java.awt.Color(253, 141, 237));
        rlogin2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rlogin2.setForeground(new java.awt.Color(87, 108, 189));
        rlogin2.setText("LOGIN");
        rlogin2.setToolTipText("");
        rlogin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rlogin2MouseClicked(evt);
            }
        });

        rusername1.setText("USERNAME");
        rusername1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rusername1MouseClicked(evt);
            }
        });

        rdatadiri.setBackground(new java.awt.Color(204, 0, 51));
        rdatadiri.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rdatadiri.setForeground(new java.awt.Color(255, 255, 255));
        rdatadiri.setLabel("data diri");
        rdatadiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdatadiriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelregistLayout = new javax.swing.GroupLayout(jPanelregist);
        jPanelregist.setLayout(jPanelregistLayout);
        jPanelregistLayout.setHorizontalGroup(
            jPanelregistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelregistLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelregistLayout.createSequentialGroup()
                .addGroup(jPanelregistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelregistLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rdatadiri, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelregistLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanelregistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelregistLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rlogin2)
                                .addGap(0, 122, Short.MAX_VALUE))
                            .addComponent(rregister2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelregistLayout.createSequentialGroup()
                                .addComponent(rlogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)
                                .addComponent(rregister1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanelregistLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelregistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rusername1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        jPanelregistLayout.setVerticalGroup(
            jPanelregistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelregistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanelregistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rlogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rregister1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(rdatadiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(rpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(rregister2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelregistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rlogin2)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanelregist, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rlogin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rlogin2MouseClicked
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rlogin2MouseClicked

    private void rlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rlogin1ActionPerformed
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rlogin1ActionPerformed

    private void rnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnamaActionPerformed

    private void ralamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ralamatActionPerformed

    }//GEN-LAST:event_ralamatActionPerformed

    private void rnohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnohpActionPerformed

    private void rselesaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rselesaiMouseClicked
        jPaneldata.setVisible(false);
        jPanelregist.setVisible(true);
    }//GEN-LAST:event_rselesaiMouseClicked

    private void rpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rpasswordMouseClicked
        rpassword.setText("");
    }//GEN-LAST:event_rpasswordMouseClicked

    private void rusername1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rusername1MouseClicked
        rusername1.setText("");
    }//GEN-LAST:event_rusername1MouseClicked

    private void rdatadiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdatadiriActionPerformed
        jPanelregist.setVisible(false);
        jPaneldata.setVisible(true);        
    }//GEN-LAST:event_rdatadiriActionPerformed

    private void rregister2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rregister2ActionPerformed
//        JOptionPane.showMessageDialog(rootPane, Main.bisnis.get(Main.bisnis.size()-1).getId(), "WARNING", 0);
        if(rusername1.getText().equals("") || rpassword.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "data diri harus diisi", "WARNING", 0);
        }
        
        else if(ctipe.getSelectedIndex() == -1){
             JOptionPane.showMessageDialog(rootPane, "data diri harus diisi", "WARNING", 0);
        }
        
        else if(rnama.getText().equals("") || ralamat.getText().equals("") || rnohp.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "data diri harus diisi", "WARNING", 0);
        }
        else{
            if(ctipe.getSelectedIndex() == 0){
                for(int i=0; i <  Main.user.size(); i++){
                    if (rusername1.getText().equals(Main.user.get(i).getUsername())){
                        JOptionPane.showMessageDialog(rootPane, "Username sudah terdaftar");
                        return;
                    }
                }
                for(int i=0; i <  Main.bisnis.size(); i++){
                    if (rusername1.getText().equals(Main.bisnis.get(i).getUsername())){
                        JOptionPane.showMessageDialog(rootPane, "Username sudah terdaftar");
                        return;
                    }
                }
                UserPersonal userr = new UserPersonal();
                try {
                    userr.register();
                } catch (IOException ex) {
                    Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(rootPane, "Berhasil mendaftar");
            } else {
                for(int i=0; i <  Main.bisnis.size(); i++){
                    if (rusername1.getText().equals(Main.bisnis.get(i).getUsername())){
                        JOptionPane.showMessageDialog(rootPane, "Username sudah terdaftar");
                        return;
                    }
                }
                for(int i=0; i <  Main.user.size(); i++){
                    if (rusername1.getText().equals(Main.user.get(i).getUsername())){
                        JOptionPane.showMessageDialog(rootPane, "Username sudah terdaftar");
                        return;
                    }
                }
                Bisnis bis = new Bisnis();
                try {
                    bis.register();
                } catch (IOException ex) {
                    Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(rootPane, "Berhasil mendaftar");                
            }
        }
    }//GEN-LAST:event_rregister2ActionPerformed

    private void rnohpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rnohpKeyTyped

         char karakter = evt.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(rootPane, "Harap Masukin Angka");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_rnohpKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ctipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPaneldata;
    private javax.swing.JPanel jPanelregist;
    public static java.awt.TextField ralamat;
    private java.awt.Button rdatadiri;
    private java.awt.Button rlogin1;
    private javax.swing.JLabel rlogin2;
    public static java.awt.TextField rnama;
    public static java.awt.TextField rnohp;
    public static java.awt.TextField rpassword;
    private java.awt.Button rregister1;
    private java.awt.Button rregister2;
    private java.awt.Button rselesai;
    public static java.awt.TextField rusername1;
    // End of variables declaration//GEN-END:variables

}
