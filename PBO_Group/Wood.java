// Contoh kelas abstrak
public abstract class Wood {
    private String brand;
    
    public Wood(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public abstract void start();
}
