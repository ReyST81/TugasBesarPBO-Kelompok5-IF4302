/*
Kelompok 5 
- Reyhan Septri Asta [1301190308]
- Azka Zainur Azifa  [1301194255]
- Sabilla Suci Amini [1301194347]
*/
package View;

import Controller.DatabaseService;
import Model.Service;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormService extends javax.swing.JFrame {
    static DatabaseService db;
    static DefaultTableModel model;
    
    public FormService() {
        initComponents();
        db = new DatabaseService();
        model = new DefaultTableModel();
        
        this.btnBayar.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Barang = new javax.swing.JLabel();
        Merk = new javax.swing.JLabel();
        Kerusakan = new javax.swing.JLabel();
        Sistem_Operasi = new javax.swing.JLabel();
        Uk_layar = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();
        btnHp = new javax.swing.JRadioButton();
        btnLaptop = new javax.swing.JRadioButton();
        teksMerk = new javax.swing.JTextField();
        Jenis_Keyboard = new javax.swing.JLabel();
        teksKerusakan = new javax.swing.JTextField();
        teksSisop = new javax.swing.JTextField();
        teksLayar = new javax.swing.JTextField();
        teksKeyboard = new javax.swing.JTextField();
        btnDaftar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableService = new javax.swing.JTable();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Barang.setText("Barang");

        Merk.setText("Merk");

        Kerusakan.setText("Kerusakan");

        Sistem_Operasi.setText("Sistem Operasi");

        Uk_layar.setText("Ukuran Layar");

        btnBayar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnHp);
        btnHp.setText("Hp");
        btnHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHpActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnLaptop);
        btnLaptop.setText("Laptop");
        btnLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaptopActionPerformed(evt);
            }
        });

        teksMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksMerkActionPerformed(evt);
            }
        });

        Jenis_Keyboard.setText("Jenis Keyboard");

        teksKerusakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksKerusakanActionPerformed(evt);
            }
        });

        teksKeyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksKeyboardActionPerformed(evt);
            }
        });

        btnDaftar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDaftar.setText("Daftar");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Barang)
                    .addComponent(Uk_layar)
                    .addComponent(Merk)
                    .addComponent(Kerusakan)
                    .addComponent(Sistem_Operasi)
                    .addComponent(Jenis_Keyboard))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnHp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnLaptop))
                    .addComponent(teksMerk)
                    .addComponent(teksKerusakan)
                    .addComponent(teksSisop)
                    .addComponent(teksLayar)
                    .addComponent(teksKeyboard))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Barang)
                    .addComponent(btnHp)
                    .addComponent(btnLaptop))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Merk)
                    .addComponent(teksMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kerusakan)
                    .addComponent(teksKerusakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sistem_Operasi)
                    .addComponent(teksSisop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Uk_layar)
                    .addComponent(teksLayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teksKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jenis_Keyboard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("FORM SERVICE");

        tableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Barang", "Kerusakan", "Total Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        tableService.getTableHeader().setReorderingAllowed(false);
        tableService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableServiceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableService);

        btnKembali.setText("< Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(118, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKembali))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        tableService.getSelectedRow();
        JOptionPane.showMessageDialog(null, "Berhasil Bayar");
        System.exit(0);
    }//GEN-LAST:event_btnBayarActionPerformed

    private void teksKerusakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksKerusakanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksKerusakanActionPerformed

    private void teksKeyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksKeyboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksKeyboardActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        DataPelanggan pelanggan = new DataPelanggan();
        pelanggan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        int id = this.getID();
        String barang = this.getBarang();
        String merk = this.getMerk();
        String kerusakan = this.getKerusakan();
        String Sisop = this.getSisop();
        String Uk_layar = this.getUk_layar();
        String Jenis_Keyboard = this.getJenis_Keyboard();
        String Pembayaran = this.getPembayaran();
        
        if (btnHp.isSelected()) {
            
            if (barang.isEmpty() || merk.isEmpty() || kerusakan.isEmpty() || Sisop.isEmpty()
                || Uk_layar.isEmpty()){
                this.showMessage("Data Masih Kosong!", "Error", 0);
            }else{
                Jenis_Keyboard = "Null" ;
                db.addFormService(new Service(id, barang, merk, kerusakan, Sisop, 
                        Uk_layar, Jenis_Keyboard, Pembayaran)
                );
                this.showMessage("Data Berhasil Disave", "Success", 1);
                
                
            }
        } else {
            if (barang.isEmpty() || merk.isEmpty() || kerusakan.isEmpty() || Sisop.isEmpty()
                || Uk_layar.isEmpty() || Jenis_Keyboard.isEmpty()){
                this.showMessage("Data Masih Kosong!", "Error", 0);
            } else {
                db.addFormService(new Service(id, barang, merk, kerusakan, Sisop, 
                Uk_layar,Jenis_Keyboard, Pembayaran));
//                this.reset();
                this.showMessage("Data Berhasil Disave", "Success", 1);
                
            }
        }
        db.loadFormService();
        loadTable();
        
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btnHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHpActionPerformed
        if(btnHp.isSelected()){
            btnLaptop.setSelected(false);
            teksKeyboard.setVisible(false);
            Jenis_Keyboard.setVisible(false);
          
        }
    }//GEN-LAST:event_btnHpActionPerformed

    private void btnLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaptopActionPerformed
        if(btnLaptop.isSelected()){
            btnHp.setSelected(false);
            teksKeyboard.setVisible(true);
            Jenis_Keyboard.setVisible(true);
        }
    }//GEN-LAST:event_btnLaptopActionPerformed

    private void teksMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksMerkActionPerformed

    private void tableServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableServiceMouseClicked
