package at.campus02.musikanten;

public class Instrument {
	private String name;
	private double lautstaerke;

	//Erstellen Sie für die Klasse Instrument einen Konstruktor zur Initialisierung der Membervariablen
	// und erstellen Sie getter und setter Methoden für die beiden Variablen.


	public Instrument(String name, double lautstaerke) {
		this.name = name;
		this.lautstaerke = lautstaerke;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLautstaerke() {
		return lautstaerke;
	}

	public void setLautstaerke(double lautstaerke) {
		this.lautstaerke = lautstaerke;
	}
}
