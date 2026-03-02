package prashanth;

import java.util.ArrayList;

public class SmartHomeTemperatureApp {

    public static void main(String[] args) {

        ArrayList<Double> temperature = new ArrayList<>();

        temperature.add(26.8);
        temperature.add(30.2);
        temperature.add(22.8);
        temperature.add(29.8);

        System.out.println("Temperature Analysis");

        for (Double temp : temperature) {

            if (temp > 28.0) {
                System.out.println("High temperature alert: " + temp + " Celsius");
            } else {
                System.out.println("Normal temperature: " + temp + " Celsius");
            }
        }

        System.out.println("\nTemperature Values as String:");

        for (Double temp : temperature) {
            String value = Double.toString(temp);
            System.out.println(value);
        }
    }
}
