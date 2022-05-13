
public class Square extends Shape {

	public Square () {
		type = "square";
		draw();
	}
	
	@Override
	void draw() {

		System.out.println("I draw a " + type);
	}

}
