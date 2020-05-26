package com.czr.osserver;

public class test {
	
	public static void main(String[] args) {
		//天气显示面板 
		CurrentConditions currentConditions = new CurrentConditions();
		//天气数据
		WeatherData weatherData = new WeatherData(currentConditions);
		weatherData.dataChange(10L, 20L, 30L);
	}

}
