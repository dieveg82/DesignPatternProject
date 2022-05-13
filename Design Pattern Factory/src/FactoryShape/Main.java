package FactoryShape;

import ClassFactory.ShapeEnum;
import ClassFactory.ShapeFactory;
import InterfaceFactory.Shape;

public class Main {

	public static void main(String[] args) {

		
		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape(ShapeEnum.CIRCLE);
		shape.draw();
		shape.area(2, 2);
		shape.perimeter(2, 2);
		
		shape = factory.getShape(ShapeEnum.RECTANGLE);
		shape.draw();
		shape.area(2, 3);
		shape.perimeter(2, 3);
		
		shape = factory.getShape(ShapeEnum.SQUARE);
		shape.draw();
		shape.area(2, 2);
		shape.perimeter(2, 2);
		
		
		
		
	}

}
