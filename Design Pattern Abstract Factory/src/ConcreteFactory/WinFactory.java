package ConcreteFactory;


import AbstractFactory.GUIFactory;
import AbstractProduct.ButtonAbstract;
import ConcreteProduct.WinButton;

public class WinFactory extends GUIFactory {

	@Override
	public ButtonAbstract createButton() {
		return new WinButton ();
	}

}
