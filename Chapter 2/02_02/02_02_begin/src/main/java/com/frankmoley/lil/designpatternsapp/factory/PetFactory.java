package com.frankmoley.lil.designpatternsapp.factory;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class PetFactory {

	public Pet createPet(String animalType) {
		switch (animalType.toLowerCase()) {
			case "cat": return new Cat();
			case "dog": return new Dog();
			default: throw new UnsupportedOperationException("unknown animal type");

		}
	}
}
