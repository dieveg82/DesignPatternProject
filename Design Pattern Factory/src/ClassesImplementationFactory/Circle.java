package ClassesImplementationFactory;

import InterfaceFactory.Shape;

public class Circle implements Shape {

	
	
	public Circle () {};

	@Override
	public void draw() {
		System.out.println("I'm the circle");
	}
	@Override
	public void area(double radius , double radius1) {
		System.out.println("The area is " + ((radius *radius1)*Math.PI));
	}
	@Override
	public void perimeter(double radius , double radius1) {
		System.out.println("The perimeter is " + (radius*radius1));
		
	}

}
