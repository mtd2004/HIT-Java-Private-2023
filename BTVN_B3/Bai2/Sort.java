package BTVN_B3.Bai2;

import java.util.Comparator;

public class Sort implements Comparator<Subject> {

    public int compare(Subject s1, Subject s2) {
        if (s1.getEndMinutes() < s2.getEndMinutes()) {
            return -1;
        } else {
            return 1;
        }
    }
}
