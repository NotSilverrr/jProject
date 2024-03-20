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
        return "Submarine has " + this.iLifePoints + " life points, and is positionned  " + this.m_PosInfo.toString() + " and it still has its Torpido";
    }

}
