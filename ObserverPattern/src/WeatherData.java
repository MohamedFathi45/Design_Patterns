import java.util.ArrayList;

public class WeatherData implements Subject{
	ArrayList<Observer> observers; 
	private float tempereture;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void notityObservers() {
		for (Observer o : observers) {
			o.update(this ,null);
		}
	}

	@Override
	public void registerOberver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	public void measurementsChanged() {
		notityObservers();
	}
	public void setMeasurements(float tempreture , float humidity , float pressure) {
		this.tempereture = tempreture;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	public float getTempreture() {
		return tempereture;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPerssure() {
		return pressure;
	}
}
