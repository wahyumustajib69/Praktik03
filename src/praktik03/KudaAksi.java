package praktik03;
public class KudaAksi {
    public static void main(String[] args) {
        Kuda x = new Kuda();
        x.setJenis("SUMBAWA");
        x.setWarna("HITAM");
        x.setHarga(100);
        //x.setLari (Hanya Milik Kuda Balap)
        
        x.cetakinfo();
        System.out.println("CARA 2=========");
        System.out.println("Jenis: ");
        System.out.println(x.getJenis());
        System.out.println("Warna: ");
        System.out.println(x.getWarna());
        System.out.println("Harga: ");
        System.out.println(x.getHarga());
        
        KudaBalap kb = new KudaBalap();
        kb.setJenis("EROPA");
        kb.setWarna("COKLAT");
        kb.setHarga(200);
        kb.setLari("BALAP");
        kb.cetakinfo();
        System.out.println("FUNGSI \t\t: "+kb.getLari());
        kb.manuver();
    }
}
