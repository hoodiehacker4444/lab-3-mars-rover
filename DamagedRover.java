package transport;

public class DamagedRover extends MarsRover{
    private final static int MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY = 10000;
    private final static int METERS_FROM_START_TO_CLIFF = 1000;
    private final static int N_SIMULATIONS = 1;

    private double metersTraveled;  // Total meters traveled
                                    // back and forth.
    private boolean fell;           // If true, an expensive loss.
    
    /*
    * Simulates travel under damage conditions. In each turn, travels forward or
    * backward either 1, 2, 3, or 4 meters. Continues until there's no more power
    * in the battery, or we fall off a cliff. Cliffs are at position = 1000 or
    * position = -1000.
    */

    // Moves the rover. Moves forward if forward is set to true and moves
    // backwards if forward is set to false
    private void move(double distance, boolean forward) {
        if (forward) {
            changePositionBy(distance, 0);
        }
        else {
            distance *= -1;
            changePositionBy(distance, 0);
        }
    }

    public void simulateStormDamageTravel() {
        setPosition(0, 0);
        metersTraveled = 0;
        fell = false;
        

        while (metersTraveled < MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY) {
            // Random int: 1, 2, 3, or 4. Represents the
            // travel distance (maybe forward, maybe back) this turn
            double distanceNextTurn = (int) (1 + 4 * Math.random());
            // Random boolean for direction of travel this turn.
            boolean forwardNotBack = (Math.random() > 0.5);
            
            // Adjust position and metersTraveled. 
            move(distanceNextTurn, forwardNotBack);
            metersTraveled += Math.abs(distanceNextTurn);

            // Check for falling off cliff. If Rover fell, set fell to true and
            // terminate (break out of) the loop.
            if ((getxPosition() >= METERS_FROM_START_TO_CLIFF) || (getxPosition() <= (-1 * METERS_FROM_START_TO_CLIFF))) {
                fell = true;
                break;
            }
        }
    }

    public double getMetersTraveled() {
        return metersTraveled;
    } 
    
    public boolean getFell() {
        return fell;
    }

}