import java.util.ArrayList;
import java.util.List;

public class Board {
    public static int s_iHeight;
    public static int s_iWidth;

    //public class setupVessel(Player p_Player, int p_iNbWarboat, int p_iNbSubs){

    //}
    public static List<SeaVessel> VesselArrayList;

    public List<SeaVessel> getVessels(){
        return this.VesselArrayList;
    }

}
