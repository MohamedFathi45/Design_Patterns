
public class CurrentConditionsDisplay implements Display , Observer{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weather) {
		this.weatherData = weather;
		weatherData.registerOberver(this);
	}
	
	@Override
	public void update(Subject sub , Object args) {
		if(sub instanceof WeatherData) {
			WeatherData weather = (WeatherData)sub;
			this.temperature = weather.getTempreture();
			this.humidity = weather.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature+ "F degrees and " + humidity + "% humidity");
	}

}
