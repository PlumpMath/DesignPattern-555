package Factory.demo3;

public abstract class Pizza {

	private String name;// 名称
	private Dough dough;// 面团类型
	private Sauce sauce;// 酱料类型
	private Veggies[] veggies;// 蔬菜

	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clam;

	abstract void prepare();

	void bake() {
		System.out.println("Back for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	@Override
	public String toString() {
		return "Pizza Name: " + getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Veggies[] getVeggies() {
		return veggies;
	}

	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Pepperoni getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Clams getClam() {
		return clam;
	}

	public void setClam(Clams clam) {
		this.clam = clam;
	}

}
