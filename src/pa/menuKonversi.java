/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pa;

import java.text.DecimalFormat;

/**
 *
 * @author acer
 */
public class menuKonversi extends javax.swing.JFrame {

    /**
     * Creates new form menuKonversi
     */
    public menuKonversi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        asal = new javax.swing.JComboBox<>();
        tnominal = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        hasil = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        tujuan = new javax.swing.JComboBox<>();
        hasil1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(166, 215, 232));

        jPanel1.setBackground(new java.awt.Color(166, 215, 232));

        asal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AED (United Arab Emirates Dirham)", "AFN (Afghan Afghani)", "ALL (Albanian Lek)", "AMD (Armenian Dram)", "ANG (Netherlands Antillean Guilder)", "AOA (Angolan Kwanza)", "ARS (Argentine Peso)", "AUD (Australian Dollar)", "AWG (Aruban Florin)", "AZN (Azerbaijani Manat)", "BAM (Bosnia-Herzegovina Convertible Mark)", "BBD (Barbadian Dollar)", "BDT (Bangladeshi Taka)", "BGN (Bulgarian Lev)", "BHD (Bahraini Dinar)", "BIF (Burundian Franc)", "BMD (Bermudan Dollar)", "BND (Brunei Dollar)", "BOB (Bolivian Boliviano)", "BRL (Brazilian Real)", "BSD (Bahamian Dollar)", "BTC (Bitcoin)", "BTN (Bhutanese Ngultrum)", "BWP (Botswanan Pula)", "BYN (Belarusian Ruble)", "BYR (Belarusian Ruble)", "BZD (Belize Dollar)", "CAD (Canadian Dollar)", "CDF (Congolese Franc)", "CHF (Swiss Franc)", "CLF (Chilean Unit of Account (UF))", "CLP (Chilean Peso)", "CNY (Chinese Yuan)", "COP (Colombian Peso)", "CRC (Costa Rican Colón)", "CUC (Cuban Convertible Peso)", "CUP (Cuban Peso)", "CVE (Cape Verdean Escudo)", "CZK (Czech Republic Koruna)", "DJF (Djiboutian Franc)", "DKK (Danish Krone)", "DOP (Dominican Peso)", "DZD (Algerian Dinar)", "EGP (Egyptian Pound)", "ERN (Eritrean Nakfa)", "ETB (Ethiopian Birr)", "EUR (Euro)", "FJD (Fijian Dollar)", "FKP (Falkland Islands Pound)", "GBP (British Pound Sterling)", "GEL (Georgian Lari)", "GGP (Guernsey Pound)", "GHS (Ghanaian Cedi)", "GIP (Gibraltar Pound)", "GMD (Gambian Dalasi)", "GNF (Guinean Franc)", "GTQ (Guatemalan Quetzal)", "GYD (Guyanaese Dollar)", "HKD (Hong Kong Dollar)", "HNL (Honduran Lempira)", "HRK (Croatian Kuna)", "HTG (Haitian Gourde)", "HUF (Hungarian Forint)", "IDR (Indonesian Rupiah)", "ILS (Israeli New Sheqel)", "IMP (Manx pound)", "INR (Indian Rupee)", "IQD (Iraqi Dinar)", "IRR (Iranian Rial)", "ISK (Icelandic Króna)", "JEP (Jersey Pound)", "JMD (Jamaican Dollar)", "JOD (Jordanian Dinar)", "JPY (Japanese Yen)", "KES (Kenyan Shilling)", "KGS (Kyrgystani Som)", "KHR (Cambodian Riel)", "KMF (Comorian Franc)", "KPW (North Korean Won)", "KRW (South Korean Won)", "KWD (Kuwaiti Dinar)", "KYD (Cayman Islands Dollar)", "KZT (Kazakhstani Tenge)", "LAK (Laotian Kip)", "LBP (Lebanese Pound)", "LKR (Sri Lankan Rupee)", "LRD (Liberian Dollar)", "LSL (Lesotho Loti)", "LYD (Libyan Dinar)", "MAD (Moroccan Dirham)", "MDL (Moldovan Leu)", "MGA (Malagasy Ariary)", "MKD (Macedonian Denar)", "MMK (Myanmar Kyat)", "MNT (Mongolian Tugrik)", "MOP (Macanese Pataca)", "MRO (Mauritanian Ouguiya)", "MUR (Mauritian Rupee)", "MVR (Maldivian Rufiyaa)", "MWK (Malawian Kwacha)", "MXN (Mexican Peso)", "MYR (Malaysian Ringgit)", "MZN (Mozambican Metical)", "NAD (Namibian Dollar)", "NGN (Nigerian Naira)", "NIO (Nicaraguan Córdoba)", "NOK (Norwegian Krone)", "NPR (Nepalese Rupee)", "NZD (New Zealand Dollar)", "OMR (Omani Rial)", "PAB (Panamanian Balboa)", "PEN (Peruvian Sol)", "PGK (Papua New Guinean Kina)", "PHP (Philippine Peso)", "PKR (Pakistani Rupee)", "PLN (Polish Zloty)", "PYG (Paraguayan Guarani)", "QAR (Qatari Riyal)", "RON (Romanian Leu)", "RSD (Serbian Dinar)", "RUB (Russian Ruble)", "RWF (Rwandan Franc)", "SAR (Saudi Riyal)", "SBD (Solomon Islands Dollar)", "SCR (Seychellois Rupee)", "SDG (Sudanese Pound)", "SEK (Swedish Krona)", "SGD (Singapore Dollar)", "SHP (Saint Helena Pound)", "SLL (Sierra Leonean Leone)", "SOS (Somali Shilling)", "SRD (Surinamese Dollar)", "SSP (South Sudanese Pound)", "STD (São Tomé and Príncipe Dobra)", "SVC (Salvadoran Colón)", "SZL (Swazi Lilangeni)", "THB (Thai Baht)", "TJS (Tajikistani Somoni)", "TMT (Turkmenistan Manat)", "TND (Tunisian Dinar)", "TOP (Tongan Pa'anga)", "TRY (Turkish Lira)", "TTD (Trinidad and Tobago Dollar)", "TWD (New Taiwan Dollar)", "TZS (Tanzanian Shilling)", "UAH (Ukrainian Hryvnia)", "UGX (Ugandan Shilling)", "USD (United States Dollar)", "UYU (Uruguayan Peso)", "UZS (Uzbekistani Som)", "VES (Venezuelan Bolívar Soberano)", "VND (Vietnamese Dong)", "VUV (Vanuatu Vatu)", "WST (Samoan Tala)", "XAF (Central African CFA Franc)", "XAG (Silver Ounce)", "XAU (Gold Ounce)", "XCD (East Caribbean Dollar)", "XDR (Special Drawing Rights)", "XOF (West African CFA Franc)", "XPD (Palladium Ounce)", "XPF (CFP Franc)", "XPT (Platinum Ounce)", "YER (Yemeni Rial)", "ZAR (South African Rand)", "ZMW (Zambian Kwacha)", "ZWL (Zimbabwean Dollar)", " " }));

        jToggleButton1.setText("Konversi");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        hasil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasil.setText("0");

        label2.setText("Kurs Asal");

        label3.setText("Nominal");

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("Konversi Mata Uang");

        label5.setText("Kurs Tujuan");

        tujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AED (United Arab Emirates Dirham)", "AFN (Afghan Afghani)", "ALL (Albanian Lek)", "AMD (Armenian Dram)", "ANG (Netherlands Antillean Guilder)", "AOA (Angolan Kwanza)", "ARS (Argentine Peso)", "AUD (Australian Dollar)", "AWG (Aruban Florin)", "AZN (Azerbaijani Manat)", "BAM (Bosnia-Herzegovina Convertible Mark)", "BBD (Barbadian Dollar)", "BDT (Bangladeshi Taka)", "BGN (Bulgarian Lev)", "BHD (Bahraini Dinar)", "BIF (Burundian Franc)", "BMD (Bermudan Dollar)", "BND (Brunei Dollar)", "BOB (Bolivian Boliviano)", "BRL (Brazilian Real)", "BSD (Bahamian Dollar)", "BTC (Bitcoin)", "BTN (Bhutanese Ngultrum)", "BWP (Botswanan Pula)", "BYN (Belarusian Ruble)", "BYR (Belarusian Ruble)", "BZD (Belize Dollar)", "CAD (Canadian Dollar)", "CDF (Congolese Franc)", "CHF (Swiss Franc)", "CLF (Chilean Unit of Account (UF))", "CLP (Chilean Peso)", "CNY (Chinese Yuan)", "COP (Colombian Peso)", "CRC (Costa Rican Colón)", "CUC (Cuban Convertible Peso)", "CUP (Cuban Peso)", "CVE (Cape Verdean Escudo)", "CZK (Czech Republic Koruna)", "DJF (Djiboutian Franc)", "DKK (Danish Krone)", "DOP (Dominican Peso)", "DZD (Algerian Dinar)", "EGP (Egyptian Pound)", "ERN (Eritrean Nakfa)", "ETB (Ethiopian Birr)", "EUR (Euro)", "FJD (Fijian Dollar)", "FKP (Falkland Islands Pound)", "GBP (British Pound Sterling)", "GEL (Georgian Lari)", "GGP (Guernsey Pound)", "GHS (Ghanaian Cedi)", "GIP (Gibraltar Pound)", "GMD (Gambian Dalasi)", "GNF (Guinean Franc)", "GTQ (Guatemalan Quetzal)", "GYD (Guyanaese Dollar)", "HKD (Hong Kong Dollar)", "HNL (Honduran Lempira)", "HRK (Croatian Kuna)", "HTG (Haitian Gourde)", "HUF (Hungarian Forint)", "IDR (Indonesian Rupiah)", "ILS (Israeli New Sheqel)", "IMP (Manx pound)", "INR (Indian Rupee)", "IQD (Iraqi Dinar)", "IRR (Iranian Rial)", "ISK (Icelandic Króna)", "JEP (Jersey Pound)", "JMD (Jamaican Dollar)", "JOD (Jordanian Dinar)", "JPY (Japanese Yen)", "KES (Kenyan Shilling)", "KGS (Kyrgystani Som)", "KHR (Cambodian Riel)", "KMF (Comorian Franc)", "KPW (North Korean Won)", "KRW (South Korean Won)", "KWD (Kuwaiti Dinar)", "KYD (Cayman Islands Dollar)", "KZT (Kazakhstani Tenge)", "LAK (Laotian Kip)", "LBP (Lebanese Pound)", "LKR (Sri Lankan Rupee)", "LRD (Liberian Dollar)", "LSL (Lesotho Loti)", "LYD (Libyan Dinar)", "MAD (Moroccan Dirham)", "MDL (Moldovan Leu)", "MGA (Malagasy Ariary)", "MKD (Macedonian Denar)", "MMK (Myanmar Kyat)", "MNT (Mongolian Tugrik)", "MOP (Macanese Pataca)", "MRO (Mauritanian Ouguiya)", "MUR (Mauritian Rupee)", "MVR (Maldivian Rufiyaa)", "MWK (Malawian Kwacha)", "MXN (Mexican Peso)", "MYR (Malaysian Ringgit)", "MZN (Mozambican Metical)", "NAD (Namibian Dollar)", "NGN (Nigerian Naira)", "NIO (Nicaraguan Córdoba)", "NOK (Norwegian Krone)", "NPR (Nepalese Rupee)", "NZD (New Zealand Dollar)", "OMR (Omani Rial)", "PAB (Panamanian Balboa)", "PEN (Peruvian Sol)", "PGK (Papua New Guinean Kina)", "PHP (Philippine Peso)", "PKR (Pakistani Rupee)", "PLN (Polish Zloty)", "PYG (Paraguayan Guarani)", "QAR (Qatari Riyal)", "RON (Romanian Leu)", "RSD (Serbian Dinar)", "RUB (Russian Ruble)", "RWF (Rwandan Franc)", "SAR (Saudi Riyal)", "SBD (Solomon Islands Dollar)", "SCR (Seychellois Rupee)", "SDG (Sudanese Pound)", "SEK (Swedish Krona)", "SGD (Singapore Dollar)", "SHP (Saint Helena Pound)", "SLL (Sierra Leonean Leone)", "SOS (Somali Shilling)", "SRD (Surinamese Dollar)", "SSP (South Sudanese Pound)", "STD (São Tomé and Príncipe Dobra)", "SVC (Salvadoran Colón)", "SZL (Swazi Lilangeni)", "THB (Thai Baht)", "TJS (Tajikistani Somoni)", "TMT (Turkmenistan Manat)", "TND (Tunisian Dinar)", "TOP (Tongan Pa'anga)", "TRY (Turkish Lira)", "TTD (Trinidad and Tobago Dollar)", "TWD (New Taiwan Dollar)", "TZS (Tanzanian Shilling)", "UAH (Ukrainian Hryvnia)", "UGX (Ugandan Shilling)", "USD (United States Dollar)", "UYU (Uruguayan Peso)", "UZS (Uzbekistani Som)", "VES (Venezuelan Bolívar Soberano)", "VND (Vietnamese Dong)", "VUV (Vanuatu Vatu)", "WST (Samoan Tala)", "XAF (Central African CFA Franc)", "XAG (Silver Ounce)", "XAU (Gold Ounce)", "XCD (East Caribbean Dollar)", "XDR (Special Drawing Rights)", "XOF (West African CFA Franc)", "XPD (Palladium Ounce)", "XPF (CFP Franc)", "XPT (Platinum Ounce)", "YER (Yemeni Rial)", "ZAR (South African Rand)", "ZMW (Zambian Kwacha)", "ZWL (Zimbabwean Dollar)", " " }));

        hasil1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hasil1.setText("Hasil Konversi :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tujuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tnominal)
                                    .addComponent(asal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jToggleButton1)
                            .addComponent(hasil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tnominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        double nominal = Double.parseDouble(tnominal.getText());
        String asalkurs = asal.getSelectedItem().toString();
        asalkurs = asalkurs.substring(0, 3);
        String tujuankurs = tujuan.getSelectedItem().toString();
        tujuankurs = tujuankurs.substring(0, 3);
//        System.out.println(asalkurs+"\n"+tujuankurs+"\n"+Double.toString(nominal));
        api a = new api(asalkurs, tujuankurs, nominal);
        double h = a.konversi();
        if (h == -1){
            hasil.setText("Maaf, Nilai Kurs Belum Tersedia");
            return;
        }
        DecimalFormat df = new DecimalFormat("#.######");
        String nilai = df.format(h);
        //String nilai = Double.toString(formattedValue);
        System.out.println(nilai);
        hasil.setText(nilai);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(menuKonversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuKonversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuKonversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuKonversi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuKonversi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asal;
    private java.awt.Label hasil;
    private java.awt.Label hasil1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JTextField tnominal;
    private javax.swing.JComboBox<String> tujuan;
    // End of variables declaration//GEN-END:variables
}