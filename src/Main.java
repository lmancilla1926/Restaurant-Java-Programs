public class Main {
    public static void main(String[] args) {

        Restaurant mcdonalds = new Restaurant(
                10,
                4.6,
                15.99,
                1.8,
                "8AM - 9PM"
        );

        System.out.println(mcdonalds.waitTime);
        System.out.println(mcdonalds.rating);
        System.out.println(mcdonalds.avgPrice);
        System.out.println(mcdonalds.distance);
        System.out.println(mcdonalds.hoursOpen);
    }
}

