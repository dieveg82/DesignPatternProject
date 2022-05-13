package exercizePattern.AbstractFactory;

import exercizePattern.ModelBuilder.Car;
import exercizePattern.ModelBuilder.Cycle;
import exercizePattern.ModelBuilder.Motocycle;
import exercizePattern.ModelBuilder.Vehicle;

public abstract class AbstractFactoryVehicle {

	private final static int NUMBERWHEELSCAR = 4;
	private final static int NUMBERWHEELSCYCLE = 2;

	public static Vehicle getVehicle(int numberWheels, boolean engine) {

		if (engine == false && numberWheels == NUMBERWHEELSCYCLE) {
			return new Cycle.Builder(1L).build();
		} else if (numberWheels == NUMBERWHEELSCAR) {
			return new Car.Builder(1L).build();
		} else if (numberWheels == NUMBERWHEELSCYCLE)
			return new Motocycle.Builder(1L).build();
		else {
			System.out.println("There is no such vehicle");
			return null;
		}
	}

}
