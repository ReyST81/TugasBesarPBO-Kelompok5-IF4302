/*
Kelompok 5 
- Reyhan Septri Asta [1301190308]
- Azka Zainur Azifa  [1301194255]
- Sabilla Suci Amini [1301194347]
*/

package Controller;
import Model.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class DatabasePelanggan {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Pelanggan> pelanggan = new ArrayList();
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/serviceelektronik";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabasePelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabasePelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabasePelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadPelanggan() {
        connect();
        try {
            String query = "SELECT * FROM datapelanggan";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                pelanggan.add(new Pelanggan(rs.getString("nama"), rs.getString("noHp"), rs.getString("alamat")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabasePelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Pelanggan> getPelanggan() {
        return pelanggan;
    }
    
    public void addPelanggan(Pelanggan p) {
        connect();
        String query = "INSERT INTO DataPelanggan(nama, nohp, alamat) VALUES"
                + "( '" + p.getNama() 
                + "','" + p.getnoHp() 
                + "','" + p.getAlamat()
                + "')  ";
        
        manipulate(query);
        disconnect();
    }
}
