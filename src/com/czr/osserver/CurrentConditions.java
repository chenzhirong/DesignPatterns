package com.czr.osserver;

/**
 * 当前天气情况显示面板 
 * 
 * @author chenzhirong
 *
 */
public class CurrentConditions {

	public Long temperature;// 温度

	public Long humidity;// 湿度

	public Long pressure;// 日期

	/**
	 * 更新数据
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void update(Long temperature, Long humidity, Long pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("temperature="+temperature);
		System.out.println("humidity"+humidity);
		System.out.println("humidity"+humidity);
	}
}
