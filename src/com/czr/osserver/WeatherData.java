package com.czr.osserver;

/**
 * 天气数据
 * 1.时时变化
 * 2.一但变化就向天气面板催送数据
 *说明 ：这是最普通的写法，当有多个显示面板 时，违反开闭原则，因为要修改WeatherData类
 * @author chenzhirong
 *
 */
public class WeatherData {

	public CurrentConditions currentConditions;

	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}

	public Long temperature;// 温度

	public Long humidity;// 湿度

	public Long pressure;// 日期

	public void dataChange(Long temperature, Long humidity, Long pressure) {
		currentConditions.update(temperature, humidity, pressure);
	}

}
