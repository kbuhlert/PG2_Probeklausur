package at.campus02.musikanten;

import java.util.Comparator;

public class LautstaerkeComparator implements Comparator<Musikant> {

    @Override
    public int compare(Musikant o1, Musikant o2) {

        if (o1.spieleMusik() < o2.spieleMusik()) {
            return 1;
        }
        if (o1.spieleMusik() > o2.spieleMusik()) {
            return -1;
        }
        return 0;
    }

}
