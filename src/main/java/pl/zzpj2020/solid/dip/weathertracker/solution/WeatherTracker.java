package pl.zzpj2020.solid.dip.weathertracker.solution;


public class WeatherTracker {
    String currentConditions;
    IAlertable rain;
    IAlertable sun;

    public WeatherTracker(IAlertable rain, IAlertable sun) {
        this.sun = sun;
        this.rain = rain;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription.compareTo("rainy") == 0) {
            String alert = rain.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription.compareTo("sunny") == 0) {
            String alert = sun.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
