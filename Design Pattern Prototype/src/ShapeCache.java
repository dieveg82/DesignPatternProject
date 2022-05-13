import java.util.Hashtable;

public class ShapeCache {

	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape (String shapeId) {
		Shape element = shapeMap.get(shapeId);
		return (Shape) element.clone();
	}
	
	public static void loadCache () {
		Circle shape = new Circle();
		shape.setId("1");
		shapeMap.put(shape.getId(), shape);
		
		Square shape2 = new Square();
		shape2.setId("2");
		shapeMap.put(shape2.getId(), shape2);
		
		Rectangle shape3 = new Rectangle();
		shape3.setId("3");
		shapeMap.put(shape3.getId(), shape3);
	}
}
