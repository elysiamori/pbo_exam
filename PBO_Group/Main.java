public class Main {
    public static void main(String[] args) {
        // Object & Class
        Circle circle = new Circle("Red", 7);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.getArea());
        
        // Inheritance
        Car car = new Car("Toyota");
        car.start();
        
        // Encapsulation
        circle.setColor("Blue");
        System.out.println("Circle color: " + circle.getColor());
        
        // Abstract Class
        Vehicle vehicle = new Car("Honda");
        vehicle.start();
        
        // Immutable Object
        Point<Integer> point = new Point<>(10, 500);
        System.out.println("Point: (" + point.getX() + ", " + point.getY() + ")");
        
        // Generic & Interface
        Stack<Integer> stack = new ArrayStack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
