package Iterator.demo2;

import java.util.ArrayList;

public class MenuTestDrive {
	public static void main(String[] args) {

		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();

		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		menus.add(cafeMenu);

		Waitress2 waitress = new Waitress2(menus);
		waitress.printMenu();

	}
}
