public class WoodcuttingAxe<T extends Wood> implements Stack<T> {
    private T wood;
    private String weapon;

    public WoodcuttingAxe(T wood, String weapon) {
        this.wood = wood;
        this.weapon = weapon;
    }

    @Override
    public void interact() {
        System.out.println("Cutting " + wood.getType() + " wood with " + weapon + ".");
    }

    @Override
    public String weapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

}
