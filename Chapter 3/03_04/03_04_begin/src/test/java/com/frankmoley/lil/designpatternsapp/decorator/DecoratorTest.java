package com.frankmoley.lil.designpatternsapp.decorator;
import junit.framework.TestCase;
import org.junit.Test;

import java.awt.*;
public class DecoratorTest  {

	@Test
	public void TestDecorator() {
		Pizza pizza = new ThickCrustPizza();
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());

		Pepperoni pepperoni = new Pepperoni(pizza);
		System.out.println(pepperoni.getDescription());
		System.out.println(pepperoni.getCost());

		Pepperoni doublePepperoni = new Pepperoni(pepperoni);
		System.out.println(doublePepperoni.getDescription());
		System.out.println(doublePepperoni.getCost());
	}

}