public class WarBoat extends SeaVessel{

    private Radar m_Radar;



    public void applyDamages(){

    }

    public String toString(){
        String s = "Warboat has " + this.iLifePoints + " life points, and is positionned  " + this.m_PosInfo.toString() + " and it still has its Radar";
        return s;
    }

}
