package com.oddle.app.utils;

public class Temperature{
	
	public Temperature() {
	}

// Convert degreesKelvin to Celsius and return the value
	public double getCelsius(double tempKelvin) {
		double c = tempKelvin - 273.16;
		return c;
	}

// Convert degreesKelvin to Fahrenheit and return the value
	public double getFahrenheit(double tempKelvin) {
		double f = (((tempKelvin - 273) * 9d / 5) + 32);
		return f;
	}

}