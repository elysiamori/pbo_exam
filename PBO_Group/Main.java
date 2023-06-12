public class Main {
    public static void main(String[] args) {
         // Object & Class
        Wood circle = new Wood("brown", 10, 4);
        System.out.println("Wood color: " + circle.getColor());
        System.out.println("Wood volume: " + circle.getArea());
        
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
        Size<Integer> size = new Size<>(10, 50);
        System.out.println("(length: " + size.getX() + ") (width: " + size.getY() + ")");
        
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
