/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PAPBO;

/**
 *
 * @author acer
 */
public class hehe {
    
}

/*


package com.mycompany.PAPBO;

import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class register extends javax.swing.JFrame {
    
    public register() {
        initComponents();
        jPaneldata.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        jPaneldata.add(rnohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 240, 30));

        rselesai.setBackground(new java.awt.Color(87, 108, 189));
        rselesai.setForeground(new java.awt.Color(255, 255, 255));
        rselesai.setLabel("SELESAI");
        rselesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rselesaiMouseClicked(evt);
            }
        });
        jPaneldata.add(rselesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 240, 39));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Alamat");
        jPaneldata.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nomor Hp");
        jPaneldata.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nama");
        jPaneldata.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

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
    }// </editor-fold>                        

    private void rlogin2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }                                    

    private void rlogin1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        login login = new login();
        login.setVisible(true);
        this.dispose();
    }                                       

    private void rnamaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void ralamatActionPerformed(java.awt.event.ActionEvent evt) {                                        

    }                                       

    private void rnohpActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void rselesaiMouseClicked(java.awt.event.MouseEvent evt) {                                      
        jPaneldata.setVisible(false);
        jPanelregist.setVisible(true);
    }                                     

    private void rpasswordMouseClicked(java.awt.event.MouseEvent evt) {                                       
        rpassword.setText("");
    }                                      

    private void rusername1MouseClicked(java.awt.event.MouseEvent evt) {                                        
        rusername1.setText("");
    }                                       

    private void rdatadiriActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jPanelregist.setVisible(false);
        jPaneldata.setVisible(true);        
    }                                         

    private void rregister2ActionPerformed(java.awt.event.ActionEvent evt) {                                           

        if(rusername1.getText().equals("") || rpassword.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "data diri harus diisi", "WARNING", 0);
        }
        
        else if(rnama.getText().equals("") || ralamat.getText().equals("") || rnohp.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "data diri harus diisi", "WARNING", 0);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "berhasil mendaftar");
        }
    }                                          

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPaneldata;
    private javax.swing.JPanel jPanelregist;
    private java.awt.TextField ralamat;
    private java.awt.Button rdatadiri;
    private java.awt.Button rlogin1;
    private javax.swing.JLabel rlogin2;
    private java.awt.TextField rnama;
    private java.awt.TextField rnohp;
    private java.awt.TextField rpassword;
    private java.awt.Button rregister1;
    private java.awt.Button rregister2;
    private java.awt.Button rselesai;
    private java.awt.TextField rusername1;
    // End of variables declaration                   

}

*/
