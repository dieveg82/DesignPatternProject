
public class Rectangle extends Shape {

	public Rectangle () {
		type = "Rectangle";
		draw();
	}
	
	@Override
	void draw() {
		System.out.println("I draw a " + type);
	}

}
