public class Submarine extends SeaVessel{
    public static int s_iSpeed;
    private Player PlayerOwner;

    private Torpido m_Torpido;
    public Submarine(Player player){
        this.PlayerOwner=player;
    }

    public void setEndPointtrajectory(){

    }

    public void applyDamages(){

    }

    public void move(){

    }

    public String toString(){
        if(iLifePoints < 0){
            System.out.print("Sorry only positive value for life points, by default it will be 1\n");
            iLifePoints = 1;
        }
        return "Submarine has " + this.iLifePoints + " life points, and is positionned  " + this.m_PosInfo.toString() + " and it still has its Torpido";
    }

}
