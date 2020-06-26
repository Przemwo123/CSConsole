package CSv2;

import CSv2.Bronie._Bron;

import java.util.Scanner;

public class Player {
	public String user = System.getProperty("user.name");
	
	Scanner odczyt = new Scanner(System.in);
	_Bron aktualnaBron = null;
	Plecak plecak = new Plecak();
	
	public void wyswietlBron() {
		try {
			aktualnaBron.wyswietlBron();
		} catch (NullPointerException ex) {
			System.out.println("Najpierw wyjmij broń z plecaka");
		}
	}
	
	public void strzelaj() {
		try {
			aktualnaBron.strzelaj();
		} catch (NullPointerException ex) {
			System.out.println("Najpierw wyjmij broń z plecaka");
		}
	}
	
	public void wyswietlPlecak() {
		System.out.println("Zawartość plecaka:");
		plecak.wyswietlPlecak();
	}
	
	public void wezZplecaka() {
		int x;
		plecak.wyswietlPlecak();
		System.out.print("Wybieram: ");
		x=odczyt.nextInt();
		aktualnaBron = plecak.wyjmij(x,aktualnaBron);
		if(aktualnaBron!=null)
		wyswietlBron();
	}
	
	public void schowajBron() {
		aktualnaBron = plecak.schowajBron(aktualnaBron);
	}
	
	public void swap() {
		aktualnaBron=plecak.swap(aktualnaBron);
		System.out.println("Zmieniono broń na: "+aktualnaBron.name());
	}
}
