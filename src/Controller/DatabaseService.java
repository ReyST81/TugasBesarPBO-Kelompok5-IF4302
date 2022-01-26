/*
Kelompok 5 
- Reyhan Septri Asta [1301190308]
- Azka Zainur Azifa  [1301194255]
- Sabilla Suci Amini [1301194347]
*/

package Controller;

import Model.Service;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseService {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Service> service = new ArrayList();
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/serviceelektronik";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadFormService() {
        connect();
        try {
            String query = "SELECT * FROM formservice";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                service.add(new Service(rs.getInt("id"),rs.getString("Nama_Barang"), rs.getString("Merk"), rs.getString("Kerusakan"), 
                        rs.getString("Sisop"), rs.getString("Uk_layar"),rs.getString("Jenis_Keyboard"), rs.getString("Pembayaran")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Service> getService() {
        return service;
    }
    
    public void addFormService(Service s) {
        connect();
        String query = "INSERT INTO formservice (Nama_Barang, Merk, Kerusakan, Sisop, Uk_layar, Jenis_Keyboard, Pembayaran) VALUES"
//                + "( '" + s.getId()
                + "( '" + s.getNama_Barang()
                + "','" + s.getMerk()
                + "','" + s.getKerusakan()
                + "','" + s.getSisop()
                + "','" + s.getUk_layar()
                + "','" + s.getJenis_Keyboard()
                + "','" + s.getPembayaran()
                + "') ";
        
        manipulate(query);
    }
}


