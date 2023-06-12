// Contoh kelas turunan dengan inheritance
public class Wood extends Shape {
    private double radius;
    private double height;
    
    public Wood(String color, double radius, double height) {
        super(color);
        this.radius = radius;
        this.height = height;
    }
    
    public double getradius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getheight() {
        return height;
    }
    
    public void setRadius(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
