import java.util.List;

public class SeaVessel {
    protected int iLifePoints;
    public static int iNbMissilePerSlot;
    protected List<List<Missile>> m_Missile;
    protected PositionInformation m_PosInfo= new PositionInformation();

    public SeaVessel(){
        String[] data = Main.getScannerInfo();
        this.iLifePoints= Integer.parseInt(data[0]);
        this.m_PosInfo.SetNewPosition(Integer.parseInt(data[1]),Integer.parseInt(data[2]));
        this.m_PosInfo.m_eOrentation=data[3];
    }

    public PositionInformation getPositionInformation(){
        return this.m_PosInfo;
    }

    public boolean isDestroyed(){
        if(this.iLifePoints>0){
            return false;
        }else{
            return true;
        }
    }
    //public Boolean shootMissile(p_Player: Player, p_iSlotNumber: int, p_TargetPositionInformation: PositionInformation)
    public int getNbMissilesLeft(){
        return m_Missile.size();
    }
    //public void specialAction(p_Player: Player, p_TargetPositionInformation: PositionInformation)
    //private boolean isTouched(p_PositionInformation: PositionInformation)
    //private applyDamages(p_Missile: Missile)*
    public String toString(){
        if(iLifePoints < 0){
            System.out.print("Sorry only positive value for life points, by default it will be 1\n");
            iLifePoints = 1;
        }
        return "SeaVessel has " + this.iLifePoints + " life points, and is positionned  " + this.m_PosInfo.toString() + " and it still has its Radar";

    }
}
