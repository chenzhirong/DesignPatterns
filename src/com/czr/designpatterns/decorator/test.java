package com.czr.designpatterns.decorator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person xiaoMin = new XiaoMin("小明");//主体（被装饰者）
		
		xiaoMin = new Jacket(xiaoMin);//)=上衣
		
		xiaoMin = new Shorts(xiaoMin);//=短裤
//		
		xiaoMin = new Hat(xiaoMin);//帽子
		
		System.out.println(xiaoMin.addClothing());

	}

}
