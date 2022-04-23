public class TestHuman {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.move();
        human1.job();


        Bob bob1 = new Bob();
        bob1.move();
        bob1.job();

        Joe joe1 = new Joe();
        joe1.move();
        joe1.job();
        System.out.println("Hello");

    }
}
