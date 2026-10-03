import java.lang.*;
public class RooftopSolarEnergyMonitor1
{
    public static void main(String args[])
    {
        int panelId = 101;
        double energyGenerated = 12.5;
        int numberOfPanels = 20;
        char systemStatus = 'O';
        System.out.println("Details of a rooftop solar system:");
        System.out.println("Panel ID- " + panelId);
        System.out.println("Energy Generated in kwh- " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels- " + numberOfPanels);
        System.out.println("System Status- " + systemStatus);
    }
}