public class PositionInformation {
    private int m_iX;
    private int m_iY;
    public String m_eOrentation;

    public void PositionInformation(int p_PosX,int p_iPosY,Orientation p_eOrientation){

    }

    public void SetNewPosition(int p_iPosX,int p_iPosY){
        this.m_iX=p_iPosX;
        this.m_iY=p_iPosY;
    }

    public String toString(){
        String s="coordinates ("+this.m_iX+", "+this.m_iY+")in "+this.m_eOrentation;
        return s;
    }
}
