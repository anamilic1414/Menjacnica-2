package interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valute.Valuta;

public class Menjacnica implements InterfejsMenjacnica {

	private LinkedList<Valuta> valute;

	@Override
	public void dodajValutu(String naziv, String skraceno, GregorianCalendar datum, String kurs, double iznos) {
		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setSkracenica(skraceno);
		v.setDatum(datum);
		v.setKurs(kurs);
		v.setIznos(iznos);

		if (!valute.contains(v))
			valute.add(v);
	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum, String kurs) {
		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setDatum(datum);
		v.setKurs(kurs);

		if (valute.contains(v))
			valute.remove(v);

	}

	@Override
	public Valuta pronadjiValutu(String naziv, GregorianCalendar datum, String kurs) {
		Valuta v = new Valuta();
		v.setDatum(datum);
		v.setKurs(naziv);
		v.setNaziv(naziv);

		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(v))
				return valute.get(i);
		}

		return null;
	}

}
