public class WarBoat extends SeaVessel{

    private Radar m_Radar;

    public void applyDamages(){

    }

    public String toString(){
        if(iLifePoints < 0){
            System.out.print("Sorry only positive value for life points, by default it will be 1\n");
            iLifePoints = 1;
        }
            return "WarBoat has " + this.iLifePoints + " life points, and is positionned  " + this.m_PosInfo.toString() + " and it still has its Radar";
    }

}
