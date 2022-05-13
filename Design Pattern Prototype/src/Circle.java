
public class Circle extends Shape{

	public Circle () {
		type = "Circle";
		draw();
	}
	
	@Override
	void draw() {
		System.out.println("I draw a " + type);
	}

}
