public class LaFonte extends Pizza {
    private boolean hasMushrooms;
    private static int amount;

    public LaFonte(){}

    public LaFonte(double price, double weight, boolean hasMushrooms) {
        super(price, weight);
        this.hasMushrooms = hasMushrooms;
        amount++;
    }

    @Override
    public void cook() {
        System.out.println("Cooking la fonte " + amount);
    }

    @Override
    public void deliver() {
        System.out.printf("Name: Pepperoni%nPrice: %.2f%nWeight: %.2f%nHas mashrooms: %s%n", getPrice(), getWeight(), hasMushrooms ? "Yes" : "No");
    }

    public boolean isHasMushrooms() {
        return hasMushrooms;
    }

    public void setHasMushrooms(boolean hasMushrooms) {
        this.hasMushrooms = hasMushrooms;
    }

    public int getAmount() {
        return amount;
    }

}
