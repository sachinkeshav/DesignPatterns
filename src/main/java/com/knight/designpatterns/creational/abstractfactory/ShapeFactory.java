package com.knight.designpatterns.creational.abstractfactory;

import com.knight.designpatterns.creational.abstractfactory.color.Color;
import com.knight.designpatterns.creational.abstractfactory.shape.Circle;
import com.knight.designpatterns.creational.abstractfactory.shape.Rectangle;
import com.knight.designpatterns.creational.abstractfactory.shape.Shape;
import com.knight.designpatterns.creational.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
