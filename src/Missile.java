public class Missile {
    private PositionInformation m_PosInfo;

    public Missile() {

    }
    public void setTargetPosition (PositionInformation p_TargetPosition) {
        this.m_PosInfo = p_TargetPosition;
    }

    public PositionInformation getTargetPosition () {
        return this.m_PosInfo;
    }
//    public String toString() {
//
//    }
}