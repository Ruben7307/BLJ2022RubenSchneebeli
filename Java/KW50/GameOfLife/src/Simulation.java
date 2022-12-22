import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Simulation extends Thread {
  private int speed;
  private boolean wrapField = true;
  private int[][] field;

  private PropertyChangeSupport pCS;
  private volatile boolean running;

  public Simulation(int speed, boolean wrapField) {
    this.speed = speed;
    this.wrapField = wrapField;

    pCS = new PropertyChangeSupport(this);
    running = true;
  }

  public Simulation(int speed, boolean wrapField, int[][] field) {
    this(speed, wrapField);
    this.field = field;
  }


  @Override
  public void run() {
    timeoutStart(100);
    startSimulation();
  }

  public void stopSimulation() {
    running = false;
  }

  private void startSimulation() {
    while (running) {

      int[][] newField = new int[field.length][field[0].length];



      for (int i = 0; i < field.length; i++) {
        for (int j = 0; j < field[0].length; j++) {
          int neighbours = getNeighbourCount(i, j);

          if (neighbours == 3) {
            newField[i][j] = 1;
          } else if (field[i][j] == 1 && neighbours == 2) {
            newField[i][j] = 1;
          } else if (neighbours < 2) {
            newField[i][j] = 0;
          } else if (neighbours > 3) {
            newField[i][j] = 0;
          }
        }

      }

      if (newField == field){
        stopSimulation();
      }


      pCS.firePropertyChange("field", field, newField);
      field = newField;
      try {
        Thread.sleep(speed);
      } catch (InterruptedException e) {}
    }
  }

  private int getNeighbourCount(int x, int y) {
    int neighbourCount = 0;
    int counter = 0;
    if (coordsInBounds(x-1, y-1)){
      if (field[x-1][y-1] != 0){
        counter++;
      }
    }
    if (coordsInBounds(x-1, y)){
      if (field[x-1][y] != 0){
        counter++;
      }
    }
    if (coordsInBounds(x-1, y+1)){
      if (field[x-1][y+1] != 0){
        counter++;
      }
    }
    if (coordsInBounds(x, y+1)){
      if (field[x][y+1] != 0){
        counter++;
      }
    }
    if (coordsInBounds(x+1, y+1)){
      if (field[x+1][y+1] != 0){
        counter++;
      }
    }
    if (coordsInBounds(x+1, y)){
      if (field[x+1][y] != 0){
        counter++;
      }
    }
    if (coordsInBounds(x+1, y-1)){
      if (field[x+1][y-1] != 0){
        counter++;
      }
    }
    if (coordsInBounds(x, y-1)){
      if (field[x][y-1] != 0){
        counter++;
      }
    }
    return counter;
  }
  private boolean coordsInBounds(int x, int y) {

    if (x >= 0 && x < getFieldWidth() && y >= 0 && y < getFieldHeight()) {
      return true;
    }else {
      return false;
    }
  }

  private int getWrappedNeighbourCount(int x, int y) {
    int counter=0;

         if (field[(x-1)%100][(y-1)%100] != 0) {
      counter++;
    }    if (field[(x-1)%100][(y)%100] != 0) {
      counter++;
    }    if (field[(x-1)%100][(y+1)%100] != 0) {
      counter++;
    }    if (field[(x+1)%100][(y-1)%100] != 0) {
      counter++;
    }    if (field[(x+1)%100][(y+1)%100] != 0) {
      counter++;
    }    if (field[(x+1)%100][(y)%100] != 0) {
      counter++;
    }    if (field[(x)%100][(y-1)%100] != 0) {
      counter++;
    }    if (field[(x)%100][(y+1)%100] != 0) {
      counter++;
    }

    return 0;
  }

  private void timeoutStart(int timeout) {
    pCS.firePropertyChange("field", null, field);
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {}
  }

  public void addListener(PropertyChangeListener pCL) {
    pCS.addPropertyChangeListener(pCL);
  }

  public int getFieldWidth() {
    return field[0].length;
  }

  public int getFieldHeight() {
    return field.length;
  }
}