package us.inest.app.dp.observer;

public class WeatherData {
    private double temperature;
    private double humidity;
    private double pressure;

    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    /*
     * This method gets called whenever the weather measurements have been updated
     */
    public void measurementsChanged() {
        double t = getTemperature();
        double h = getHumidity();
        double p = getPressure();

        currentConditionsDisplay.update(t, h, p);
        statisticsDisplay.update(t, h, p);
        forecastDisplay.update(t, h, p);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

}
