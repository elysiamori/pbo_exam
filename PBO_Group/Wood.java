// Contoh kelas abstrak
public abstract class Wood {
    private String type;
    
    public Wood(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public abstract void start();
}
