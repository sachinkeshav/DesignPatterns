package com.knight.designpatterns.creational.builder;

import com.knight.designpatterns.creational.builder.meal.ChickenBurger;
import com.knight.designpatterns.creational.builder.meal.Coke;
import com.knight.designpatterns.creational.builder.meal.Pepsi;
import com.knight.designpatterns.creational.builder.meal.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
