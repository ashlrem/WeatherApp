package com.oddle.app.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oddle.app.utils.Temperature;

import code.oddle.app.model.Weather;

import org.json.JSONArray;
import org.json.JSONObject; 

@RestController
@PropertySource("classpath:application.properties")
public class WeatherController {
	
	@Value("${app.weather.api.url}")
	private String apiUrl;
	
	@Value("${app.weather.api.key}")
	private String apiKey;
	
	private Weather weather = new Weather();
	
	private static final Logger log = Logger.getLogger(WeatherController.class.getName());
	
	@RequestMapping({ "/" })
	public String index() {
		return "Weather App using Spring Boot!";
	}
	
	/**
	 * This method fetches latest city weather from
	 * OpenWeatherMap API.
	 * 
	 * @param city
	 * @return JSON
	 */
	@RequestMapping({ "/weather/search/" })
	public Weather search (@RequestParam(name="city", required = true)String city) {
		Temperature temp = new Temperature();
		JSONObject jsonObject = new JSONObject();
		
		try {
			
			//START Fetching from Open Weather Map API
			StringBuffer restfulURL = new StringBuffer();
			restfulURL.append(apiUrl).append(city).append("&APPID=").append(apiKey);
			URL url = new URL(restfulURL.toString());
			String readLine = null;
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			int responseCode = con.getResponseCode();
			//END Fetch from Open Weather Map API
			
			//START Consuming JSON if HTTP STATUS == 200
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(
			            new InputStreamReader(con.getInputStream()));
			        StringBuffer response = new StringBuffer();
		        while ((readLine = in .readLine()) != null) {
		            response.append(readLine);
		        }
		        in.close();

		        jsonObject = new JSONObject(response.toString());
		        JSONArray weatherArr = jsonObject.getJSONArray("weather");
		        
		        String cityName = jsonObject.getString("name").toString();
		        int cityId = weatherArr.getJSONObject(0).getInt("id");
		        String weatherDate = ""; //Insert weather date here
		        int logDate = jsonObject.getInt("dt");
		        String weatherStr = response.toString();
		        String tempK = jsonObject.getJSONObject("main").getString("temp");
		        double tempC = temp.getCelsius(Double.parseDouble(tempK));
		        double tempF = temp.getFahrenheit(Double.parseDouble(tempK));
		        String weatherMainType = weatherArr.getJSONObject(0).getString("main");
		        String weatherIcon = weatherArr.getJSONObject(0).getString("icon");
		        int pressure = jsonObject.getJSONObject("main").getInt("pressure");
		        int humidity = jsonObject.getJSONObject("main").getInt("humidity");
		        int windSpeed = jsonObject.getJSONObject("wind").getInt("speed");
		        
		        weather.setCityName(cityName);
		        weather.setCityId(cityId);
		        weather.setWeatherDate(weatherDate); //insert weather date here
		        weather.setLogDate(logDate);
		        weather.setWeatherStr(weatherStr);
		        weather.setTemperatureK(tempK);
		        weather.setTemperatureC(String.valueOf(tempC));
		        weather.setTemperatureF(String.valueOf(tempF));
		        weather.setWeatherMainType(weatherMainType);
		        weather.setWeatherIcon(weatherIcon);
		        weather.setPressure(pressure);
		        weather.setHumidity(humidity);
		        weather.setWindSpeed(windSpeed);
		        		                
//		        return jsonObject.toString();
		        return weather;
			}else {
				log.error("Fetch GET did not work!");
			}
		}catch(Exception e){
			log.error(e.getMessage());
		}
		
//		return jsonObject.toString();
		return weather;
	}
	
	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public String list(ModelMap model) {
		model.addAttribute("message", "This is a boilerplate project");

		return "weather";
	}
}
