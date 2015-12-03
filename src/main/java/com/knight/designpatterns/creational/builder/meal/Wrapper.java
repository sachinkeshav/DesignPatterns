package com.knight.designpatterns.creational.builder.meal;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
