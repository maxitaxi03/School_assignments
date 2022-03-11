public class TemperatureConverter {
    public TemperatureConverter() { }

    /**
     * This converts the temperature from Celcius to Fahrenheit
     * @param temperature
     * @return 
     */
    public double fahrenheitConverter(double temperature) {
        return round(((9.0/5.0) * temperature) + 32, 2);
    }
    /**
     * This converts the temperature from Fahrenheit to Celcius
     * @param temperature
     * @return 
     */
    public double calciusConverter(double temperature) {
        return round(((temperature - 32) * 5.0/9.0), 2);
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}