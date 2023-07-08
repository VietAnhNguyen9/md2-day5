package AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public Circle() {
    }
    public  Circle(double r) {
        this.radius = r;
    }
}
