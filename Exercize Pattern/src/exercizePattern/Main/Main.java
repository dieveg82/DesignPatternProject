package exercizePattern.Main;

import exercizePattern.AbstractFactory.AbstractFactoryVehicle;
import exercizePattern.ModelBuilder.Car;
import exercizePattern.ModelBuilder.Cycle;
import exercizePattern.ModelBuilder.Motocycle;

public class Main {

	public static void main(String[] args) {

		Cycle cycle =  new Cycle.Builder(1L)
									.setColorBuilder("White")
									.setModelBuilder("Atala Racing")
									.build();
		
		cycle.accelerate(50);
		System.out.println (cycle.getSpeed());
		
		Motocycle motocycle = new Motocycle.Builder(2L)
									.setColorBuilder("Black")
									.setModelBuilder("Cbr Honda")
									.build();
		
		motocycle.powerOn();
		motocycle.accelerate(259);
		motocycle.brake(100);
		System.out.println(motocycle.getSpeed());
		
		Car car = new Car.Builder(3L)
						.setColorBuilder("Red")
						.setModelBuilder("Ford Fiesta")
						.build();
		
		car.powerOn();
		car.powerRadio();
		System.out.println(car.getSpeed());
		
		Motocycle test = (Motocycle) AbstractFactoryVehicle.getVehicle(6, true);
		Motocycle test2 = (Motocycle) AbstractFactoryVehicle.getVehicle(2, true);
		System.out.println(test2.toString());
		
		
								
	}

}
