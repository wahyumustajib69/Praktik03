package praktik03;
public class Kuda {
    private String jenis,warna;
    private double harga;
    
    void cetakinfo(){
        System.out.println("Jenis Kuda \t: "+jenis+"\n"+
                "Warna \t\t: "+warna+"\n"+
                "Harga \t\t: "+harga);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
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
