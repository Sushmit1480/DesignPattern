package com.sushmit.BehaviouralPattern.ObserverPattern;

class DisplayDevice {
	public void showTemp(float temp) {
		System.out.println("Current temp: " + temp + " C");
	}
}

class WeatherStation{
	private float temperature;
	private DisplayDevice displayDevice;
	
	public WeatherStation(DisplayDevice displayDevice) {
		this.displayDevice = displayDevice;
	}
	
	public void setTemperature(float temp) {
		this.temperature = temp;
		notifyDevice();
	}
	
	public void notifyDevice() {
		displayDevice.showTemp(temperature);
	}
}

public class WithoutObserverPattern {
	
	public static void main(String[] args) {
		DisplayDevice device = new DisplayDevice();
		WeatherStation station = new WeatherStation(device);
		
		// Tight Coupling Between Station and device
		station.setTemperature(26);
		station.setTemperature(30);
	}
}
