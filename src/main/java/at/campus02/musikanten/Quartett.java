package at.campus02.musikanten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Quartett {

	//Erstellen Sie eine Klasse Quartett, die Musikanten in einer privaten Arraylist speichern kann.
	// (Wählen Sie selbst einen amen) Erstellen Sie einen Konstruktor um diese zu initialisieren.
	// Erstellen Sie weiters eine void add(Musikant m) Methode um einen Musikanten in die Arraylist einzufügen.

	ArrayList<Musikant> musikantenstadl;

	public Quartett() {
		musikantenstadl = new ArrayList<>();
	}

	public void add(Musikant m) {
		musikantenstadl.add(m);
	}

	//Erstellen Sie in der Klasse Quartett eine Methode boolean istQuartett()
	// die überprüft ob das Quartett vollständig ist. (= enthält 4 Mitglieder)
	public boolean istQuartett()
	{
		boolean vollstaendig = false;

		if (musikantenstadl.size()==4)
			vollstaendig=true;

		return vollstaendig;
	}

	//Erstellen Sie in Klasse Quartett eine Methode int gemeinsamRaeuberVerscheucht()
	// die aufsummiert wie viele Räuber durch das Quartett verscheucht werden können.
	public int gemeinsamRaeuberVerscheucht()
	{
		int summe = 0;

		Iterator<Musikant> iterator = musikantenstadl.iterator();

		while (iterator.hasNext()){
			Musikant m = iterator.next();
			summe += m.verscheucheRaeuber();
		}
		return summe;
	}

	//Erstellen Sie in Klasse Quartett eine Methode double durchschnittlicheLautstaerke(),
	// welche die durchschnittliche Lautstärke des Quartetts als Rückgabewert liefert. (Die Methode spieleMusik verwenden)
	public double durchschnittlicheLautstaerke()
	{
		double summe = 0;
		for(Musikant m :musikantenstadl){
			summe += m.spieleMusik();
		}
		return summe/musikantenstadl.size();
	}

	//Erstellen Sie in der Klasse Quartett folgende Methode ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis)
	// die in einer Lister alle Musikanten zurückliefert deren Lautstärke (spielMusik) zwischen den beiden Grenzen liegt.

	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis)
	{
		ArrayList<Musikant> musikantMitLautstaerke = new ArrayList<>();
		for(Musikant m:musikantenstadl){
			if(m.spieleMusik()>=von && m.spieleMusik()<=bis){
				musikantMitLautstaerke.add(m);
			}
		}
		return musikantMitLautstaerke;
	}

	//Erstellen Sie in der Klasse Quartett folgende Methode HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
	// die zählt wie viele Musikanten es jeweils mit einer spezifischen Nummer an Beinen gibt. In der HashMap sind die Schlüssel
	// die Anzahl der Beine und der Wert die Anzahl der Tiere mit entsprechend vielen Beinen. (z.B. Eintrag 2 - 3 – Schlüssel 2 steht
	// für 2 beinige Tiere; Wert 3 gibt an, dass 3 Tiere entsprechend viele Beine haben)

	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
	{
		int bein1 = 0;
		int bein2 = 0;
		int bein3 = 0;
		int bein4 = 0;
		for(Musikant m:musikantenstadl) {
			if (m.getAnzahlBeine() == 1) {
				bein1++;
			}
			if (m.getAnzahlBeine() == 2) {
				bein2++;
			}
			if (m.getAnzahlBeine() == 3) {
				bein3++;
			}
			if (m.getAnzahlBeine() == 4) {
				bein4++;
			}
		}

			HashMap<Integer, Integer> tierBeinVerwaltung = new HashMap<>();
			tierBeinVerwaltung.put(1,bein1);
			tierBeinVerwaltung.put(2,bein2);
			tierBeinVerwaltung.put(3,bein3);
			tierBeinVerwaltung.put(4,bein4);

		return tierBeinVerwaltung;
	}

	//Erstellen Sie einen Comparator mit dem Namen LautstaerkeComparator der Musikanten sortieren kann.
	// Die Musikanten sollen ABSTEIGEND nach ihrer Lautstärke (-> spieleMusik) sortiert werden.
	// Erstellen Sie in der Klasse Quartett eine Methode void printLautStaerkeAbsteigend() die die Liste
	// sortiert und jeden Musikanten ausgibt. (toString verwenden)

	public void printLautStaerkeAbsteigend()
	{
		Collections.sort(musikantenstadl,new LautstaerkeComparator());
		System.out.println("Musikanten absteigend nach Lautstärlke");
		for(Musikant m:musikantenstadl){
			System.out.println(m);
		}
	}
}
