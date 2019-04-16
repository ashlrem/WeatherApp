package code.oddle.app.model;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

//@Entity
public class Weather {
	
//	@Id
//	@GeneratedValue
	private Long id;
	private String cityName;
	private int cityId;
	private String weatherDate;
	private int logDate;
	private String weatherStr;
	private String temperatureK;
	private String temperatureC;
	private String temperatureF;
	private String weatherMainType;
	private String weatherIcon;
	private int pressure;
	private int humidity;
	private float windSpeed;
	
	public Weather(Long id, String cityName, int cityId, String weatherDate,
			int logDate, String weatherStr, String temperatureK, String temperatureC,
			String temperatureF, String weatherMainType, String weatherIcon,
			int pressure, int humidity, float windSpeed){
		
		this.id = id;
		this.cityName = cityName;
		this.cityId = cityId;
		this.weatherDate = weatherDate;
		this.logDate = logDate;
		this.weatherStr = weatherStr;
		this.temperatureK = temperatureK;
		this.temperatureC = temperatureC;
		this.temperatureF = temperatureF;
		this.weatherMainType = weatherMainType;
		this.weatherIcon = weatherIcon;
		this.pressure = pressure;
		this.humidity = humidity;
		this.windSpeed = windSpeed;
	}
	
	public Weather() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public int getCityId() {
		return cityId;
	}
	
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	public String getWeatherDate() {
		return weatherDate;
	}
	
	public void setWeatherDate(String weatherDate) {
		this.weatherDate = weatherDate;
	}
	
	public int getLogDate() {
		return logDate;
	}
	
	public void setLogDate(int logDate) {
		this.logDate = logDate;
	}
	
	public String getWeatherStr() {
		return weatherStr;
	}
	
	public void setWeatherStr(String weatherStr) {
		this.weatherStr = weatherStr;
	}
	
	public String getTemperatureK() {
		return temperatureK;
	}
	
	public void setTemperatureK(String temperatureK) {
		this.temperatureK = temperatureK;
	}
	
	public String getTemperatureC() {
		return temperatureC;
	}
	
	public void setTemperatureC(String temperatureC) {
		this.temperatureC = temperatureC;
	}
	
	public String getTemperatureF() {
		return temperatureF;
	}
	
	public void setTemperatureF(String temperatureF) {
		this.temperatureF = temperatureF;
	}
	
	public String getWeatherMainType() {
		return weatherMainType;
	}
	
	public void setWeatherMainType(String weatherMainType) {
		this.weatherMainType = weatherMainType;
	}
	
	public String getWeatherIcon() {
		return weatherIcon;
	}
	
	public void setWeatherIcon(String weatherIcon) {
		this.weatherIcon = weatherIcon;
	}
	
	public int getPressure() {
		return pressure;
	}
	
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	
	public int getHumidity() {
		return humidity;
	}
	
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	public float getWindSpeed() {
		return windSpeed;
	}
	
	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}

	@Override
	public String toString() {
		return "Weather [id=" + id + ", cityName=" + cityName + ", cityId=" + cityId + ", weatherDate=" + weatherDate
				+ ", logDate=" + logDate + ", weatherStr=" + weatherStr + ", temperatureK=" + temperatureK
				+ ", temperatureC=" + temperatureC + ", temperatureF=" + temperatureF + ", weatherMainType="
				+ weatherMainType + ", weatherIcon=" + weatherIcon + ", pressure=" + pressure + ", humidity=" + humidity
				+ ", windSpeed=" + windSpeed + "]";
	}

}
