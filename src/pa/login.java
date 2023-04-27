package pa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    static ArrayList<UserPersonal> user = Main.user;
    static ArrayList<Admin> admin = Main.admin;
    static ArrayList<Bisnis> bisnis = Main.bisnis;
    
    public login() {
        new MyDB();
        initComponents();
        
    }
    
    public void navigatelogin(){
        register register = new register();
        register.setVisible(true);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        llogin2 = new java.awt.Button();
        lusername = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        llogin1 = new java.awt.Button();
        lregister1 = new java.awt.Button();
        txtRegistrasi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(166, 215, 232));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        llogin2.setBackground(new java.awt.Color(87, 108, 189));
        llogin2.setForeground(new java.awt.Color(255, 255, 255));
        llogin2.setLabel("Login");
        llogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llogin2ActionPerformed(evt);
            }
        });

        lusername.setText("USERNAME");
        lusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lusernameMouseClicked(evt);
            }
        });
        lusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lusernameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        llogin1.setBackground(new java.awt.Color(87, 108, 189));
        llogin1.setForeground(new java.awt.Color(255, 255, 255));
        llogin1.setLabel("Login");

        lregister1.setLabel("Register");
        lregister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lregister1ActionPerformed(evt);
            }
        });

        txtRegistrasi.setBackground(new java.awt.Color(87, 108, 189));
        txtRegistrasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRegistrasi.setForeground(new java.awt.Color(87, 108, 189));
        txtRegistrasi.setText("DAFTAR SEKARANG");
        txtRegistrasi.setToolTipText("");
        txtRegistrasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegistrasiMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("BELUM PUNYA AKUN ?");
        jLabel3.setToolTipText("");

        lpass.setText("jPasswordField1");
        lpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lpassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistrasi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lpass, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(llogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(lregister1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(llogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lregister1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(lusername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lpass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(llogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtRegistrasi))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lusernameActionPerformed

    }//GEN-LAST:event_lusernameActionPerformed

    private void lregister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lregister1ActionPerformed
        navigatelogin();
    }//GEN-LAST:event_lregister1ActionPerformed

    private void txtRegistrasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistrasiMouseClicked
        navigatelogin();
    }//GEN-LAST:event_txtRegistrasiMouseClicked

    private void llogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llogin2ActionPerformed
        int kondisi=0;
         String username = lusername.getText();
         String pass = lpass.getText();
         
        for(int i=0; i <  user.size(); i++){
            if (username.equals(user.get(i).getUsername()) && pass.equals(user.get(i).getPass())){
                kondisi =1;
                Main.idlogin = user.get(i).getId_user();
                Main.namaLogin = user.get(i).getNama(); 
                Main.statusLogin = user.get(i).getStatus();
                new menu_user().setVisible(true);
                this.dispose();
                return;
            } 
        }
        for(int i=0; i <  admin.size(); i++){
            if (username.equals(admin.get(i).getUsername()) && pass.equals(admin.get(i).getPass())){
                kondisi =1;
                Main.idlogin = admin.get(i).getId_user();
                Main.namaLogin = admin.get(i).getNamaAdmin();
                Main.statusLogin = admin.get(i).getStatus();
                new menu_admin().setVisible(true);
                this.dispose();
                return;
            }
        }
        for(int i=0; i <  bisnis.size(); i++){
            if (username.equals(bisnis.get(i).getUsername()) && pass.equals(bisnis.get(i).getPass())){
                kondisi =1;
                Main.idlogin = bisnis.get(i).getId_user();
                Main.namaLogin = bisnis.get(i).getNamaBisnis();
                Main.statusLogin = bisnis.get(i).getStatus();
                new menu_bisnis().setVisible(true);
                this.dispose();
                return;
            }
        }
        if (kondisi==0){
            JOptionPane.showMessageDialog(this,"Password dan Username anda salah");
        }
                            

        
        
        
        
        
       
    }//GEN-LAST:event_llogin2ActionPerformed

    private void lusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lusernameMouseClicked
        lusername.setText("");
    }//GEN-LAST:event_lusernameMouseClicked

    private void lpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lpassMouseClicked
        lpass.setText("");
    }//GEN-LAST:event_lpassMouseClicked

    public static void login(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Button llogin1;
    private java.awt.Button llogin2;
    public javax.swing.JPasswordField lpass;
    private java.awt.Button lregister1;
    public java.awt.TextField lusername;
    private javax.swing.JLabel txtRegistrasi;
    // End of variables declaration//GEN-END:variables
}
