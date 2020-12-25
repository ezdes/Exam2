public class Pizza {
    private double price;
    private double weight;

    public Pizza(){}

    public Pizza(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    public void cook(){
        System.out.println("Cooking pizza...");
    }

    public void deliver(){
        System.out.println("Price: " + price + "\n" + "Weight: " + weight);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
