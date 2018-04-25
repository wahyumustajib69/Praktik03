package praktik03;

/**
 *
 * @author WAHYU'S PC
 */
public class Sepeda {
    private String merk;
    private String warna;
    private double harga;
    
    void cetakinfo(){
        System.out.println("Merk     : "+merk);
        System.out.println("Warna    : "+warna);
        System.out.println("Harga    : "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
