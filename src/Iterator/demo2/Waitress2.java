package Iterator.demo2;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress2 {

	ArrayList<Menu> menus;

	public Waitress2(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			printMenu(menu.createIterator());
		}
	}

	public void printMenu(Iterator<MenuItem> iterator) {
		while (iterator != null && iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}

}
