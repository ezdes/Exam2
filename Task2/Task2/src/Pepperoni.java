public class Pepperoni extends Pizza {
    private boolean isSpicy;
    private static int amount;

    public Pepperoni(){}

    public Pepperoni(double price, double weight, boolean isSpicy) {
        super(price, weight);
        this.isSpicy = isSpicy;
        amount++;
    }

    @Override
    public void cook(){
        System.out.println("Cooking pepperoni " + amount);
    }

    @Override
    public void deliver(){
        System.out.printf("Name: Pepperoni%nPrice: %.2f%nWeight: %.2f%nIs Spicy: %s%n", getPrice(), getWeight(), isSpicy ? "Yes" : "No");
    }


    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public static int getAmount() {
        return amount;
    }
}
