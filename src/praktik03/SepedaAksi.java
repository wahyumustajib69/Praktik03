package praktik03;
public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        s.setMerk("Kupu-Kupu");
        s.setWarna("MERAH");
        s.setHarga(1000);
        //s.jenismotor gak bisa karena hanya dimiliki oleh sepeda motor
                
        s.cetakinfo();
        System.out.println("====================");
        System.out.print("Merknya    : ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya   : ");
        System.out.println(s.getWarna());
        System.out.print("Harganya   : ");
        System.out.println(s.getHarga());
        System.out.println("====================");
        SepedaMotor sm = new SepedaMotor();
        sm.setMerk("Nodha");
        sm.setWarna("Biru");
        sm.setHarga(10000);
        sm.setJenismotor("Listrik");
        sm.cetakinfo();
        System.out.println("Jenis    : "+sm.getJenismotor());
        sm.throttle();
        
    }
}
