// Contoh kelas turunan dari kelas abstrak
public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    
    @Override
    public void start() {
        System.out.println("Car starting...");
    }
}