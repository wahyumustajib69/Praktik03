package praktik03;
public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        s.setMerk("Kupu-Kupu");
        s.setWarna("MERAH");
        s.setHarga(1000);
                
        s.cetakinfo();
        System.out.println("====================");
        System.out.print("Merknya    : ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya   : ");
        System.out.println(s.getWarna());
        System.out.print("Harganya   : ");
        System.out.println(s.getHarga());
        
    }
}
