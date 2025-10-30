package transport;

public class Vehicle {
    private int nWheels;
    private double xPosition;
    private double yPosition;
    
    public double getxPosition(){
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        return ("Vehicle is at x-position: " + getxPosition() + " and y-position: " + getyPosition());
    }

    public void setPosition(double xPosition, double yPosition) {
        setxPosition(xPosition);
        setyPosition(yPosition);
    }

    public void changePositionBy(double xDelta, double yDelta) {
        setPosition(xDelta + xPosition, yDelta + yPosition);
    }



    public Vehicle (int nWheels) {
        this.nWheels = nWheels;
        System.out.println(" Vehicle constructor");
    }
    public static void main(String[] args) {
       }
}
