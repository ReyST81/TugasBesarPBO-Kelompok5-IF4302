/*
Kelompok 5 
- Reyhan Septri Asta [1301190308]
- Azka Zainur Azifa  [1301194255]
- Sabilla Suci Amini [1301194347]
*/
package Model;

public class Pelanggan {
    String nama;
    String alamat;
    String noHp;
    
    public Pelanggan (String nama, String alamat, String noHp){
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setnoHp(String noHp){
        this.noHp = noHp;
    }
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public String getnoHp(){
        return this.noHp;
    }
}
