package Iterator.demo2;

public class MenuTestDrive2 {
	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		waitress.printMenu();

	}
}
