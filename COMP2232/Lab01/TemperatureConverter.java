public class TemperatureConverter {
    public TemperatureConverter() { }

    /**
     * This converts the temperature from Celcius to Fahrenheit
     * @param temperature
     * @return 
     */
    public double fahrenheitConverter(double temperature) {
        return ((9.0/5.0) * temperature) + 32;
    }
    /**
     * This converts the temperature from Fahrenheit to Celcius
     * @param temperature
     * @return 
     */
    public double calciusConverter(double temperature) {
        return ((temperature - 32) * 5.0/9.0);
    }
}