package at.campus02.musikanten;

public class Katze extends Musikant{
	protected double kratzKraft;
	
	public Katze(int aB, Instrument i , double kratzKraft) {
		super(aB,i);
		this.kratzKraft = kratzKraft;
	}

	public double getKratzKraft() {
		return kratzKraft;
	}

	//Die Katze kratzt die Räuber und verscheucht sie damit. (z.B. Kraft 3.8 verscheucht 3 Räuber)
	// Wenn die Katze verletzt ist und nur 3 Beine hat kann sie nur halb so stark kratzen und wenn die Katze
	// nur 2 Beine (oder weniger) hat kann sie nur 1 Räuber verscheuchen.
	@Override
	public int verscheucheRaeuber() {
		if (anzahlBeine<=2){
			return 1;
		}
		else if (anzahlBeine == 3){
			return (int) kratzKraft/2;
		}
		else return (int) kratzKraft;
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}

	@Override
	public String toString() {

		return "Katze:" + kratzKraft + "/ " +
		super.toString();

	}
}
