package at.campus02.musikanten;

public class Hund extends Musikant {
	protected double bellLautstaerke;

	public Hund(int aB, Instrument i , double bellLautstaerke) {
		super(aB,i);
		this.bellLautstaerke = bellLautstaerke;
	}

	public double getBellLautstaerke() {
		return bellLautstaerke;
	}
	//Der Hund verscheucht die Räuber mit lauten Geräuschen und verwendet je nachdem was
	// lauter ist entweder sein Bellen oder sein Instrument
	@Override
	public int verscheucheRaeuber() {
		if (bellLautstaerke>instrument.getLautstaerke()){
			return (int) bellLautstaerke;
		}
		else return (int) instrument.getLautstaerke();
	}


	//Die Hund Lautstärke ist der mittlere Wert zwischen Instrument- und Belllautstärke.
	// (Lautstärke Bellen 10, Lautstärke Instrument 20 -> Ergebnislautstärke ist 15)
	@Override
	public double spieleMusik() {
		return (bellLautstaerke + instrument.getLautstaerke())/2;
	}

	@Override
	public String toString() {
		return "Hund:" + bellLautstaerke +
				super.toString();
	}
}
