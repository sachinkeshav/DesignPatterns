package com.knight.designpatterns.creational.abstractfactory.shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
