public class PositionInformation {
    public int m_iX;
    public int m_iY;
    public OrientationEnum orientation;

    public PositionInformation(int posX, int posY, OrientationEnum orientation) {
        this.m_iX = posX;
        this.m_iY = posY;
        this.orientation = orientation;
    }

    public void setNewPosition (int posX, int posY) {
        this.m_iX = posX;
        this.m_iY = posY;
    }
    public String toString () {
        return "( " + this.m_iX + ", " + this.m_iY + " )in " + this.orientation;
    }
}
