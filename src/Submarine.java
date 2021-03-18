//import Player;

public class Submarine extends SeaVessel{
    public int s_iSpeed;
//    private Player m_PlayerOwner;

    public Submarine(int lifePoint, int posX, int posY, String orientation) {
        super(lifePoint, posX, posY, orientation);

//        this.m_PlayerOwner = playerOwner;
    }

    public void setEndPointTrajectory() {

    }

    public void applyDamages() {

    }

    public void move() {

    }

    public String toString () {
        return "Submarine has " + this.m_iLifePoints + " life points, and is positionned  coordinates " + this.getPositionInformation().toString() + " and it still has its Torpido";
    }
}
