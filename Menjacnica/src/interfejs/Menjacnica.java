package interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valute.Valuta;

public class Menjacnica implements InterfejsMenjacnica {
	
	private LinkedList<Valuta> valute;

	@Override
	public void dodajValutu(String naziv, String skraceno, GregorianCalendar datum, String kurs, double iznos) {
		Valuta nova = new Valuta();
		nova.setDatum(datum);
		nova.setKurs(kurs);
		nova.setNaziv(naziv);
		nova.setSkracenica(skraceno);
		nova.setIznos(iznos);
		
		if(!valute.contains(nova)) 
			valute.addLast(nova);

	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum, String kurs) {
	
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getDatum().equals(datum) && valute.get(i).getNaziv().equals(naziv) && valute.get(i).getKurs().equals(kurs))
				valute.remove(valute.get(i));
		}

	}

	@Override
	public Valuta pronadjiValutu(String naziv, GregorianCalendar datum, String kurs) {
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getDatum().equals(datum) && valute.get(i).getKurs().equals(kurs) && valute.get(i).getNaziv().equals(naziv))
				return valute.get(i);
		}
		return null;
	}

}
