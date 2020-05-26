package at.campus02.testprogramme;

import at.campus02.musikanten.*;

public class MusikantenTest {

	public static void main(String[] args) {
		Katze mietz = new Katze(3,new Instrument("Harfe",1.9),7.2);
		Esel horst = new Esel(4,new Instrument("Föte",2),9);
		Hund bello = new Hund(4,new Instrument("schellen",4.1),6);
		Hahn bockl = new Hahn(2,new Instrument("Gesang",4.3),5);

		Quartett musikantenstadl = new Quartett();

		musikantenstadl.add(mietz);
		musikantenstadl.add(horst);
		musikantenstadl.add(bello);
		musikantenstadl.add(bockl);

		System.out.println(musikantenstadl.istQuartett());
		System.out.println(musikantenstadl.gemeinsamRaeuberVerscheucht());
		System.out.println(musikantenstadl.durchschnittlicheLautstaerke());
		System.out.println(musikantenstadl.getMusikantenInLautstaerkeBereich(1,20));
		System.out.println(musikantenstadl.getAnzahlMusikantenMitBeinAnzahl());
		musikantenstadl.printLautStaerkeAbsteigend();

	}

}
