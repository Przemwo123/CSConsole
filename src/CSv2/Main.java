package CSv2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Player gracz= new Player();

		TekstMenu tekstMenu = new TekstMenu();
		tekstMenu.przywitanie(gracz.user);
		tekstMenu.menuInfo();
		
		Scanner odczyt = new Scanner(System.in);
		int x;
		
		Menu[] menu = new Menu[6];
		menu[0] = new MenuWyswietl();
		menu[1] = new MenuStrzelaj();
		menu[2] = new MenuWyswietlPlecak();
		menu[3] = new MenuBronZplecaka();
		menu[4] = new MenuSchowajBron();
		menu[5] = new MenuSwap();

		do {
			x=odczyt.nextInt();
			try {
				if(x==0)tekstMenu.menuInfo();
				else if(x!=9) {
					menu[x-1].wykonaj(gracz);
				}
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Nie przypisana pozycja w menu!");
			}
		} while(x!=9);
	}
}
