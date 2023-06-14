public class Main {
    public static void main(String[] args) {
         // Object & Class
        Detail detail = new Detail("brown", 10, 4);
        System.out.println("Wood color: " + detail.getColor());
        System.out.println("Wood volume: " + detail.getArea());
        
        // Inheritance
        Tropical tropical = new Tropical("Mahogany");
        System.out.println("Wood type: " + tropical.getType());
        tropical.start();
        
        // Encapsulation
        detail.setColor("Dark Brown");
        System.out.println("detail color: " + detail.getColor());
        
        // Abstract Class
        Wood wood = new Tropical("Teak");
        System.out.println("Wood type: " + wood.getType());
        wood.start();
        
       // Immutable Object
        Size<Integer> size = new Size<>(10, 50);
        System.out.println("(length: " + size.getX() + ") (width: " + size.getY() + ")");
        
        // Generic & Interface
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weapon: ");
        String weapon = scanner.nextLine();

        WoodcuttingAxe<Tropical> woodcuttingAxe = new WoodcuttingAxe<>(tropical, weapon);

        woodcuttingAxe.interact();
        System.out.println(woodcuttingAxe.weapon());  

        scanner.close();
    }
}