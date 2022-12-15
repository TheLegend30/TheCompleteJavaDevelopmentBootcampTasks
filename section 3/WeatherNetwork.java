public class WeatherNetwork {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        int temp = -5;

        String forecast = "";

        if (temp <= -1) {
            System.out.println("It's FREEZING! Stay home!");
        } else if (temp <= 10) {
            System.out.println("It's Chilly. Wear a coat!");
        } else {
            System.out.println("It's warm. go outside!");
        }

        System.out.println(forecast);
    }
}
