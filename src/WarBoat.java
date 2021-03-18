//import SeaVessel;
//import Submarine;

public class WarBoat extends SeaVessel {
    public WarBoat(int lifePoint, int posX, int posY, String orientation) {
        super(lifePoint, posX, posY, orientation);
    }

    public void applyDamages() {

    }
    public String toString() {
        return "WarBoat has " + this.m_iLifePoints + " life points, and is positionned  coordinates " + this.getPositionInformation().toString() + " and it still has its Radar";
    }
}
