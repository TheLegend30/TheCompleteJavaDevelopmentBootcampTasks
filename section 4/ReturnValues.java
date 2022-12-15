public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(1.2, 2);
        double area2 = calculateArea(1.5, 2);
        double area3 = calculateArea(2, 5);

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String italianExplanation = explainArea("Italian");

        printArea(1, 2, 2);
    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid dimensions!");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
                return "Language not available";
        }
    }

    public static void printArea(double length, double width, double area) {
        System.out.println(
                "A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area);
    }
}
