package com.PatternTest;

import com.FlyWeightPattern.Circle;
import com.FlyWeightPattern.ShapeFactory;

public class FlyWeightPatternDemo {

	private static final String[] color = {"Red","Green","Blue","White","Bleck"};
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			Circle circle = (Circle)ShapeFactory.getCircle(color[(int)(Math.random()*color.length)]);
			circle.setX((int)(Math.random()*100));
			circle.setY((int)(Math.random()*100));
			circle.setRadius(100);
			circle.draw();
		}
	}
	
}
