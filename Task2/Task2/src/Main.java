public class Main {

    public static void main(String[] args) {

        Pepperoni pepperoni1 = new Pepperoni(400, 2, true);
        pepperoni1.cook();
        pepperoni1.deliver();

        System.out.println();

        Pepperoni pepperoni2 = new Pepperoni(300, 1.5, false);
        pepperoni2.cook();
        pepperoni2.deliver();

        System.out.println();

        Margherita margherita1 = new Margherita(500, 2, true);
        margherita1.cook();
        margherita1.deliver();

        System.out.println();

        Margherita margherita2 = new Margherita(450, 1, false);
        margherita2.cook();
        margherita2.deliver();

        System.out.println();

        LaFonte laFonte1 = new LaFonte(600, 2.5, true);
        laFonte1.cook();
        laFonte1.deliver();

        System.out.println();

        LaFonte laFonte2 = new LaFonte(500, 2, false);
        laFonte2.cook();
        laFonte2.deliver();
    }
}
