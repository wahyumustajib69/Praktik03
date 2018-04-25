package praktik03;
public class SepedaMotor extends Sepeda {
    private String jenismotor;
    
    void throttle(){
        System.out.println("Ngeeeng....");
    }

    public String getJenismotor() {
        return jenismotor;
    }

    public void setJenismotor(String jenismotor) {
        this.jenismotor = jenismotor;
    }
    
}
