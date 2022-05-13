package Pizza;

// PRODUCT

public class Pizza {
	// dough = impasto
    private String dough = "";
    // sauce = salsa
    private String sauce = "";
    // topping = guarnizione
    private String topping = "";
    
    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public void setTopping(String topping) {
        this.topping = topping;
    }

	@Override
	public String toString() {
		return "Pizza [dough=" + dough + ", sauce=" + sauce + ", topping=" + topping + "]";
	}
    
    
}
