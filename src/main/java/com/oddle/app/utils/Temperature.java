package com.oddle.app.utils;

public class Temperature{

	private double degreesKelvin; // degrees in Kelvin

// Constructor method: initialize degreesKelvin to zero

	public Temperature() {
		degreesKelvin = 0;
	}

// Convert and save degreesCelius in the Kelvin scale

	public void setCelsius(double degreesCelsius) {
		degreesKelvin = degreesCelsius + 273.16;
	}

// Convert degreesKelvin to Celsius and return the value

	public double getCelsius(double tempKelvin) {
		double c = tempKelvin - 273.16;
		return c;
	}

// Convert and save degreesFahrenheit in the Kelvin scale

	public void setFahrenheit(double degreesFahrenheit) {
		degreesKelvin = (5d / 9 * (degreesFahrenheit - 32) + 273);
	}

// Convert degreesKelvin to Fahrenheit and return the value

	public double getFahrenheit(double tempKelvin) {
		double f = (((tempKelvin - 273) * 9d / 5) + 32);
		return f;
	}

}