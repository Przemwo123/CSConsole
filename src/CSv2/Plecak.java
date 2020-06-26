package CSv2;

import CSv2.Bronie.*;

import java.util.List;
import java.util.ArrayList;

public class Plecak{
	
	private final List<_Bron> bronie = new ArrayList<>();
	public Plecak() {
		bronie.add(new Noz());
		bronie.add(new Glock());
		bronie.add(new AK47());
		bronie.add(new Snajperka());
	}
	
	public void wyswietlPlecak() throws NullPointerException{
		for(int i=0; i<bronie.size(); i++) {
			System.out.println(i+" - "+bronie.get(i).name());
		}
	}

	public _Bron wyjmij(int index, _Bron aktualna) {
		try {
			_Bron tmp = bronie.get(index);
			bronie.remove(index);
			if(aktualna!=null) bronie.add(aktualna);
			return tmp;
		} catch (Exception ex) {
			return aktualna;
		}
	}
	
	public _Bron schowajBron(_Bron aktualna) {

		if(aktualna!=null) {
			bronie.add(aktualna);
			System.out.println("Schowano "+aktualna.name()+" do plecaka");
		}else{
			System.out.println("Nie trzymasz żadnej broni");
		}

		return null;
	}
	
	public _Bron swap(_Bron aktualna) {
		_Bron tmp = bronie.get(0);
		bronie.remove(0);
		if(aktualna!=null) {
			bronie.add(aktualna);
		}
		return tmp;
	}
}
