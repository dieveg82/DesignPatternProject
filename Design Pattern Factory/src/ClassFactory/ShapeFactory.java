package ClassFactory;

import ClassesImplementationFactory.Circle;
import ClassesImplementationFactory.Rectangle;
import ClassesImplementationFactory.Square;
import InterfaceFactory.Shape;

public class ShapeFactory {

	// Constructor
	public ShapeFactory() {}
	
	public Shape getShape (ShapeEnum typeShape) {
		if (typeShape.equals(typeShape.CIRCLE)) {
			return new Circle ();
		}
		else if (typeShape.equals(typeShape.RECTANGLE)){
			return new Rectangle ();
		}
		else if (typeShape.equals(typeShape.SQUARE)) {
			return new Square ();
		}
		else {
			return null;
		}
		
	}

	
}
