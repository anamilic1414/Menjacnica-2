package interfejs;

import java.util.GregorianCalendar;

import valute.Valuta;

public class Menjacnica implements InterfejsMenjacnica {

	@Override
	public void dodajValutu(String naziv, String skraceno, GregorianCalendar datum, String kurs, double iznos) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum, String kurs) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiValutu(String naziv, GregorianCalendar datum, String kurs) {
		// TODO Auto-generated method stub
		return null;
	}

}
