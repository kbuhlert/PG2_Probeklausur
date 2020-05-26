package at.campus02.musikanten;

public class Esel extends Musikant {
	//Erstellen Sie die Klassen Esel, Hund, Katze und Hahn, die sich von der abstrakten Klasse Musikant ableiten.
	// Erstellen Sie für jede Klasse Konstruktoren um die Membervariablen der Basisklassen und die neuen
	// Membervariablen zu initialisieren. (Zuerst die Membervariablen der Basisklasse) Erstellen Sie für die
	// neuen Membervariablen getter.
	protected double trittkraft;

	public Esel(int aB, Instrument i, double trittkraft)
	{
		super(aB,i);
		this.trittkraft = trittkraft;
	}

	public double getTrittkraft() {
		return trittkraft;
	}

	//Der Esel kann Trittkraft * Beinanzahl viele Räuber verscheuchen.
	@Override
	public int verscheucheRaeuber() {
		return (int) trittkraft * anzahlBeine;
	}

	//Esel und Katze sind so laut wie ihr Instrument.
	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}

	@Override
	public String toString() {
		return "Esel: " + trittkraft +
				super.toString();
	}
}
