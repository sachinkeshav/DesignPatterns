package com.knight.designpatterns.creational.abstractfactory;

import com.knight.designpatterns.creational.abstractfactory.color.Blue;
import com.knight.designpatterns.creational.abstractfactory.color.Color;
import com.knight.designpatterns.creational.abstractfactory.color.Green;
import com.knight.designpatterns.creational.abstractfactory.color.Red;
import com.knight.designpatterns.creational.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
