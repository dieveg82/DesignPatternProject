package exercizePattern.ModelBuilder;

public class Motocycle extends Vehicle {
	
	// VARIABLE CLASS
	private int speed;


	// COSTRUCTOR CLASS ABSTRACT
	public Motocycle() {
		
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
			this.maxSpeed = 200;
			this.engineDisplacement = "600 cc";
			this.engine = true;
		}

		public Motocycle build() {
			Motocycle element = new Motocycle ();
			element.setId(this.id);
			element.setNumberWheels(this.numberWheels); 
			element.setColor(this.color);
			element.setModel(this.model); 
			element.setMaxSpeed(this.maxSpeed); 
			element.setEngineDisplacement(this.engineDisplacement);
			element.setEngine (this.engine);
			return element;
		}
		
		public Motocycle.Builder setColorBuilder(String color) {
			this.color =color; 
			return this;
		}
		public Motocycle.Builder setModelBuilder(String model) {
			this.model = model; 
			return this;
		}

	}

	// METHOD INTERFACE ACTIONS
	@Override
	public boolean powerOn() {
		System.out.println("The motocycle is ready");
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
