// Circle.java
public class Circle {
    // Instance variable for radius
    private double radius;

    // Constructor to set radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute the circumference of the circle
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

// CircularRegion.java
public class Circle {
    public static void main(String[] args) {
        // Define the radii of inner and outer circles
        double ri = 3.0;  // Inner radius
        double ro = 5.0;  // Outer radius

        // Create Circle objects for inner and outer circles
        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        // Compute the area of the circular region (shaded area)
        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        // Output the result
        System.out.printf("The area of the circular region is: %.2f\n", shadedArea);
    }
}
