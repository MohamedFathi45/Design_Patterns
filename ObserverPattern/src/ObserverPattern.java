
public class ObserverPattern {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(12, 13, 14);
		weatherData.setMeasurements(14, 15, 16);
		weatherData.setMeasurements(17, 18, 19);
		
	}
}
