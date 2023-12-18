public class GeometricalShape {
    private double width;
    private double height;
    public GeometricalShape() {
        this.width = 0.0;
        this.height = 0.0;
    }
    public GeometricalShape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public double calculateArea() {
        return this.width * this.height;
    }
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }
    private boolean isValidDimensions() {
        return (this.width > 0 && this.height > 0);
    }
    public boolean isShapeValid() {
        return isValidDimensions();
    }

    public static void main(String[] args) {
        GeometricalShape shape1 = new GeometricalShape(); 
        GeometricalShape shape2 = new GeometricalShape(5.0, 3.0);
        System.out.println("Shape 1 - Width: " + shape1.getWidth() + ", Height: " + shape1.getHeight());
        System.out.println("Shape 1 - Area: " + shape1.calculateArea());
        System.out.println("Shape 1 - Perimeter: " + shape1.calculatePerimeter());
        System.out.println("Shape 1 - Valid? " + shape1.isShapeValid());
        System.out.println("\nShape 2 - Width: " + shape2.getWidth() + ", Height: " + shape2.getHeight());
        System.out.println("Shape 2 - Area: " + shape2.calculateArea());
        System.out.println("Shape 2 - Perimeter: " + shape2.calculatePerimeter());
        System.out.println("Shape 2 - Valid? " + shape2.isShapeValid());
    }
}
