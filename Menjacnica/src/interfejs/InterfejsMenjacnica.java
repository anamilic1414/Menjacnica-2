package interfejs;

import java.util.GregorianCalendar;

import valute.Valuta;

public interface InterfejsMenjacnica {

	public void dodajValutu(String naziv, String skraceno, GregorianCalendar datum, String kurs, double iznos);
	public void obrisiKurs(String naziv, GregorianCalendar datum, String kurs);
	public Valuta pronadjiValutu(String naziv, GregorianCalendar datum, String kurs);
}
