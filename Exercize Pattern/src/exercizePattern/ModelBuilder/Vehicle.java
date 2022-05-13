package exercizePattern.ModelBuilder;

import exercizePattern.Interface.VehicleActions;

public abstract class Vehicle implements VehicleActions {

	private Long id;
	private String color;
	private String model;
	private String numberWheels;
	private Integer maxSpeed;
	private String engineDisplacement;
	private boolean engine;
	
	protected Long getId() {
		return id;
	}
	protected void setId(Long id) {
		this.id = id;
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	
	protected String getModel() {
		return model;
	}
	protected void setModel(String model) {
		this.model = model;
	}
	protected Integer getMaxSpeed() {
		return maxSpeed;
	}
	protected void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	protected String getDisplacement() {
		return engineDisplacement;
	}
	protected void setEngineDisplacement(String engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	protected boolean isEngine() {
		return engine;
	}
	protected void setEngine(boolean engine) {
		this.engine = engine;
	}
	protected String getNumberWheels() {
		return numberWheels;
	}
	protected void setNumberWheels(String numberWheels) {
		this.numberWheels = numberWheels;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", color=" + color + ", model=" + model + ", numberWheels=" + numberWheels
				+ ", maxSpeed=" + maxSpeed + ", engineDisplacement=" + engineDisplacement + ", engine=" + engine + "]";
	}
	
	
	
	
	
}
