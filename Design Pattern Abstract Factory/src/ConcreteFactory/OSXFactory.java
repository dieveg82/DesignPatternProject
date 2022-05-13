package ConcreteFactory;


import AbstractFactory.GUIFactory;
import AbstractProduct.ButtonAbstract;
import ConcreteProduct.OXSButton;

public class OSXFactory extends GUIFactory{

	@Override
	public ButtonAbstract createButton() {
		return new OXSButton ();
	}



}
