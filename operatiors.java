import java.lang.Math;

abstract class Shape {
    public abstract double area();
    public abstract double volume();
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double area() {
        return length * width;
    }
    
    public double volume() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double volume() {
        return 0;
    }
}

class Sphere extends Shape {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
    
    public double volume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class operators {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.area());

        Circle circle = new Circle(4);
        System.out.println("Circle Area: " + circle.area());

        Sphere sphere = new Sphere(5);
        System.out.println("Sphere Area: " + sphere.area());
        System.out.println("Sphere Volume: " + sphere.volume());

        Cylinder cylinder = new Cylinder(3, 8);
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}
