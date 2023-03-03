package ch.noseryoung.ch;

public class Starter {
    public static void main(String[] args) {
        Set set1 = new Set();
        Set set2 = new Set();
        for (int i = 1; i <= 10; i++) {
            set1.addElem(i, set1);
        }
        for (int j = 6; j <= 15; j++) {
            set2.addElem(j, set2);
        }
        Set union = set1.union(set1, set2);
        Set intersection = set1.intersection(set1, set2);
        union.toString(union);
        intersection.toString(intersection);

    }
}
