package com.czr.osserver;

public class test {
	
	public static void main(String[] args) {
		//������ʾ��� 
		CurrentConditions currentConditions = new CurrentConditions();
		//��������
		WeatherData weatherData = new WeatherData(currentConditions);
		weatherData.dataChange(10L, 20L, 30L);
	}

}
