public class Margherita extends Pizza {
    private boolean hasMeat;
    private static int amount;

    public Margherita(){}

    public Margherita(double price, double weight, boolean hasMeat) {
        super(price, weight);
        this.hasMeat = hasMeat;
        amount++;
    }

    @Override
    public void cook() {
        System.out.println("Cooking margherita " + amount);
    }

    @Override
    public void deliver() {
        System.out.printf("Name: Pepperoni%nPrice: %.2f%nWeight: %.2f%nHas meat : %s%n", getPrice(), getWeight(), hasMeat ? "Yes" : "No");
    }

    public boolean isHasMeat() {
        return hasMeat;
    }

    public void setHasMeat(boolean hasMeat) {
        this.hasMeat = hasMeat;
    }

    public static int getAmount() {
        return amount;
    }

}
