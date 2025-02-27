package com.sushmit.BehaviouralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer{
	void update(float temp);
}

interface Subject{
	void attach(Observer obs);
	void detach(Observer obs);
	void notifyObservers();
}

class WeatherStationIn implements Subject{

	private float temperature;
	private List<Observer> observerList;
	
	public WeatherStationIn() {
		observerList = new ArrayList<>();
	}
	
	public void setTemprature(float temperature) {
		this.temperature = temperature;
		notifyObservers();
	}
	
	@Override
	public void attach(Observer obs) {
		observerList.add(obs);
	}

	@Override
	public void detach(Observer obs) {
		observerList.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs: observerList) {
			obs.update(temperature); // Runtime polymorphism
			
		}
	}
	
}

class DisplayDeviceIn implements Observer{

	String name;
	
	public DisplayDeviceIn(String deviceName) {
		this.name = deviceName;
	}
	
	@Override
	public void update(float temp) {
		System.out.println("Temp on " + name + " is: " + temp + " C");
	}
}

class MobileDevice implements Observer{

	@Override
	public void update(float temp) {
		System.out.println("Temp on Mobile is: " + temp + " C");
	}
}

public class ObserverPatternExample {

	public static void main(String[] args) {
		// Create Publisher
		WeatherStationIn weatherStationIn = new WeatherStationIn();
		
		// Create Subscriber
		DisplayDeviceIn device= new DisplayDeviceIn("SamsungLCD");
		MobileDevice mobileDevice = new MobileDevice();
		
		// Attach
		weatherStationIn.attach(device);
		weatherStationIn.attach(mobileDevice);
		
		// Set Temperature
		weatherStationIn.setTemprature(25);
		
		weatherStationIn.detach(mobileDevice);
		weatherStationIn.setTemprature(26);
	}
}
