package com.knight.designpatterns.creational.builder.meal;

public interface Item {
	
	public String name();
	
	public Packing packing();
	
	public float price();
}
