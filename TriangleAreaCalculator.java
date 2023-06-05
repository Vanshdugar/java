// Program for calculating area of triangle
public class TriangleAreaCalculator{
    public static void main(String[] args) {
        double base = 5.0; // Predefined base length
        double height = 3.0; // Predefined height

        double area = calculateTriangleArea(base, height);
        System.out.println("The area of the triangle is: " + area);
    }

    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}