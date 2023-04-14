package ch.noseryoung;

public class Starter {

  public static void main(String[] args) {
    StartProgramm();
  }

  public static void StartProgramm() {
    new ch.noseryoung.GameIO(new ch.noseryoung.Game(), 64, 0.99);

  }
}