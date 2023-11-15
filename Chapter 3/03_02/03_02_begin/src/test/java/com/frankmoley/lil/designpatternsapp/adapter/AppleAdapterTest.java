package com.frankmoley.lil.designpatternsapp.adapter;
import junit.framework.TestCase;
import org.junit.Test;
public class AppleAdapterTest extends TestCase {

	@Test
	public void testAdapter() {
Orange orange = new MoroOrange();
Apple apple = new AppleAdapter(orange);
System.out.println(apple.getVariety());
apple.eat();
	}
}