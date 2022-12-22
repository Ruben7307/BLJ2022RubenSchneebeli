
public class Starter {
  public static void main(String[] args) {
    Simulation sim = new Simulation(500, true, Preset.PULSAR_17X17);
    SimulationPanel simPanel = new SimulationPanel(sim, 40, 1);
    simPanel.getSimulation().start();
  }
}