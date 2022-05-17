package com.self.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class DistanceCalculator {

	static int timeTakenByRedLight = 5;

	public static void main(String[] args) {

		CalculatorProperties[] properties = { new CalculatorProperties(3, 30, 5), new CalculatorProperties(2, 40, 10),
				new CalculatorProperties(1, 50, 15) };

		Comparator<Integer> comp = (o1, o2) -> o1 - o2;

		Optional<Integer> minimumTime = Arrays.asList(properties).stream().map(p -> calculateTime(p)).min(comp);

		System.out.println("Min time =" + minimumTime.get());
	}

	private static int calculateTime(CalculatorProperties properties) {
		return (60 * properties.getDistance() / properties.getSpeed())
				+ properties.getNoOfRedLights() * timeTakenByRedLight;
	}

}

class CalculatorProperties {
	private int noOfRedLights;
	private int speed;
	private int distance;

	CalculatorProperties(int noOfRedLights, int speed, int distance) {
		this.noOfRedLights = noOfRedLights;
		this.speed = speed;
		this.distance = distance;
	}

	public int getNoOfRedLights() {
		return noOfRedLights;
	}

	public void setNoOfRedLights(int noOfRedLights) {
		this.noOfRedLights = noOfRedLights;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}
