package ClassesImplementationFactory;

import InterfaceFactory.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("I'm the square");
	}

	@Override
	public void area(double sideVertical, double sideHorizontal) {
		System.out.println("The area is " + ((sideHorizontal *sideVertical)));
		
	}

	@Override
	public void perimeter(double sideVertical, double sideHorizontal) {
		System.out.println("The perimeter is " + (sideHorizontal * 4));
		
		
	}

}
