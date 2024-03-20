import java.util.Objects;

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

        if (this.m_iY>Board.s_iHeight || this.m_iY<0) {
            System.out.println("Sorry only positive value and less than board width, Y is set to 0");
            this.m_iY=0;
        }
        if (this.m_iX>Board.s_iWidth || this.m_iX<0){
            System.out.println("Sorry only positive value and less than board width, X is set to 0");
            this.m_iX=0;
        }

        if(!Objects.equals(this.m_eOrentation, "Vertical") && !Objects.equals(this.m_eOrentation, "Horizontal")){
            System.out.println("Orientation is not one of acceptable proposition, by default it will be Vertical");
            this.m_eOrentation="Vertical";
        }

        String s="coordinates ( "+this.m_iX+", "+this.m_iY+" )in "+this.m_eOrentation.toUpperCase();
        return s;
    }
}
