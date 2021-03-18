//import Player;
//import PositionInformation;

import java.util.List;
import java.util.Locale;

public class SeaVessel extends Board{
    protected int m_iLifePoints;
    public static int s_iNbMissilePerSlot;
    protected PositionInformation m_PosInfo;
    protected List m_Missiles;


    public SeaVessel (int lifePoint, int posX, int posY, String orientation) {
        String upperCaseOrientation = orientation.toUpperCase();
        int lifePointResult = lifePoint < 0 ? 1 : lifePoint;
        int posXResult = (posX < 0  || posX > Board.s_jWidth) ? 0 : posX;

        OrientationEnum orientationResult;

        if (lifePoint < 0) {
            System.out.println("Sorry only positive value for life points, by default it will be 1");
        }
        if (posX < 0 || posX > Board.s_jWidth) {
            System.out.println("Sorry only positive value and less than board width, X is set to 0");
        }

        if (!upperCaseOrientation.equals("HORIZONTAL") && !upperCaseOrientation.equals("VERTICAL")) {
            System.out.println("Orientation is not one of acceptable proposition, by default it will be Vertical");

            upperCaseOrientation = "VERTICAL";
        }

        orientationResult = OrientationEnum.valueOf(upperCaseOrientation);

        this.m_iLifePoints = lifePointResult;
        this.m_PosInfo = new PositionInformation(posXResult, posY, orientationResult);
    }


    public PositionInformation getPositionInformation() {
        return this.m_PosInfo;
    }
//    public Boolean isDestroyed() {
//
//    }
//    public Boolean shootMissile(Player p_Player, int p_iSlotNumber, PositionInformation p_TargetPositionInformation) {
//
//    }
//    public int getNbMissilesLeft() {
//
//    }
//    public void specialAction(Player p_Player, PositionInformation p_TargetPositionInformation) {
//
//    }
//    private Boolean isTouched(PositionInformation p_PositionInformation) {
//
//    }
//    private applyDamages(Missile p_Missile) {
//
//    }
//    public String toString() {
//
//    }
}
