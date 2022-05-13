package ClassesImplementationFactory;

import InterfaceFactory.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("I'm the rectangle");
	}

	@Override
	public void area(double sideVertical, double sideHorizontal) {
		System.out.println("The area is " + ((sideHorizontal *sideVertical)/2));
	}

	@Override
	public void perimeter(double sideVertical, double sideHorizontal) {
		System.out.println("The perimeter is " + ((sideHorizontal * 2) + (sideVertical*2)));
		
	}

}
