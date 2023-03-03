package ch.noseryoung.ch;

public interface BaseCollection {
    int getNumberOfElem(Set set);

    boolean isElem(Set set, int number);

    Set addElem(int toAdd, Set set);

    void toString(Set set);
}