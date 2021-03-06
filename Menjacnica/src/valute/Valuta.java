package valute;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skracenica;
	private GregorianCalendar datum;
	private String kurs;
	private double iznos;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if(naziv== null || naziv.isEmpty())
			throw new RuntimeException("Greska pri unosu naziva.");
		this.naziv = naziv;
	}

	public String getSkracenica() {
		return skracenica;
	}

	public void setSkracenica(String skracenica) {
		if(skracenica==null || skracenica.isEmpty())
			throw new RuntimeException("Greska pri unosu skracenice.");
		this.skracenica = skracenica;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if(datum == null)
			throw new RuntimeException("Greska pri unosu datuma.");
		this.datum = datum;
	}

	public String getKurs() {
		return kurs;
	}

	public void setKurs(String kurs) {
		if(kurs== null || (!kurs.equals("prodajni") && !kurs.equals("srednji") && !kurs.equals("kupovni")))
			throw new RuntimeException("Greska pri unosu kursa. Kurs moze biti prodajni, kupovni ili srednji.");
		this.kurs = kurs;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		if(iznos<0)
			throw new RuntimeException("Greska pri unosu iznosa.");
		this.iznos = iznos;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skracenica=" + skracenica + ", datum=" + datum + ", kurs=" + kurs
				+ ", iznos=" + iznos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}

	
	

	
}
