package at.campus02.musikanten;

public class Hahn extends Musikant{
	protected int flugWeite;

	public Hahn(int aB, Instrument i , int flugWeite) {
		super(aB,i);
		this.flugWeite = flugWeite;
	}

	public int getFlugWeite() {
		return flugWeite;
	}
	//Wie viele Räuber der Hahn verscheucht ist abhängig von seiner Flugweite und der Lautstärke seines Instruments.
	//o Bei jeder Flugweite kleiner als 2 verscheucht er Lautstärke viele Räuber.
	//o Bei Flugweiten zwischen 2 und 6:
	// Flugweite 2 -> 6 Räuber
	// Flugweite 3 -> 5 Räuber
	// Flugweite 4 -> 4 Räuber
	// Flugweite 5 -> 3 Räuber
	// Flugweite 6 -> 2 Räuber
	//o Bei jeder Flugweite größer als 6 verscheucht er 1 Räuber.
	@Override
	public int verscheucheRaeuber() {
		if(flugWeite<2){
			return (int) instrument.getLautstaerke();
		}
		switch (flugWeite){
			case 2: return 6;
			case 3: return 5;
			case 4: return 4;
			case 5: return 3;
			case 6: return 2;
			default: return 1;
		}
	}

	//Der Hahn kräht zusätzlich zu seinem Instrument, weshalb sich
	// seine Instrumentlautstärke um 2 erhöht. Da er auch noch durch die Luft
	// fliegt wird seine Lautstärke durch die Flugweite dividiert.
	@Override
	public double spieleMusik() {
		return (instrument.getLautstaerke() + 2)/flugWeite;
	}

	@Override
	public String toString() {
		return "Hahn:" + flugWeite +
				super.toString();
	}
}
