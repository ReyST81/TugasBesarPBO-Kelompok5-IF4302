/*
Kelompok 5 
- Reyhan Septri Asta [1301190308]
- Azka Zainur Azifa  [1301194255]
- Sabilla Suci Amini [1301194347]
*/
package Controller;

import View.FormService;
import Model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public abstract class ControllerService extends MouseAdapter implements ActionListener {
    private FormService view;
    private DatabaseService db;
    
    public ControllerService() {
        view = new FormService();
        db = new DatabaseService();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        loadTable();
        
    }
    
    public void loadTable(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Barang", "Kerusakan", "Total Harga"}, 0);
        ArrayList<Service> form = db.getService();
        for (Service s : form) {
            model.addRow(new Object[]{s.getId(), s.getNama_Barang(), s.getKerusakan(), s.getPembayaran()});
        }
        view.settable(model);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnKembali())){
            loadTable();
        }else if (source.equals(view.getBtnDaftar())){
            btnDaftarActionPerformed();
            loadTable();
        }
    }
    
    public void btnDaftarActionPerformed(){
        int id = view.getID();
        String barang = view.getBarang();
        String merk = view.getMerk();
        String kerusakan = view.getKerusakan();
        String Sisop = view.getSisop();
        String Uk_layar = view.getUk_layar();
        String Jenis_Keyboard = view.getJenis_Keyboard();
        String Pembayaran = view.getPembayaran();
        
        if (barang.isEmpty() || merk.isEmpty() || kerusakan.isEmpty() || Sisop.isEmpty()
                || Uk_layar.isEmpty() || Jenis_Keyboard.isEmpty()){
            view.showMessage("Data Masih Kosong!", "Error", 0);
        }else{
            db.addFormService(new Service(id, barang, merk, kerusakan, Sisop, 
            Jenis_Keyboard, Uk_layar, Pembayaran));
            view.showMessage("Data Berhasil Disave", "Success", 1);
            }
        }
    
    public void btnBayarActionPerformed(){
        int id = view.getID();
        String barang = view.getBarang();
        String merk = view.getMerk();
        String kerusakan = view.getKerusakan();
        String Sisop = view.getSisop();
        String Uk_layar = view.getUk_layar();
        String Jenis_Keyboard = view.getJenis_Keyboard();
        String Pembayaran = view.getPembayaran();
        
        if (barang.isEmpty() || merk.isEmpty() || kerusakan.isEmpty() || Sisop.isEmpty()
                || Uk_layar.isEmpty() || Jenis_Keyboard.isEmpty()){
            view.showMessage("Data Masih Kosong!", "Error", 0);
        }else{
            db.addFormService(new Service(id, barang, merk, kerusakan, Sisop, 
            Jenis_Keyboard, Uk_layar, Pembayaran));
            view.showMessage("Data Berhasil Disave", "Success", 1);
            }
        }
}
