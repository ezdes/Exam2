public class Circle {
    private int radius;
    private final static double PI = 3.14;
    private static int amount;

    public Circle(){

    }

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = PI * Math.pow(radius, 2);

        if (area % 3 == 0){
            amount++;
        }

        return area;
    }


    public static int getAmount() {
        return amount;
    }

}
