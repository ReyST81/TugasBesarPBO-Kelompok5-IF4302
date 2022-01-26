/*
Kelompok 5 
- Reyhan Septri Asta [1301190308]
- Azka Zainur Azifa  [1301194255]
- Sabilla Suci Amini [1301194347]
*/
package Controller;

import View.DataPelanggan;
import Model.*;
import View.FormService;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public abstract class ControllerPelanggan extends MouseAdapter implements ActionListener{
    private DataPelanggan view;
    private DatabasePelanggan db;

    public ControllerPelanggan() {
        view = new DataPelanggan();
        db = new DatabasePelanggan();
        view.addActionListener(this);
        view.setVisible(true);
    }
    
    public void btnSaveActionPerformed(){
        String nama = view.getNama();
        String nohp = view.getNoHp();
        String alamat = view.getAlamat();
        
        if (nama.isEmpty() || nohp.isEmpty() || alamat.isEmpty()){
            view.showMessage("Data Masih Kosong!", "Error", 0);
        }else{
            db.addPelanggan(new Pelanggan(nama,nohp,alamat));
            view.showMessage("Data Berhasil Disave", "Success", 1);
            }
        }
    
}