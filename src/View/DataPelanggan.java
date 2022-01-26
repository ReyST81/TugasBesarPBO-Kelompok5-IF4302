/*
Kelompok 5 
- Reyhan Septri Asta [1301190308]
- Azka Zainur Azifa  [1301194255]
- Sabilla Suci Amini [1301194347]
*/
package View;

import Controller.DatabasePelanggan;
import Model.Pelanggan;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DataPelanggan extends javax.swing.JFrame {
    static DatabasePelanggan db;
    
    public DataPelanggan() {
        initComponents();
        db = new DatabasePelanggan();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        NamaPelanggan1 = new javax.swing.JLabel();
        NomorPelanggan1 = new javax.swing.JLabel();
        AlamatPelanggan1 = new javax.swing.JLabel();
        NamaField1 = new javax.swing.JTextField();
        NomorField1 = new javax.swing.JTextField();
        AlamatField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NamaPelanggan1.setText("Nama");

        NomorPelanggan1.setText("Nomor Hp.");

        AlamatPelanggan1.setText("Alamat");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data Pelanggan");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NomorPelanggan1)
                            .addComponent(NamaPelanggan1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AlamatPelanggan1)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamaField1)
                    .addComponent(NomorField1)
                    .addComponent(AlamatField1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaPelanggan1)
                    .addComponent(NamaField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomorPelanggan1)
                    .addComponent(NomorField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlamatField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlamatPelanggan1))
                .addGap(30, 30, 30)
                .addComponent(btnSubmit)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        System.out.print("Hello");
       
        String nama = this.getNama();
        String nohp = this.getNoHp();
        String alamat = this.getAlamat();
        
        if (nama.isEmpty() || nohp.isEmpty() || alamat.isEmpty()){
            this.showMessage("Data Masih Kosong!", "Error", 0);
        }else{
            db.addPelanggan(new Pelanggan(nama,nohp,alamat));
            this.reset();
            this.showMessage("Data Berhasil Disave", "Success", 1);
            
            FormService form = new FormService();
            form.setVisible(true);
            this.dispose();
            }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatField1;
    private javax.swing.JLabel AlamatPelanggan1;
    private javax.swing.JTextField NamaField1;
    private javax.swing.JLabel NamaPelanggan1;
    private javax.swing.JTextField NomorField1;
    private javax.swing.JLabel NomorPelanggan1;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnSave() {
        return btnSubmit;
    }
    
    public String getNama(){
        return NamaField1.getText();
    }
    
    public void setNama(String x){
        NamaField1.setText(x);
    }
    
    public String getNoHp(){
        return NomorField1.getText();
    }
    
    public void setNoHp(String x){
        NomorField1.setText(x);
    }
    
    public String getAlamat(){
        return AlamatField1.getText();
    }
    
    public void setAlamat(String x){
        AlamatField1.setText(x);
    }
    
    public void reset(){
        setNama("");
        setNoHp("");
        setAlamat("");
    }
    
    public void addActionListener(ActionListener x){
        btnSubmit.addActionListener(x);
    }
 
    
    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
}
