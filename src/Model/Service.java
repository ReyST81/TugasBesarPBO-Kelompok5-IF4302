/*
Kelompok 5 
- Reyhan Septri Asta [1301190308]
- Azka Zainur Azifa  [1301194255]
- Sabilla Suci Amini [1301194347]
*/

package Model;

public class Service {
    int id;
    String Nama_Barang,Merk, Kerusakan,Sisop, Jenis_Keyboard, Uk_layar, Pembayaran;
    
    public Service(int id, String Nama_Barang, String Merk, String Kerusakan, String Sisop,
        String Uk_layar, String Jenis_Keyboard, String Pembayaran){
        this.id = id;
        this.Nama_Barang = Nama_Barang;
        this.Merk = Merk;
        this.Kerusakan = Kerusakan;
        this.Sisop = Sisop;
        this.Jenis_Keyboard = Jenis_Keyboard;
        this.Uk_layar = Uk_layar;
        this.Pembayaran = Pembayaran;
    }
    
    public void setId(int Id){this.id = Id;}
    public void setNama_Barang(String Nama_Barang){this.Nama_Barang = Nama_Barang;}
    public void setMerk(String Merk){this.Merk = Merk;}
    public void setKerusakan(String Kerusakan){this.Kerusakan = Kerusakan;}
    public void setSisop(String Sisop){this.Sisop = Sisop;}
    public void setJenis_Keyboard(String Jenis_Keyboard){this.Jenis_Keyboard = Jenis_Keyboard;}
    public void setUk_layar(String Uk_layar){this.Uk_layar = Uk_layar;}
    public void setPembayaran(String Pembayaran){this.Pembayaran = Pembayaran;}
    
    public int getId(){return id;}
    public String getNama_Barang(){return Nama_Barang;}
    public String getMerk(){return Merk;}
    public String getKerusakan(){return Kerusakan;}
    public String getSisop(){return Sisop;}
    public String getJenis_Keyboard(){return Jenis_Keyboard;}
    public String getUk_layar(){return Uk_layar;}
    public String getPembayaran(){return Pembayaran;}
    
}
