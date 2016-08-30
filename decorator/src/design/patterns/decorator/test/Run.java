package design.patterns.decorator.test;

import design.patterns.decorator.*;
import design.patterns.decorator.domain.Coffee;
import design.patterns.decorator.domain.PlainCoffee;

public class Run {

	public static void main(String[] args) {
		double dayDiscount = 0.25;
		Coffee firstOrder = new WithMilk(new WithDiscount(new PlainCoffee(), dayDiscount));
		Coffee secondOrder = new WithSugar(new PlainCoffee());
		System.out.println(firstOrder.name() + " | price = " + firstOrder.cost());
		System.out.println(secondOrder.name() + " | price = " + secondOrder.cost());
	}

}
