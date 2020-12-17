import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Circle[] circles = new Circle[10];
        int radius;

        for (int i = 0; i < circles.length; i++){
            radius = random.nextInt(10 - 1 + 1) + 1;
            circles[i] = new Circle(radius);

            System.out.printf("The areas: %.2f%n",  circles[i].getArea());
        }

        System.out.println();
        System.out.println("The number of areas that can be divided by 3: " + Circle.getAmount());
    }
}