//        DefaultTableModel model = (DefaultTableModel)tableService.getModel();
//        int selectedRowIndex = tableService.getSelectedRow();
//        
//        model.getValueAt(selectedRowIndex, 0).toString();
//        model.getValueAt(selectedRowIndex, 1).toString();
//        model.getValueAt(selectedRowIndex, 2).toString();
//        model.getValueAt(selectedRowIndex, 3).toString();
          if(evt.getClickCount()==1){
            this.btnBayar.setEnabled(true);
        }
    }//GEN-LAST:event_tableServiceMouseClicked

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
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Barang;
    private javax.swing.JLabel Jenis_Keyboard;
    private javax.swing.JLabel Kerusakan;
    private javax.swing.JLabel Merk;
    private javax.swing.JLabel Sistem_Operasi;
    private javax.swing.JLabel Uk_layar;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JRadioButton btnHp;
    private javax.swing.JButton btnKembali;
    private javax.swing.JRadioButton btnLaptop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableService;
    private javax.swing.JTextField teksKerusakan;
    private javax.swing.JTextField teksKeyboard;
    private javax.swing.JTextField teksLayar;
    private javax.swing.JTextField teksMerk;
    private javax.swing.JTextField teksSisop;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnKembali() {return btnKembali;}
    public JButton getBtnDaftar() {return btnDaftar;}
    public JButton getBtnBayar() {return btnBayar;}
    
    public void loadTable(){
        tableService.setRowSelectionAllowed(true);
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Barang", "Kerusakan", "Total Harga"}, 0);
        ArrayList<Service> form = db.getService();
        for (Service s : form) {
            model.addRow(new Object[]{s.getId(), s.getNama_Barang(), s.getKerusakan(), s.getPembayaran()});
        }
        this.settable(model);
    }
    
    public void setBarang(String x){
        if (x == "Hp"){
            btnHp.setSelected(true);
            btnLaptop.setSelected(false);
        }else{
            btnHp.setSelected(false);
            btnLaptop.setSelected(true);
        }
    }
    
    String bayar;
    int i = 0;
    
    public void setID(int x){
        i++;
    }
    public void setMerk(String x){teksMerk.setText(x);}
    public void setKerusakan(String x){teksKerusakan.setText(x);}
    public void setSisop(String x){teksSisop.setText(x);}
    public void setUk_layar(String x){teksLayar.setText(x);}
    public void setJenis_Keyboard(String x){teksKeyboard.setText(x);}
    public void settable(DefaultTableModel x){tableService.setModel(x);}
    public void setPembayaran(String x){
        if(this.getBarang() == "Hp"){
            bayar = "100000";
        } else {
            bayar = "500000";
        }
    }
    
    public String getBarang(){
        if (btnHp.isSelected()) 
            return "Hp";
        else if (btnLaptop.isSelected())return "Laptop";
        return null;
    }
    
    public int getID(){
        return i;
    }
    public String getMerk(){return teksMerk.getText();}
    public String getKerusakan(){return teksKerusakan.getText();}
    public String getSisop(){return teksSisop.getText();}
    public String getUk_layar(){return teksLayar.getText();}
    public String getJenis_Keyboard(){return teksKeyboard.getText();}
    public JTable getTable() {return tableService;}
    public String getPembayaran(){
        if(this.getBarang() == "Hp"){
            bayar = "100000";
        } else {
            bayar = "500000";
        }
        return bayar;
    }
    
    public int getSelectedTable(){return tableService.getSelectedRow();}
    public void addActionListener(ActionListener x){
        btnDaftar.addActionListener(x);
        btnBayar.addActionListener(x);
    }
    
    public void addMouseAdapter(MouseAdapter x){
        tableService.addMouseListener(x);
    }
    
    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
}
