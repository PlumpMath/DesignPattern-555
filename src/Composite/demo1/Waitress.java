package Composite.demo1;

import java.util.Iterator;

public class Waitress {

	MenuComponent allmenus;

	public Waitress(MenuComponent allmenus) {
		this.allmenus = allmenus;
	}

	public void printMenu() {
		allmenus.print();
	}

	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allmenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		try {
			MenuComponent menuComponent = iterator.next();
			if (menuComponent.isVegetarian()) {
				menuComponent.print();
			}
		} catch (UnsupportedOperationException e) {
		}
	}
}
