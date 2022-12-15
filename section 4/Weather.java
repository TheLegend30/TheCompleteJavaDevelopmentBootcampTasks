public class Weather {
    public static void main(String[] args) {
        double noon = 77; // temperature at noon in fahrenheit.
        double evening = 61; // temperature during the evening in fahrenheit
        double midnight = 55; // temperature at midnight in fahrenheit

        double noonCelsius = fahrenheitToCelsius(noon);
        double eveningCelsius = fahrenheitToCelsius(evening);
        double midnightCelsius = fahrenheitToCelsius(midnight);

        printTemperature(noon, noonCelsius);
        printTemperature(evening, eveningCelsius);
        printTemperature(midnight, midnightCelsius);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void printTemperature(double fahrenheit, double celsius) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + celsius);
    }
}
