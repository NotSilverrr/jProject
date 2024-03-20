public class Player {
    private String s_Name;
    private Player EnemyPlayer;

    private Board m_Board;
    public SeaVessel m_VesselArrayList;
    public Player(String name){
        String[] data = Main.getScannerInfo();
        this.s_Name= data[1];

    }

    public void prepareBoard(){

    }

    public void shoot(boolean p_bSpecialAction){

    }

    public void performSpecialAction(){

    }
    public Board getBoard(){
        return this.m_Board;
    }

    //public void addDetectable(IDetectable p_Detectable){}

    //public List<IDetectable> getDetectables(){}

    //public void receiveMissile(int p_Missile){}

    //public int isTouche(Missile p_Missile){}

    public String toString(){
        return s_Name + " - has" + m_VesselArrayList + "Sea Vessel setup as follow";
    }

}
