import java.io.FileNotFoundException;
import java.io.IOException;

import AbstractFactory.GUIFactory;
import AbstractProduct.ButtonAbstract;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		GUIFactory test = GUIFactory.getFactory();
		ButtonAbstract button = test.createButton();
		button.draw();
		
	}

}
