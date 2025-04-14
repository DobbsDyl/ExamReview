package ca.dobbs;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double calculateArea(double width, double height, boolean isTriangle) {
        return isTriangle ? (width * height) / 2 : width * height;
    }
    
}
