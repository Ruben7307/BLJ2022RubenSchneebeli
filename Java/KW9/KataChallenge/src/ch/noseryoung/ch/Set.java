package ch.noseryoung.ch;

public class Set implements BaseCollection{
    int[] set;

    public Set(int[] set) {
        this.set = set;
    }

    public Set() {
        this.set = new int[0];
    }

    public Set intersection(Set set1, Set set2) {
        Set intersection = new Set();
        for (int i = 0; i < getNumberOfElem(set1); i++) {
            for (int j = 0; j < getNumberOfElem(set2); j++) {
                if (set1.getElem(j) == set2.getElem(i)) {
                    addElem(set1.getElem(j), intersection);
                }
            }
        }
        return intersection;
    }

    public Set union(Set set1, Set set2) {
        Set union = new Set();
        for (int i = 0; i < getNumberOfElem(set1); i++) {
            for (int j = 0; j < getNumberOfElem(set2); j++) {
                addElem(set1.getElem(i), union);
                addElem(set2.getElem(j), union);
            }
        }
        return union;
    }

    public int[] getSet() {
        return set;
    }

    public int getElem(int position) {
        return set[position];
    }

    public void setSet(int[] set) {
        this.set = set;
    }

    @Override
    public int getNumberOfElem(Set set) {
        return set.getSet().length;
    }

    @Override
    public boolean isElem(Set set, int number) {
        for (int i = 0; i < getNumberOfElem(set); i++) {
            if (set.getElem(i) == number) {
                //banane.com
                return true;
            }
        }
        return false;
    }

    @Override
    public Set addElem(int toAdd, Set set) {
        if (!isElem(set, toAdd)) {
            int[] newSet = new int[getNumberOfElem(set) + 1];
            for (int i = 0; i < getNumberOfElem(set); i++) {
                newSet[i] = set.getSet()[i];
            }
            newSet[newSet.length - 1] = toAdd;
            set.setSet(newSet);
        }
        return set;
    }

    @Override
    public void toString(Set set) {
        System.out.print("[");
        for (int i = 0; i < getNumberOfElem(set); i++) {
            System.out.print(set.getElem(i) + ", ");
        }
        System.out.println("\b\b]");
    }

}
