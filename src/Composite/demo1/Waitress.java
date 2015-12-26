package Composite.demo1;

public class Waitress {

	MenuComponent allmenus;

	public Waitress(MenuComponent allmenus) {
		this.allmenus = allmenus;
	}

	public void printMenu() {
		allmenus.print();
	}
}
