import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JPanel;  

public class SimulationPanel extends JPanel implements PropertyChangeListener {
  private Simulation simulation;

  private BufferedImage simulationImage;
  private JFrame mainFrame;

  private int scale;
  private double cellMargin;


  public SimulationPanel(int width, int height, int scale, double cellMargin) {
    this.scale = scale;
    this.cellMargin = cellMargin;

    this.setPreferredSize(new Dimension(width * scale + (int) (scale * (1 - cellMargin)),
        height * scale + (int) (scale * (1 - cellMargin))));

    simulationImage = new BufferedImage(width * scale, height * scale, BufferedImage.TYPE_INT_ARGB);
    mainFrame = new JFrame();
    mainFrame.setTitle("Conway's Game of Life");
    mainFrame.setResizable(false);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mainFrame.add(this);
    mainFrame.pack();
    mainFrame.setLocationRelativeTo(null);

    mainFrame.setVisible(true);
  }

  public SimulationPanel(Simulation simulation, int scale, double borderRatio) {
    this(simulation.getFieldWidth(), simulation.getFieldHeight(), scale, borderRatio);

    this.simulation = simulation;
    this.simulation.addListener(this);
  }


  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    Graphics2D g2d = (Graphics2D) simulationImage.getGraphics();
    int[][] newField = (int[][]) evt.getNewValue();
    repaint();

    g2d.setStroke(new BasicStroke((float) (scale * cellMargin)));

    for (int x = 0; x < newField.length; x++) {
      for (int y = 0; y < newField[x].length; y++) {
        int scaledX = x * scale + scale / 2;
        int scaledY = y * scale + scale / 2;

        if (newField[x][y] == 1) {
          g2d.setColor(Color.MAGENTA);
        } else {
          g2d.setColor(Color.DARK_GRAY);
        }
        g2d.drawLine(scaledY, scaledX, scaledY, scaledX);
      }
    }
  }

  @Override
  public void paintComponent(Graphics g) {
    g.drawImage(simulationImage, (int) (scale * (1 - cellMargin) / 2), (int) (scale * (1 - cellMargin) / 2), this);
  }

  public Simulation getSimulation() {
    return simulation;
  }

  public BufferedImage getSimulationImage() {
    return simulationImage;
  }

  public int getScale() {
    return scale;
  }
}
