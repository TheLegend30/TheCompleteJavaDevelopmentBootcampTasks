public class Parameters {
    public static void main(String[] args) {
        calculateArea(1, 2);
        calculateArea(1.5, 2);
        calculateArea(2, 5);
    }

    public static void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area: " + area);
    }
}
