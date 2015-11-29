package com.knight.designpatterns.creational.abstractfactory;

import com.knight.designpatterns.creational.abstractfactory.color.Color;
import com.knight.designpatterns.creational.abstractfactory.shape.Shape;

public abstract class AbstractFactory {

	abstract Color getColor(String color);
	
	abstract Shape getShape(String shape) ;
}
