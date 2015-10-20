package Factory.demo1;

import java.util.ArrayList;

public abstract class Pizza {

	private String name;// 名称
	private String dough;// 面团类型
	private String sauce;// 酱料类型
	ArrayList<String> toppings = new ArrayList<String>();// 一套佐料

	protected void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough... ");
		System.out.println("Adding sauce... ");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}

	void bake() {
		System.out.println("Back for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

}
