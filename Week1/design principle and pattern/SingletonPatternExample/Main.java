public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Program Started");
        logger2.log("Data Saved");

        System.out.println("Logger1: " + logger1);
        System.out.println("Logger2: " + logger2);

        System.out.println("Same Object? " + (logger1 == logger2));
    }
}