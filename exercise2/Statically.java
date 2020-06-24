package exercise2;

public class Statically {
    // Once you have finished getting statistically.js to run, refactor the code
    // here in Java.
    private static String glue = "Epoxy";
    private static String jello = "Jello";

    public void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        System.out.println("Please don't make me change... I just don't like it...");
    }

    public void explain() {
        System.out.println(
                "Unlike Java, static methods in javascript are used to create utility functions for an application, static methods have no access to data stored in specific objects");

    }

    public void glueAndJello() {
        System.out.println(glue);
        System.out.println(jello);
    }

    public static void main(String[] args) {
        Statically stats = new Statically();
        stats.moveAndShake();
        Statically.stubborn();
        stats.explain();
        stats.glueAndJello();

    }
}
