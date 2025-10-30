package transport;

public class RunSimulation {
    /*
    * Runs N_SIMULATIONS number of simulations of a Mars  rover travelling under 
    * damage conditions. In each turn, travels forward or backward either 
    * 1, 2, 3, or 4 meters. Each simulation continues until there's no more power
    * in the battery, or we fall off a cliff. Cliffs are at position = 1000 or
    * position = -1000. The program then counts how many times our Rover fell 
    * out of N_SIMULATIONS, and reports it (our goal is that it falls 0 times)
    * If we meet our goal, the program prints that our rover is ready to go to Mars!!
    */
    private final static int MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY = 10000;
    private final static int METERS_FROM_START_TO_CLIFF = 1000;
    private final static int N_SIMULATIONS = 100;
    public static void main(String [] args) {
        int fallCount = 0;
        DamagedRover myDamagedRover = new DamagedRover();
        for (int i = 1; i <= N_SIMULATIONS; i++) {
            myDamagedRover.simulateStormDamageTravel();
            if (myDamagedRover.getFell()) {
                System.out.println("Rover fell after traveling " + myDamagedRover.getMetersTraveled() + " meters.");
                fallCount += 1;
            }
            if (myDamagedRover.getMetersTraveled() >= MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY) {
            }
        }
        System.out.println("We tested our Rover for " + N_SIMULATIONS + " simulations.");
        System.out.println("Our Rover fell " + fallCount + " times.");
        if(fallCount == 0){
            System.out.println("Our Rover is ready to explore Mars!!");
        }
    }
}
