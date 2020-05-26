package at.campus02.musikanten;

public abstract class Musikant {

    //Erstellen Sie eine abstrakte Klasse Musikant und fügen Sie die beiden Eigenschaften aus dem Klassendiagramm
    // hinzu. Implementieren Sie den Konstruktor zum Initialisieren (der beiden Eigenschaften) und die
    // beiden get Methoden aus dem Klassendiagramm.

    protected int anzahlBeine;
    protected Instrument instrument;

    public Musikant(int anzahlBeine, Instrument instrument) {
        this.anzahlBeine = anzahlBeine;
        this.instrument = instrument;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public abstract int verscheucheRaeuber();
    public abstract double spieleMusik();

    @Override
    public String toString() {
        return " " + "verscheucht: " + verscheucheRaeuber() + "/ Musiziert: " + spieleMusik();
    }
}
