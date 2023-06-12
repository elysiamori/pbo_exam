// Contoh kelas turunan dari kelas abstrak
public class Tropical extends Wood {
    public Tropical(String type) {
        super(type);
    }
    
    @Override
    public void start() {
        System.out.println("Loaded tropical wood...");
    }
}