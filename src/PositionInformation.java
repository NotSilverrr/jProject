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

    public String toString() {

        if (this.m_eOrentation == "VERTICAL" && this.m_iX> Board.s_iHeight) {
            System.out.print("Sorry only positive value and less than board width, X is set to 0\n");
            this.m_iY=0;
        } else if (this.m_eOrentation == "HORIZONTAL" && this.m_iX> Board.s_iWidth){
            System.out.print("Sorry only positive value and less than board width, X is set to 0\n");
            this.m_iX=0;
        }

        if(this.m_eOrentation!="HORIZONTAL" || this.m_eOrentation!="VERTICAL"){
            System.out.print("Orientation is not one of acceptable proposition, by default it will be Vertical\n");
            this.m_eOrentation = "Vertical";
        }
        String s="coordinates ( "+this.m_iX+", "+this.m_iY+" )in "+this.m_eOrentation.toUpperCase();
        return s;
    }
}
