package exercizePattern.ModelBuilder;

public class Cycle extends Vehicle {
	
	// VARIABLE CLASS
	private int speed;


	// COSTRUCTOR CLASS ABSTRACT
	public Cycle() {
		
	}
	
	// METODE SETTER CLASS 
	public int getSpeed() {
		return speed;
	}
	
	

	// PATTERN BUILDER
	public static class Builder {


		private Long id;
		private String numberWheels;
		private String color;
		private String model;
		private Integer maxSpeed;
		private String engineDisplacement;
		private boolean engine;

		public Builder(Long id) {
			this.id = id;
			this.numberWheels = "2";
			this.color = "";
			this.model = "";
			this.maxSpeed = 30;
			this.engineDisplacement = "0";
			this.engine = false;
		}

		public Cycle build() {
			Cycle element = new Cycle ();
			element.setId(this.id);
			element.setNumberWheels(this.numberWheels); 
			element.setColor(this.color);
			element.setModel(this.model); 
			element.setMaxSpeed(this.maxSpeed); 
			element.setEngineDisplacement(this.engineDisplacement);
			element.setEngine (this.engine);
			return element;
		}
		
		public Cycle.Builder setColorBuilder(String color) {
			this.color =color; 
			return this;
		}
		public Cycle.Builder setModelBuilder(String model) {
			this.model = model; 
			return this;
		}

	}

	// METHOD INTERFACE ACTIONS
	@Override
	public boolean powerOn() {
		return false;
	}

	@Override
	public void accelerate(int speedUp) {
		speed += speedUp;
		if ((speed > getMaxSpeed())) {
			System.out.println("Max Speed " + getMaxSpeed());
			speed = speed -(speed - getMaxSpeed());
		 }
	}

	@Override
	public void brake(int speedDown) {
		speed -= speedDown;
		if ((speed < 0) ) {
		 speed = speed + (speed + -1);	
		}
		
	}

	@Override
	public boolean powerRadio() {
		return false;
	}

	
	

	
}
