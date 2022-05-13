package AbstractFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import AbstractProduct.ButtonAbstract;
import ConcreteFactory.OSXFactory;
import ConcreteFactory.WinFactory;

public abstract class GUIFactory {
	private final static String TYPEFILE = "OS_TYPE";

	public static GUIFactory getFactory() throws FileNotFoundException, IOException {
		int sys = readFromConfigFile();
		if (sys == 0) {
			return new WinFactory();
		} else {
			return new OSXFactory();
		}
	}

	public abstract ButtonAbstract createButton();

	private static int readFromConfigFile() throws FileNotFoundException, IOException {

		InputStream inputFileConfig = new FileInputStream("/Users/softfobia/eclipse-workspace/Design Pattern Abstract Factory/FolderFile/config.properties ");
		Properties prop = new Properties();

		prop.load(inputFileConfig);

		System.out.println(prop.getProperty("app.name"));
		System.out.println(prop.getProperty("app.version"));
		System.out.println(prop.getProperty("app.autor"));
		if (prop.getProperty("app.type").equals(TYPEFILE)) {
			return 1;
		} else
			return 0;
	}
}
